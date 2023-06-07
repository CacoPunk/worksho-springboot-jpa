package com.devserocaco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devserocaco.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
