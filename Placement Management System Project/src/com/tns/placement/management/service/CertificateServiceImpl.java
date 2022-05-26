package com.tns.placement.management.service;

import com.tns.placement.management.entities.Certificate;
import com.tns.placement.management.repository.CertificateRepositoryImpl;
import com.tns.placement.management.repository.ICertificateRepository;

public class CertificateServiceImpl implements ICertificateService{

	private ICertificateRepository dao;

//	Step 1: Call the ICertificateRepository or dao 
	public CertificateServiceImpl() {
	dao = new CertificateRepositoryImpl();	
    }

//  Step 2: Implement methods ICertificateRepo
	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
	Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}


	@Override
	public Certificate deleteCertificate(Certificate certificate) {
	dao.beginTransaction();
	dao.deleteCertificate(certificate);
	dao.commitTransaction();
       return certificate;
	}

	

}

