package com.practise.demo.api.task;

import com.practise.demo.api.task.dto.DtoCreateTaskRequest;
import com.practise.demo.api.task.dto.DtoCreateTaskResponse;
import com.practise.demo.api.task.dto.DtoGetTaskResponse;

import java.util.List;

public interface TaskService {
    List<DtoGetTaskResponse> getTasks();
    DtoCreateTaskResponse createTask(DtoCreateTaskRequest body);
}
