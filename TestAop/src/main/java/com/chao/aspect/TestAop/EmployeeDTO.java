package com.chao.aspect.TestAop;

public class EmployeeDTO {
	 
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private Integer id;
    private String firstName;
    private String lastName;
 
    //Setters and Getters
}