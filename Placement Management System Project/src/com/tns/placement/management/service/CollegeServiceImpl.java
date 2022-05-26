package com.tns.placement.management.service;

import com.tns.placement.management.entities.College;
import com.tns.placement.management.repository.CollegeRepositoryImpl;
import com.tns.placement.management.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService{

	private ICollegeRepository dao;

//	Step 1: Call the ICollegeRepository or dao 
	public CollegeServiceImpl() {
	dao = new CollegeRepositoryImpl();	
    }

	
//  Step 2: Implement methods ICollegeRepo
	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
	College college = dao.searchCollege(id);
		return college;
	}


	@Override
	public College deleteCollege(College college) {
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
			return college;
		}


	

}
