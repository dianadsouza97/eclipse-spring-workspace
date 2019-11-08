package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="account")
public class Account {
	@Id
	@Column(name = "account_number")
	private int accountNumber;
	@Column(name = "account_type")
	private AccountType accountType;
	@Column(name = "status")
	private boolean isActive;
}
