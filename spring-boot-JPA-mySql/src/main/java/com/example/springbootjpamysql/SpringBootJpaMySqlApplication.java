package com.example.springbootjpamysql;

import com.example.springbootjpamysql.Entities.User;
import com.example.springbootjpamysql.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJpaMySqlApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJpaMySqlApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);

        //get all user in database
        userRepository.findAll().forEach(System.out::println);

        //Save the user to the database
        User user = userRepository.save(new User());

        System.out.println("User vừa lưu có ID: " + user.getId());

        Long userId = user.getId();
        user.setAgi(100);
        userRepository.save(user);

        User user2 = userRepository.findById(userId).get();
        System.out.println("User: " + user);
        System.out.println("User2: " + user2);

        // Xóa User khỏi DB
        userRepository.delete(user);

        // In ra kiểm tra xem userId còn tồn tại trong DB không
        User user3 = userRepository.findById(userId).orElse(null);
        System.out.println("User3: " + user2);
    }

}
