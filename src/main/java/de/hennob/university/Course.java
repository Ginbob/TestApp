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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity class Course
 *
 * @author Henning
 * @since 13.12.2016
 */

@Entity
public class Course
{
	private int courseId;
	private String name;
	private String description;
	private double ects;
	private Professor professor;
	private List<Student> students;

	public Course()
	{
		this.students = new ArrayList<Student>();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCourseId()
	{
		return courseId;
	}

	public void setCourseId(int courseId)
	{
		this.courseId = courseId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public double getEcts()
	{
		return ects;
	}

	public void setEcts(double ects)
	{
		this.ects = ects;
	}

	@ManyToOne(optional=true)
	@JoinColumn(name = "professorId")
	public Professor getProfessor()
	{
		return professor;
	}

	public void setProfessor(Professor professor)
	{
		this.professor = professor;
	}

	@ManyToMany
	@JoinTable(name = "course_students", 
		joinColumns = @JoinColumn(name = "courseId"), 
		inverseJoinColumns = @JoinColumn(name = "studentId"))
	public List<Student> getStudents()
	{
		return students;
	}

	public void setStudents(List<Student> students)
	{
		this.students = students;
	}

	public void addStudent(Student student)
	{
		this.students.add(student);
	}
}
