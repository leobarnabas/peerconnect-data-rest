package org.pcg.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.pcg.model.Task;
import org.pcg.model.User;
import org.pcg.repository.TaskRepository;
import org.pcg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Leo on 10/1/2017.
 */
@RestController
@RequestMapping(value = "/task")
@Api(value = "Task", description = "Task information")
public class TaskController {
    @Autowired
    TaskRepository taskRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Adds a new task", notes = "Returns inserted task")
    Task addTask(@RequestBody @Valid Task task) {
        return taskRepository.insert(task);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Updates a task", notes = "Returns updated task")
    Task updateTask(@RequestBody @Valid Task task) {
        return taskRepository.save(task);
    }

    @RequestMapping(value = "/{mentorId}", method = RequestMethod.GET)
    @ApiOperation(value = "Get tasks by mentor id", notes = "Returns all the tasks with matching mentor id")
    List<Task> findByMentorId(@RequestParam String mentorId) {
        return taskRepository.findByMentorId(mentorId);
    }

    @RequestMapping(value = "/{menteeId}", method = RequestMethod.GET)
    @ApiOperation(value = "Get tasks by mentee id", notes = "Returns all the tasks with matching mentee id")
    List<Task> findByMenteeId(@RequestParam String menteeId) {
        return taskRepository.findByMenteeId(menteeId);
    }
}
