package com.orange.springtask.task_management_system.controller;

import com.orange.springtask.task_management_system.service.TaskService;
import com.orange.springtask.task_management_system.service.dto.request.TaskRequest;
import com.orange.springtask.task_management_system.service.dto.request.TaskRequestUpdate;
import com.orange.springtask.task_management_system.service.dto.response.TaskResponse;
import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/")
    public ResponseEntity<String> greeting() {
        return new ResponseEntity<>("Welcome to Task Management System", HttpStatus.OK);
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskResponse>> getTasksByUser_IdOrStatus(@RequestParam(name = "status", required = false) String status) {
        try{
            return new ResponseEntity<>(
                    taskService.getAllTasks(status),
                    HttpStatus.OK
            );
        }
        catch (ObjectNotFoundException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/task")
    public ResponseEntity<TaskResponse> getTaskByUser_IdAndTitle(@RequestParam(name = "title") String title) {
        try{
            return new ResponseEntity<>(
                    taskService.getTaskByTitle(title),
                    HttpStatus.OK
            );
        }
        catch (ObjectNotFoundException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/task")
    public ResponseEntity<TaskResponse> addTask(@RequestBody TaskRequest taskRequest) {
        try{
            return new ResponseEntity<>(taskService.createTask(taskRequest)
                    , HttpStatus.CREATED);
        }
        catch(ObjectNotFoundException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/task")
    public ResponseEntity<TaskResponse> updateTask(@RequestBody TaskRequestUpdate taskRequestUpdate) {
        try{
            return new ResponseEntity<>(taskService.updateTask(taskRequestUpdate)
                    , HttpStatus.OK);
        }
        catch(ObjectNotFoundException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/task/{task_id}")
    public ResponseEntity<String> deleteTaskById(@PathVariable Long task_id) {
        try{
            taskService.deleteTaskById(task_id);
            return new ResponseEntity<>(
                    "Task with ID: "+ task_id+ " is deleted successfully",
                    HttpStatus.NO_CONTENT
            );
        }
        catch(ObjectNotFoundException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
