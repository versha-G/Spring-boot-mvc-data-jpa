package com.deloitte.spring.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "vehicle_master")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank
	private String name;
	@NotNull
	private Double cost;
	@NotNull
	private Date date;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Integer id, String name, Double cost, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.date = date;
	}

	public Vehicle(String name, Double cost, Date date) {
		super();
		this.name = name;
		this.cost = cost;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", cost=" + cost + ", date=" + date + "]";
	}

}
