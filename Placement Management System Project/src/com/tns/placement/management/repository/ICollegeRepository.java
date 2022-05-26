package com.tns.placement.management.repository;

import com.tns.placement.management.entities.College;

public interface ICollegeRepository {
		
	public College addCollege(College college);			// Create Method
	public College updateCollege(College college);		// Update Method
	public College searchCollege(int id);				// Update Method
	public College deleteCollege(College college);		// Delete Method
	public abstract void commitTransaction();			// Save Method
	public abstract void beginTransaction();			// Start Method
	

}

