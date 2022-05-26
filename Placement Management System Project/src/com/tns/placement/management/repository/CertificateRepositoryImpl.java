package com.tns.placement.management.repository;


import javax.persistence.EntityManager;

import com.tns.placement.management.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository{

	private EntityManager entityManager;
	
	// Step 1: Start JPA LifeCycle
	public CertificateRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	
	//  Step 2: Implement methods ICertificateRepo
	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(Certificate certificate) {
		entityManager.remove(certificate);
		return certificate;	
	}
	

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	}
