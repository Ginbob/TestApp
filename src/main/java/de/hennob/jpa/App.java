/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.hennob.mappedjpa.FlyingAnimal;
import de.hennob.mappedjpa.SwimmingAnimal;

/**
 * Provide a class description here
 *
 * @author Henning
 * @since 07.12.2016
 */
public class App
{
	public static void main(String[] args)
	{
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("de.hennob.jpa");
		EntityManager em = emFactory.createEntityManager();
		
		em.getTransaction().begin();
		
		FlyingAnimal flyingAnimal = new FlyingAnimal();
		flyingAnimal.setFlightAltitude(150);
		flyingAnimal.setName("Dragon");
		flyingAnimal.setNoOfLegs(4);

		SwimmingAnimal swimmingAnimal = new SwimmingAnimal();
		swimmingAnimal.setDivingDepth(60);
		swimmingAnimal.setName("Dolphing");
		swimmingAnimal.setNoOfLegs(0);
		
		em.persist(flyingAnimal);
		em.persist(swimmingAnimal);

		em.getTransaction().commit();
		
		em.close();
		emFactory.close();
	}

}
