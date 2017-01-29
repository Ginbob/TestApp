/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Provide a class description here
 *
 * @author Henning
 * @since 08.12.2016
 */
public class ReadApp
{
	public static void main(String[] args)
	{
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("de.hennob.jpa");
		EntityManager entityManager = emFactory.createEntityManager();
		
		Person p = entityManager.find(Person.class, 4);
		
		System.out.println(p);
		
		entityManager.close();
		emFactory.close();
	}
}
