package com.example.form_sign_up.repository;

import com.example.form_sign_up.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {

}
