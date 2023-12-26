package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ //tipo da identidade(classe) e o tipo do id dela(Long, Integer, Double etc...)
													
	
	

}
