package com.practise.demo.api.task;

import com.practise.demo.api.task.dto.DtoCreateTaskRequest;
import com.practise.demo.api.task.dto.DtoCreateTaskResponse;
import com.practise.demo.api.task.dto.DtoGetTaskResponse;
import com.practise.demo.domain.DbTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    private IdGenerator idGenerator;

    private Map<UUID, DbTask> tasks = new HashMap<>();

    public TaskServiceImpl() {

    }

    @Autowired
    public TaskServiceImpl(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public DtoCreateTaskResponse createTask(DtoCreateTaskRequest body) {
        DbTask task = new DbTask();
        task.setId(idGenerator.generate());
        task.setName(body.getName());
        task.setDone(false);
        tasks.put(task.getId(), task);

        return taskMapper.toDtoCreateTaskResponse(task);
    }

    @Override
    public List<DtoGetTaskResponse> getTasks() {
//        DbTask task = new DbTask();
//        task.setDone(false);
//        task.setName("DERP");
//        task.setId(UUID.randomUUID());
//        tasks.put(task.getId(), task);

        return tasks.values()
                .stream()
                .map(x -> taskMapper.toDtoGetTaskResponse(x))
                .collect(Collectors.toList());
    }
}
