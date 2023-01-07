package com.intermittent.fasting.start.repository;

import com.intermittent.fasting.start.models.Hunger;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author danilova.tatyana 07.01.2023
 */
public interface HungerRepository extends JpaRepository<Hunger, Long> {
}
