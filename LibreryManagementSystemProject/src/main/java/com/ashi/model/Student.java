package com.ashi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "stud_id")
  private Long id;

  @Column(nullable = false, length = 100)
  private String name;

  @Column(name = "roll_number", nullable = false, length = 100, unique = true)
  private String rollNumber;

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  private List<Issue> issues = new ArrayList<>();

}
	

