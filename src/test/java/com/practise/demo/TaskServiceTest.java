package com.practise.demo;

import com.practise.demo.api.task.IdGenerator;
import com.practise.demo.api.task.TaskService;
import com.practise.demo.api.task.TaskServiceImpl;
import com.practise.demo.api.task.dto.DtoCreateTaskRequest;
import com.practise.demo.api.task.dto.DtoCreateTaskResponse;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Mock
    private IdGenerator idGenerator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        taskService = new TaskServiceImpl(idGenerator);
    }

    @Test
    void canGetTaskId() {
        UUID id = UUID.randomUUID();
        Mockito.when(idGenerator.generate()).thenReturn(id);
        String name = UUID.randomUUID().toString();
        DtoCreateTaskRequest request = new DtoCreateTaskRequest();
        request.setName(name);
        DtoCreateTaskResponse response = taskService.createTask(request);
        assertEquals(name, response.getName());
        assertEquals(id, response.getId());
    }

}
