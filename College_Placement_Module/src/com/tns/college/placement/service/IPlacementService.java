package com.tns.college.placement.service;

import com.tns.college.placement.entities.Placement;

public interface IPlacementService {

    public abstract void addPlacement(Placement placement);
	public abstract void updatePlacement(Placement placement);
	public abstract Placement searchPlacement(int id);
	public Placement deletePlacement(Placement placement);
	
	public abstract void cancelPlacement(int id);

	public abstract void removePlacement(int id);
}
