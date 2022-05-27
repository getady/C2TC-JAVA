package com.tns.college.placement.service;

import com.tns.college.placement.entities.College;
import com.tns.college.placement.entities.Placement;
import com.tns.college.placement.repository.CollegeRepositoryImpl;
import com.tns.college.placement.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService
{
	//Step1: Establishing Connection between Service and Repo
		private ICollegeRepository dao;
		
		public CollegeServiceImpl()
		{
		 dao = new CollegeRepositoryImpl();
		}

	
	
	@Override
	public College addCollege(College college) 
	{
		dao.beginTransaction();
		dao.addCollege (college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao. updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(College college)
	{
		dao.beginTransaction();
		dao.searchCollege(0);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
	
		return college;
	}



	@Override
	public College searchCollege(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public College searchCollegeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return false;
	}



//	@Override
//	public boolean schedulePlacement(Placement placement) {
//		dao.beginTransaction();
//		dao.schedulePlacement(Placement placement);
//		dao.commitTransaction();
//		return
//	}



	
	}
	


