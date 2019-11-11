package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eId")
	  private Long employeeId;
	@Column(name="name")
	   private String name;
	@Column(name="practice_area")
	   private String practiceArea;
	@Column(name="desg")
	   private String designation;
	@Column(name="company_info")
	   private String companyInfo;

}
