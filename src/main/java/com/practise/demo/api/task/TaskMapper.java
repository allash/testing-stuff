package com.practise.demo.api.task;

import com.practise.demo.api.task.dto.DtoCreateTaskResponse;
import com.practise.demo.api.task.dto.DtoGetTaskResponse;
import com.practise.demo.domain.DbTask;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public DtoCreateTaskResponse toDtoCreateTaskResponse(DbTask task) {
        DtoCreateTaskResponse response = new DtoCreateTaskResponse();
        response.setId(task.getId());
        response.setName(task.getName());
        return response;
    }

    public DtoGetTaskResponse toDtoGetTaskResponse(DbTask task) {
        DtoGetTaskResponse response = new DtoGetTaskResponse();
        response.setId(task.getId());
        response.setName(task.getName());
        return response;
    }
}
