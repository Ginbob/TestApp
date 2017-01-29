/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.main;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.hennob.university.Course;
import de.hennob.university.Professor;
import de.hennob.university.Student;
import de.hennob.university.University;

/**
 * Main application
 *
 * @author Henning
 * @since 13.12.2016
 */
public class Application
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("de.hennob.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

//		University hsOs = createHsOs();
		Student henning = createHenning();
		Course programmingBasics = createProgrammingBasics();
		Professor gerth = createGerth();
		
		gerth.getLecturingCourses().add(programmingBasics);
//		hsOs.getCourses().add(programmingBasics);
		henning.getCourses().add(programmingBasics);
		
		programmingBasics.setProfessor(gerth);
		programmingBasics.getStudents().add(henning);

//		entityManager.persist(hsOs);
		entityManager.persist(gerth);
		entityManager.persist(programmingBasics);
		entityManager.persist(henning);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}

	/**
	 * @return
	 */
	private static Student createHenning()
	{
		Student henning = new Student();
		henning.setAge(27);
		henning.setName("Henning Nobbe");
		return henning;
	}

	private static Professor createGerth()
	{
		Professor gerth = new Professor();
		gerth.setFirstName("Christian");
		gerth.setLastName("Gerth");
		return gerth;
	}

	private static University createHsOs()
	{
		University hsOs = new University();
		hsOs.setName("Hochschule Osnabrück - University of Applied Science");
		return hsOs;
	}
	
	private static Course createProgrammingBasics()
	{
		Course programmingBasics = new Course();
		programmingBasics.setName("Grundlagen der Programmierung");
		programmingBasics.setDescription(
				"Dieser Kurs vermittelt die Grundlagen der Programmierung. "
				+ "Eingesetzt werden dabei die Programmiersprache C und ein dazugehöriger Compiler - Pelles C.");
		programmingBasics.setEcts(5);
		
		return programmingBasics;
	}

}
