package com.tns.placement.management.service;

import com.tns.placement.management.entities.Certificate;

public interface ICertificateService {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	public Certificate deleteCertificate(Certificate certificate);
}
