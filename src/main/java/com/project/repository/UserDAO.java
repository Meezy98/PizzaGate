package com.project.repository;

import com.project.models.unique.UserCreds;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserCreds, Integer> {
}
