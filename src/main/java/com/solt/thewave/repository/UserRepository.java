package com.solt.thewave.repository;

import com.solt.thewave.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	
    Users findByUsername(String username);

}
