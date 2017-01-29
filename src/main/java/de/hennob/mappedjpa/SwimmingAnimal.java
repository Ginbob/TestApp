/**
 * Copyright Henning Nobbe 2016. All rights reserved
 */
package de.hennob.mappedjpa;

import javax.persistence.Entity;

/**
 * Provide a class description here
 *
 * @author Henning
 * @since 12.12.2016
 */
@Entity
public class SwimmingAnimal extends AbstractAnimal
{
	private int divingDepth;

	public int getDivingDepth()
	{
		return divingDepth;
	}

	public void setDivingDepth(int divingDepth)
	{
		this.divingDepth = divingDepth;
	}

}