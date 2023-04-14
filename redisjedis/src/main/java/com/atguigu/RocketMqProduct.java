package com.atguigu;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class RocketMqProduct {
    public static void main(String[] args) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        //普通消息生产者
        DefaultMQProducer producer=new DefaultMQProducer("group1");
        producer.setNamesrvAddr("localhost:9876");

        producer.start();
        String mes="hello world rockemq";
        Message message=new Message("topic1","tag1",mes.getBytes()) ;
        SendResult send = producer.send(message);
        System.out.println(send);
        producer.shutdown();
    }
}
