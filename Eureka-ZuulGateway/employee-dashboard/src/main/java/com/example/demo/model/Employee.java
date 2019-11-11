package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Long employeeId;
	private String name;
	private String practiceArea;
	private String designation;
	private String companyInfo;
}
