package com.lordgasmic.workout.repositories;

import com.lordgasmic.workout.entities.CombinedWorkoutEntity;
import com.lordgasmic.workout.entities.CombinedWorkoutPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombinedWorkoutRepository extends JpaRepository<CombinedWorkoutEntity, CombinedWorkoutPK> {
}
