package com.example.web_to_dothymeleaf;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@org.springframework.stereotype.Controller
public class Controller {

    List<Todo> todoList= new CopyOnWriteArrayList<>();

    @GetMapping("/listTodo")
    public String index(Model model, @RequestParam(value = "limit", required = false) Integer limit){
        model.addAttribute("todoList", limit!= null ? todoList.subList(0,limit) : todoList);
        return "listTodo";
    }

    @GetMapping(value = "/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @PostMapping(value = "/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {
        todoList.add(todo);
        return "success";
    }
}
