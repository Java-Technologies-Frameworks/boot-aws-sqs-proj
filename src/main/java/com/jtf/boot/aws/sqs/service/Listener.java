package com.jtf.boot.aws.sqs.service;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;


public class Listener {

    @SqsListener("jtf-queue")
    public void listen(String message) {
        System.out.println(message);
    }
}
