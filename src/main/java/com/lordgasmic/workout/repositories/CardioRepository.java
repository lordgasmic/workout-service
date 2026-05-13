package com.lordgasmic.workout.repositories;

import com.lordgasmic.workout.entities.CardioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardioRepository extends JpaRepository<CardioEntity, UUID> {
}
