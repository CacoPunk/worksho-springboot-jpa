package com.devserocaco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devserocaco.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
