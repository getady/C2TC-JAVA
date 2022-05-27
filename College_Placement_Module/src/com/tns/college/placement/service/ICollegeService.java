package com.tns.college.placement.service;

import com.tns.college.placement.entities.College;
import com.tns.college.placement.entities.Placement;

public interface ICollegeService
{
   public College addCollege (College college);
   public College updateCollege (College college);
   public College searchCollege (int id);
   public College deleteCollege (College college);
   
   public boolean schedulePlacement (Placement placement );
   
   College searchCollege(College college);
   public College searchCollegeById(int id);


}
