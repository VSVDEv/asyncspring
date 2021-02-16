package com.vsvdev.asyncspring.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

@Async("threadPool")
public CompletableFuture<Integer> doAsync(){
    System.out.println("method start");
    try {
        Thread.sleep(1000L);
    }catch (InterruptedException e){e.printStackTrace();}
    System.out.println("Hello!!!");
    System.out.println("Method end");
    return CompletableFuture.completedFuture(1);
}
}
