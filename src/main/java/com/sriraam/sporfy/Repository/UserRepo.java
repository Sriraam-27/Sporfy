package com.sriraam.sporfy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sriraam.sporfy.Entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
