package com.vsvdev.asyncspring.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.Map;

@RestController
public class AsyncController {

    @GetMapping(path="/api/v1/task")
    public WebAsyncTask<Map<String, Object>> simpleAsyncTask(@RequestParam(defaultValue="5") long t) {
        return new WebAsyncTask<Map<String, Object>>(10000, () -> {
            Thread.sleep(t * 1000);
            return Collections.<String, Object>singletonMap("key", "success");
        });
    }
}