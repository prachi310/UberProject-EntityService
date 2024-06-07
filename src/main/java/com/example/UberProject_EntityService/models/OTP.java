package com.example.UberProject_EntityService.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OTP extends BaseModel{

    private String code;

    private String sentToNumber;

    public static OTP make(String phoneNumber)
    {
        Random random =new Random();
        Integer x = random.nextInt(9000)+1000;
        return OTP.builder().code(x.toString()).sentToNumber(phoneNumber).build();
    }
}
