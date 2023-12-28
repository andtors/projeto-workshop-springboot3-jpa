package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{ //tipo da identidade(classe) e o tipo do id dela(Long, Integer, Double etc...)
													
	
	

}
