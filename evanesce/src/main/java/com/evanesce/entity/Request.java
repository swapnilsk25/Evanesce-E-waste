package com.evanesce.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reqid;
	private String name;
	private String email;
	private String address;
	private String city;
	private int payment;
	private String ewasteQty;
	private int quantity;
	private boolean status = false;
	private boolean imageuploadstatus = false;
	@ManyToOne
	@JoinColumn(name = "agent_id")
	private Agent agentid;
	@JsonIgnore // need to ignore during marshalling
	@OneToMany(mappedBy = "request_id", cascade = CascadeType.ALL)
	private List<FileDB> images;

}