package com.example.springbootthymeleafmysqli18nwebdemo.model;

import org.thymeleaf.util.StringUtils;

import java.util.Optional;

public class TodoValidator {

    public boolean isValid(Todo todo) {
        return Optional.ofNullable(todo)
                .filter(t -> !StringUtils.isEmpty(t.getTitle())) // Kiểm tra title khác rỗng
                .filter(t -> !StringUtils.isEmpty(t.getDetail()))// Kiểm tra detail khác rỗng
                .isPresent();// Trả về true nếu hợp lệ, ngược lại false
    }
}
