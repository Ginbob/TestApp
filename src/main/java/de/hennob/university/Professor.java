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
 * Entity class Professor
 *
 * @author Henning
 * @since 13.12.2016
 */

@Entity
public class Professor
{
	private int professorId;
	private String lastName;
	private String firstName;
	private List<Course> lecturingCourses;
	
	public Professor()
	{
		this.lecturingCourses = new ArrayList<Course>();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getProfessorId()
	{
		return professorId;
	}

	public void setProfessorId(int professorId)
	{
		this.professorId = professorId;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	@OneToMany(mappedBy="professor")
	public List<Course> getLecturingCourses()
	{
		return lecturingCourses;
	}

	public void setLecturingCourses(List<Course> lecturingCourses)
	{
		this.lecturingCourses = lecturingCourses;
	}
	
	
}
