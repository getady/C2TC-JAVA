package com.tns.college.placement.repository;

import com.tns.college.placement.entities.Placement;

public interface IPlacementRepository {

	public abstract void addPlacement(Placement placement);
	public abstract void updatePlacement(Placement placement);
	public abstract Placement searchPlacement(int id);
	public Placement deletePlacement(Placement placement);

	void beginTransaction();

	void cancelPlacement(int id);

	void commitTransaction();
}

