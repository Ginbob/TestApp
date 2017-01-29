/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.university;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity class University
 *
 * @author Henning
 * @since 13.12.2016
 */

@Entity
public class University
{
	private int universityId;
	private String name;

	public University()
	{
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getUniversityId()
	{
		return universityId;
	}

	public void setUniversityId(int universityId)
	{
		this.universityId = universityId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
