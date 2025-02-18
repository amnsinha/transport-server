package com.transport.repository;

import com.transport.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here if needed, for example:
    User findByEmailId(String emailId);

    List<User> findByName(String name);
}
