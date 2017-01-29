/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
@NamedQueries({ @NamedQuery(name = "person.getAll", query = "select p from Person p"),
				@NamedQuery(name = "person.getAllOver22", query = "select p from Person p where p.name =:name") })
public class Person
{
	private int id;
	private String name;
	private int age;

	public Person()
	{

	}

	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return this.name + " - Alter: " + this.age;
	}
}
