package com.raysi.springmappingrestfullapiiii.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "student_profile"
)
public class StudentProfile {
    @Id
    @GeneratedValue
    private Long studentProfileId;
    @Column(
            length = 10000
    )
    private String bio;

    @OneToOne
    @JoinColumn(
           name = "student_id"
    )
    @JsonBackReference
    private Student student;
}
