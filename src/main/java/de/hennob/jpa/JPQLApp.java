/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Provide a class description here
 *
 * @author Henning
 * @since 08.12.2016
 */
public class JPQLApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("de.hennob.jpa");
		EntityManager entityManager = emFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
//		Query nativeQuery = entityManager.createNativeQuery("SELECT * from person p where p.name = 'Lisa'", Person.class);
//		List<Person> people = nativeQuery.getResultList();
		
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("person.getAllOver22", Person.class);
		namedQuery.setParameter("name", "Lisa");
//		List<Person> people = namedQuery.getResultList();
		
		for(Person p: namedQuery.getResultList())
		{
			System.out.println(p);
		}
		
		
		
		entityManager.close();
		emFactory.close();
	}

}
