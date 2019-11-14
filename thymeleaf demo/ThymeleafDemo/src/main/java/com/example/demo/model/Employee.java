package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcustomer")
	private int id;
	@Column(name="first_name")
	@NotBlank(message="Required")
	private String firstName;
	@Column(name="last_name")
	@NotBlank(message="Required")
	private String lastName;
	@Column(name="email")
	@NotBlank(message="Required")
	private String email;
}
