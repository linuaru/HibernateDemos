package com.scp.HibernateDemos;

public class EmpHibDemos {
	
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmpHibDemos(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public EmpHibDemos() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nEmpHibDemos [id=" + id + ", name=" + name + "]";
	}
	
	

}
