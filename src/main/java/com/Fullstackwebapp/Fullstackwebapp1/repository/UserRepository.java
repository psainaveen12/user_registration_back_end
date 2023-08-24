package com.Fullstackwebapp.Fullstackwebapp1.repository;

import com.Fullstackwebapp.Fullstackwebapp1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
