package com.company.systemappbackend.model;

import jakarta.persistence.*;

import lombok.*;
import org.springframework.aot.generate.GeneratedTypeReference;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(nullable = false, unique = true )
    private String number;

    @Column(nullable = false, length = 50)
    private String type;

    @Column(nullable = false, columnDefinition = "decimal(6,2)")
    private Double price;

    @Column(nullable = false)
    private Boolean available;

}
