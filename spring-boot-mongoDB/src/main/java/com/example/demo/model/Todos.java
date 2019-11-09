package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "data")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todos {
	
	private ObjectId _id;
	private int userid;
	private String title;
	private Boolean completed;
	public String get_id() {
		return _id.toHexString();
	}
	
}
