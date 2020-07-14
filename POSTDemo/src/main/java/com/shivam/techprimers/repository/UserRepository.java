package com.shivam.techprimers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.techprimers.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
