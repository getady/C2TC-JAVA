package com.tns.placement.management.service;

import com.tns.placement.management.entities.College;

public interface ICollegeService {

	public College addCollege(College college);  // C
	public College updateCollege(College college); // U
	public College searchCollege(int id); // R
	public College deleteCollege(College college); // D
	
}
