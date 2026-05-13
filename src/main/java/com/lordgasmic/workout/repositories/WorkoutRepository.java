package com.lordgasmic.workout.repositories;

import com.lordgasmic.workout.entities.WorkoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<WorkoutEntity, Integer> {
}
