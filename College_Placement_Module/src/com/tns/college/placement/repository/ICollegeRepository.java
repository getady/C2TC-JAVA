package com.tns.college.placement.repository;

import com.tns.college.placement.entities.College;

public interface ICollegeRepository 
{
	 public College addCollege (College college);
	 public College updateCollege (College college);
	 public College searchCollege (int id);
	 public College deleteCollege (College college);
	   
	  public abstract void beginTransaction();
	  public abstract void commitTransaction();
}
