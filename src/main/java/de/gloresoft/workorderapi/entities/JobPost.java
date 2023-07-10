package de.gloresoft.workorderapi.entities;

import java.util.Arrays;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobpost")
public class JobPost {

	@Id
	private String id;

    private String firstName;
    private String lastName;
    //private String category;
    
    private String email;
    private long salary;
    private String Accounting_skills [];
    private String Frontend_Skills [];
    private String Backend_Skills [];
    private String Administration_skills [];
    private String Language_skills [];
    private Department department;
    
    
	/* public JobPost(String id, String firstName, String lastName, String email, long salary, String[] accounting_skills,
			String[] frontend_Skills, String[] backend_Skills, String[] administration_skills, String[] language_skills,
			Department department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		Accounting_skills = accounting_skills;
		Frontend_Skills = frontend_Skills;
		Backend_Skills = backend_Skills;
		Administration_skills = administration_skills;
		Language_skills = language_skills;
		this.department = department;
	} */
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String[] getAccounting_skills() {
		return Accounting_skills;
	}
	public void setAccounting_skills(String[] accounting_skills) {
		Accounting_skills = accounting_skills;
	}
	public String[] getAdministration_skills() {
		return Administration_skills;
	}
	public void setAdministration_skills(String[] administration_skills) {
		Administration_skills = administration_skills;
	}
	public String[] getLanguage_skills() {
		return Language_skills;
	}
	public void setLanguage_skills(String[] language_skills) {
		Language_skills = language_skills;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String[] getFrontend_Skills() {
		return Frontend_Skills;
	}
	public void setFrontend_Skills(String[] frontend_Skills) {
		Frontend_Skills = frontend_Skills;
	}
	public String[] getBackend_Skills() {
		return Backend_Skills;
	}
	public void setBackend_Skills(String[] backend_Skills) {
		Backend_Skills = backend_Skills;
	}
	@Override
	public String toString() {
		return "JobPost [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", salary=" + salary + ", Accounting_skills=" + Arrays.toString(Accounting_skills)
				+ ", Frontend_Skills=" + Arrays.toString(Frontend_Skills) + ", Backend_Skills="
				+ Arrays.toString(Backend_Skills) + ", Administration_skills=" + Arrays.toString(Administration_skills)
				+ ", Language_skills=" + Arrays.toString(Language_skills) + ", department=" + department + "]";
	}
    
    
}
