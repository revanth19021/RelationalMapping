package Mapping;

import jakarta.persistence.OneToOne;
import jakarta.persistence.*;

@Entity
@Table(name="person")
public class Person {
	@Id
	private int person_id;
		private String person_name;
	
	@OneToOne(mappedBy="person")
	private Passport passport;
	
	public Person() {
		
	}
	
	public Person(int id,String name) {
		this.person_id=id;
		this.person_name=name;
	}
	
	  public int getPerson_id() {
	        return person_id;
	    }

	    public void setPerson_id(int person_id) {
	        this.person_id = person_id;
	    }

	    public String getName() {
	        return person_name;
	    }

	    public void setName(String name) {
	        this.person_name = name;
	    }
	    public void setPassport(Passport p) {
	    	this.passport=p;
	    }
	    public Passport getPassport() {
	    	return passport;
	    }
	
	
}
