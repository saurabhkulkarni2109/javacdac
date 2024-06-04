package com.app.entity;

import java.io.Serializable;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@NamedQueries({
	@NamedQuery(name="findEmployeByName",
			query="from Employe e where e.name= :name"	
			),
	/*
	 * @NamedQuery(name=",query="")
	 */
})
@Entity
@Table(name="emp")
public class Employe implements Serializable {
	
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
int id;
@Column
String name;
@Column
int salary;
@Column
String job;

public Employe() {
	
}

public Employe(String name, int salary, String job) {
	super();
	this.name = name;
	this.salary = salary;
	this.job = job;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}


}
