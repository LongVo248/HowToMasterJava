package com.example.springbootjpamysql.Repository;

import com.example.springbootjpamysql.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
