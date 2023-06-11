package com.devserocaco.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devserocaco.course.entities.Category;
import com.devserocaco.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> FindAll() {
		return repository.findAll();
	}
	
	public Category findiById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
