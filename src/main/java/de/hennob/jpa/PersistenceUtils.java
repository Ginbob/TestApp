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
public class PersistenceUtils
{
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY;
	private static EntityManager ENTITY_MANAGER;
	
	static
	{
		ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("de.hennob.jpa");
		ENTITY_MANAGER = ENTITY_MANAGER_FACTORY.createEntityManager();
	}
	
	public static EntityManagerFactory getEntityManagerFactory()
	{
		return ENTITY_MANAGER_FACTORY;
	}
	
	
	public static EntityManager getENTITY_MANAGER()
	{
		return ENTITY_MANAGER;
	}


	public static void setENTITY_MANAGER(EntityManager eNTITY_MANAGER)
	{
		ENTITY_MANAGER = eNTITY_MANAGER;
	}
}
