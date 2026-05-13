package com.lordgasmic.workout.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "combined_workout_vw")
@IdClass(CombinedWorkoutPK.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CombinedWorkoutEntity {
    @Id
    private Integer id;
    @Id
    @Column(name = "workout_id")
    private UUID workoutId;
}
