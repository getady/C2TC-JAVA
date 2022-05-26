package com.tns.placement.management.repository;


import javax.persistence.EntityManager;

import com.tns.placement.management.entities.Placement;


public class PlacementRepositoryImpl implements IPlacementRepository {

	private EntityManager entityManager;
	
	// Step 1: Start JPA LifeCycle
	public PlacementRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	
//  Step 2: Implement methods IPlacementRepo
	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		entityManager.remove(placement);
		return placement;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
}
