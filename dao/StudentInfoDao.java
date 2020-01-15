package org.deloitte.sms.dao;

import java.util.List;

import org.deloitte.schoolmanagementsystem.bean.StudentInfo;

public interface StudentInfoDao {
		

		public boolean searchDetails11(String Category,String criteria,String values);
		public Boolean searchDetails1(String Category,String criteria,String values);
		public Boolean searchDetails(String Category,String criteria,String values);
		
		public façadeObject Locate(façadeObject name);
		public List<Object> retrieveStudentDetails(String Category,String criteria,String values);
		//above function return StudentVO, MarkVO
		public StaffVO retrieveStaffDetails(String Category,String criteria,String values);
	}







