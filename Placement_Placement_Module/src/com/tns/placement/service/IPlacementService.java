package com.tns.placement.service;

import com.tns.placement.entities.Placement;

public interface IPlacementService {

    public abstract void addPlacement(Placement placement);
	public abstract void updatePlacement(Placement placement);
	public abstract Placement searchPlacement(int id);
	
	public abstract Placement cancelPlacement(Placement placement);


}
