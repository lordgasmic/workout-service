package com.lordgasmic.workout.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "cardio_vw")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardioEntity {
    @Id
    private UUID id;
    private String duration;
    private String distance;
}
