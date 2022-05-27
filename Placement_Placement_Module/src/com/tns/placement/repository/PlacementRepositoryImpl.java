package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.Placement;

public class PlacementRepositoryImpl implements IPlacementRepository {
	
	private EntityManager entityManager;

	public PlacementRepositoryImpl() {
		
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public void addPlacement(Placement placement) {
	
		entityManager.persist(placement);
	}

	@Override
	public void updatePlacement(Placement placement) {
		
		entityManager.merge(placement);
		
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public Placement searchPlacement(int id) {

		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public Placement cancelPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		entityManager.remove(placement);
		return placement;
	}

	@Override
	public Placement cancelPlacement(Placement placement) {
		entityManager.remove(placement);   
		return placement;
	}


}