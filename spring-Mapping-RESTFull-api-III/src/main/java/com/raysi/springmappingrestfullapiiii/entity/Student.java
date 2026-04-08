package com.raysi.springmappingrestfullapiiii.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "std_id_generator"
    )
    private Long id;
    @Column(
            name = "first_name",
            length = 20
    )
    private String firstName;
    @Column(
            name = "last_name",
            length = 20
    )
    private String lastName;
    @Column(
            unique = true
    )
    private  String email;
    private Integer age;
    private Double gpa;
    @CreationTimestamp
    @Column(
            updatable = false
    )
    private Timestamp timestamp;
    @OneToOne(
            mappedBy = "student",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    private StudentProfile studentProfile;

    @ManyToOne
    @JoinColumn(
            name = "school_id"
    )
    @JsonBackReference
    private School school;
}
