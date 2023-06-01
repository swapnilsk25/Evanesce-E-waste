package com.evanesce.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {
	
	@Id
	private String email;
	private String password;
	private String name;
	private String city;
	private String phone;
	private String securityQues;
	private String securityAns;
	private boolean isAdmin=false;
	
}