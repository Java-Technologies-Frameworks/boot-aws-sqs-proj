package com.jtf.boot.aws.sqs.config;


import io.awspring.cloud.sqs.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiverService {

    Logger logger = LoggerFactory.getLogger(MessageReceiverService.class);
    @SqsListener("jtf-queue")
    public void readMessage(String message) {

        logger.info("Message from AWS SQS Queue consumed  :" + message);
    }
}
