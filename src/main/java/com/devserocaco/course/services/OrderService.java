package com.devserocaco.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devserocaco.course.entities.Order;
import com.devserocaco.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> FindAll() {
		return repository.findAll();
	}
	
	public Order findiById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
