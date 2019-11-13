package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data

  @Setter
  
  @Getter
  
  @AllArgsConstructor
  
  @NoArgsConstructor
 
@Entity
@Table(name = "offer")
public class Offer {
	@Id
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "details")
	private String detailsLink;
}
