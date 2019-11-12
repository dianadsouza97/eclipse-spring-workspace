package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
/*
 * @Setter
 * 
 * @Getter
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */
@Entity
@Table(name = "offer")
public class Offer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "title")
	private String title;
	@Column(name = "desc")
	private String description;
	@Column(name = "details")
	private String detailsLink;
}
