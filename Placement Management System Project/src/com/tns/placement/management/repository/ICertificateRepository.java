package com.tns.placement.management.repository;

import com.tns.placement.management.entities.Certificate;

public interface ICertificateRepository {
	public Certificate addCertificate(Certificate certificate);        // Create Method
	public Certificate updateCertificate(Certificate certificate);	   // Update Method
	public Certificate searchCertificate(int id);					   // Update Method
	public Certificate deleteCertificate(Certificate certificate);     // Delete Method
	public abstract void commitTransaction();						   // Save Method
	public abstract void beginTransaction();						   // Start Method
}


