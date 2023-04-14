package com.atguigu.one2many;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class RocketMqProduct {
    public static void main(String[] args) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        DefaultMQProducer producer=new DefaultMQProducer("group1");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
       /* for(int i=0;i<10;i++) {
            String mes="hello world rockemq_"+i;
            Message message=new Message("topic5","tag1",mes.getBytes()) ;
            SendResult send = producer.send(message);
            System.out.println(send);
        }*/
        for (int i = 0; i < 10; i++) {
            String mes="hello world rockemq_"+i;
            Message message=new Message("topic7","tag1",mes.getBytes()) ;
             producer.send(message, new SendCallback() {
                public void onSuccess(SendResult sendResult) {
                    System.out.println(sendResult);
                }
                public void onException(Throwable throwable) {
                    System.out.println(throwable);
                }
            });
            System.out.println("异步发生成功");
        }

        //producer.shutdown();
    }
}
