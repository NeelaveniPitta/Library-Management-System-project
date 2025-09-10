package com.ashi.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "issues")
public class Issue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	 @Column(name = "issue_date", nullable = false)
	private LocalDate issueDate;
	
	@Column(name = "return_date")
	private LocalDate returnDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Book book;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;
}
