package com.practise.demo.api.task.dto;

import java.util.UUID;

public class DtoGetTaskResponse {
    private UUID id;
    private String name;
    private boolean isDone;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
