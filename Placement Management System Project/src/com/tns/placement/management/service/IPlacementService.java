package com.tns.placement.management.service;

import com.tns.placement.management.entities.Placement;

public interface IPlacementService {

	public Placement addPlacement(Placement placement);  // C
	public Placement updatePlacement(Placement placement); // U
	public Placement searchPlacement(int id); // R
	public Placement deletePlacement(Placement placement); // D
}
