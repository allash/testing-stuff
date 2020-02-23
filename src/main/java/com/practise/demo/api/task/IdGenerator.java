package com.practise.demo.api.task;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class IdGenerator {
    public UUID generate() {
        return UUID.randomUUID();
    }
}
