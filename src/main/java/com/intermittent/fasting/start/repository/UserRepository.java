package com.intermittent.fasting.start.repository;

import com.intermittent.fasting.start.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author danilova.tatyana 07.01.2023
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
