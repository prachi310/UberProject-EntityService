package com.example.UberProject_EntityService.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ExactLocation extends BaseModel{

    private Double latitude;
    private Double longitude;

}
