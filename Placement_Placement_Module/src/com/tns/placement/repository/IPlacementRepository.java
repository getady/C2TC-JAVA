package com.tns.placement.repository;

import com.tns.placement.entities.Placement;

public interface IPlacementRepository {

	public abstract void addPlacement(Placement placement); 		// Create add method
	public abstract void updatePlacement(Placement placement);		// Create update method
	public abstract Placement searchPlacement(int id);				// Create search method
	public Placement cancelPlacement(Placement placement);			// Create delete method
	
	public abstract void beginTransaction(); 						// start 
	public abstract void commitTransaction();						// save
	
	Placement cancelPlacement(int id);								// Create delete method
}

