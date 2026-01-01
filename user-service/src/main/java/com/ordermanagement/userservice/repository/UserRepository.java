package com.ordermanagement.userservice.repository;

import com.ordermanagement.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
