/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.university;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entity class Student
 *
 * @author Henning
 * @since 13.12.2016
 */

@Entity
@Table(name = "Student")
public class Student
{
	private int studentId;
	private String name;
	private int age;

	private List<Course> courses;

	public Student()
	{
		this.courses = new ArrayList<Course>();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getStudentId()
	{
		return studentId;
	}

	public void setStudentId(int id)
	{
		this.studentId = id;
	}

	@Column
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@ManyToMany(mappedBy="students")
	public List<Course> getCourses()
	{
		return courses;
	}

	public void setCourses(List<Course> courses)
	{
		this.courses = courses;
	}

	@Override
	public String toString()
	{
		return "Student " + studentId + ":\n" + "Name: " + name + "\n" + "Age: " + age + "\n";
	}

	public void addCourse(Course course)
	{
		this.courses.add(course);
	}
}
