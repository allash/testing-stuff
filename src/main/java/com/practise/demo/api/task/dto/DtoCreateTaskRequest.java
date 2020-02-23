package com.practise.demo.api.task.dto;

import javax.validation.constraints.NotBlank;

public class DtoCreateTaskRequest {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
