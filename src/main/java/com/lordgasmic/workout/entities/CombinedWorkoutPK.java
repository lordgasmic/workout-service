package com.lordgasmic.workout.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CombinedWorkoutPK implements Serializable {
    private Integer id;
    private UUID workoutId;
}
