package com.example.user_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user_service.entity.user;

public interface UserRepository extends JpaRepository<user, Long>{
    List<user> findbyid(Long id);

}
