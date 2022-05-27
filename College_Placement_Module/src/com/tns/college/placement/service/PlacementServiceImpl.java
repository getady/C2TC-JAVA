package com.tns.college.placement.service;

import com.tns.college.placement.entities.Placement;
import com.tns.college.placement.repository.IPlacementRepository;
import com.tns.college.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements IPlacementService{

    private IPlacementRepository dao;
	
	public PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
		
	}

	@Override
	public void addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
		
	}

	@Override
	public void cancelPlacement(int id) {
		 dao.beginTransaction();
		 dao.cancelPlacement(id);
		 dao.commitTransaction();
		
	}

	@Override
	public void removePlacement(int id) {
		 dao.beginTransaction();
		 dao.cancelPlacement(id);
		 dao.commitTransaction();
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		dao.beginTransaction();
		dao.deletePlacement(placement);
		dao.commitTransaction();
			return placement;
	}

	
		
}
