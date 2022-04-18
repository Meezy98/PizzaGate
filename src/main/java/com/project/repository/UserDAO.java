package com.project.repository;

import com.project.models.dto.UserCredsDTO;
import com.project.models.unique.UserCreds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("UserDAO")
public interface UserDAO extends JpaRepository<UserCreds, Integer> {
    @Query(value = "FROM UserCreds u WHERE u.userName = ?1 AND u.password = ?2")
    Optional<UserCreds>validateUser(String name, String pass);

}
