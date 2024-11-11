package com.jorginho.tddcomjunit.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "curses")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curse{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String Description;

    private String Name;

    private int Workload;
}
