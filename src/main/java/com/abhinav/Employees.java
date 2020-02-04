package com.abhinav;

public class Employees {
	
		private String name;
		private String sir_name;
		private int empId;
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public Employees(int empId,String name, String sir_name) {
			super();
			this.empId=empId;
			this.name = name;
			this.sir_name = sir_name;
			
		}
		public Employees(String name, String sir_name,int empId) {
			super();
			this.empId=empId;
			this.name = name;
			this.sir_name = sir_name;
			
		}
		public Employees()
		{
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSir_name() {
			return sir_name;
		}
		public void setSir_name(String sir_name) {
			this.sir_name = sir_name;
		}
		
		
		
		

	


}
