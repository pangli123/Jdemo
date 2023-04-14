package com.atguigu.Transaction;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class TransactionRocketMqConsumer {
    public static void main(String[] args) throws MQClientException {
        //普通消息消费者
        DefaultMQPushConsumer consumer=new DefaultMQPushConsumer("group2");


        consumer.setNamesrvAddr("localhost:9876");
        consumer.subscribe("topic1","*");
        consumer.registerMessageListener(new MessageListenerConcurrently(){
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                    for(MessageExt msg:list){
                        System.out.println(msg);
                        byte[] body=msg.getBody();
                        System.out.println(new String(body));
                    }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
    }

}
