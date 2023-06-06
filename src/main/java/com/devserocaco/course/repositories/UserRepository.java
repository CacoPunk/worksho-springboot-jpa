package com.devserocaco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devserocaco.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
