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
public class FlyingAnimal extends AbstractAnimal
{
	private int flightAltitude;

	public int getFlightAltitude()
	{
		return flightAltitude;
	}

	public void setFlightAltitude(int flightAltitude)
	{
		this.flightAltitude = flightAltitude;
	}
}
