package com.practise.demo.api.task;

import com.practise.demo.api.task.dto.DtoCreateTaskRequest;
import com.practise.demo.api.task.dto.DtoCreateTaskResponse;
import com.practise.demo.api.task.dto.DtoGetTaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller("/tasks")
public class TaskController {

    private static final String TASK_MAIN_PAGE = "task_main";
    private static final String TASK_VIEW_PAGE = "task_view";
    private static final String ERROR_PAGE = "error";

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ModelAndView getTasks() {
        List<DtoGetTaskResponse> tasks = taskService.getTasks();
        ModelAndView model = new ModelAndView("task_main", "task", new DtoCreateTaskRequest());
        model.addObject("tasks", tasks);
        model.addObject("derp", "derp");
        return model;
    }

    @PostMapping
    public String createTask(
            @Valid @ModelAttribute("task") DtoCreateTaskRequest body,
            BindingResult bindingResult,
            ModelMap model) {

        if (bindingResult.hasErrors()) {
            model.put("error", "some error");
            return ERROR_PAGE;
        }

        DtoCreateTaskResponse response = taskService.createTask(body);

        model.put("id", response.getId());
        model.put("name", response.getName());

        return TASK_VIEW_PAGE;
    }
}
