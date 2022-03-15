package com.project.repository;

import com.project.models.unique.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaDAO extends JpaRepository<Pizza, Integer> {
}
