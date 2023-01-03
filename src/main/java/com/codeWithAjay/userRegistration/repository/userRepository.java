package com.codeWithAjay.userRegistration.repository;

import com.codeWithAjay.userRegistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
}
