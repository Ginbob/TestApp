/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.mappedjpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Provide a class description here
 *
 * @author Henning
 * @since 12.12.2016
 */
@MappedSuperclass
public abstract class AbstractAnimal
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	protected String name;
	protected int noOfLegs;
	
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
	public int getNoOfLegs()
	{
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs)
	{
		this.noOfLegs = noOfLegs;
	}
	
	
}
