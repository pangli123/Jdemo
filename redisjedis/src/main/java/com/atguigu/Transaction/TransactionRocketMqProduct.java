package com.atguigu.Transaction;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

public class TransactionRocketMqProduct {
    public static void main(String[] args) throws MQClientException {
        //事务消息生产者
        TransactionMQProducer producer=new TransactionMQProducer("group2");
        producer.setNamesrvAddr("localhost:9876");
        producer.setTransactionListener(new TransactionListener() {
            public LocalTransactionState executeLocalTransaction(Message message, Object o) {
                System.out.println("执行正常事务过程");
                return LocalTransactionState.UNKNOW;
            }

            public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
                System.out.println("事务补偿");
                return LocalTransactionState.COMMIT_MESSAGE;
            }
        });
        producer.start();
        String mes="hello world rockemq Transaction";
        Message message=new Message("topic1","tag1",mes.getBytes()) ;
        SendResult send = producer.sendMessageInTransaction(message,null);
        System.out.println(send);
    }
}
