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
public class DeleteApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("de.hennob.jpa");
		EntityManager entityManager = emFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Person p = entityManager.find(Person.class, 4);
		entityManager.remove(p);
		
		System.out.println(p);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		emFactory.close();
	}

}
