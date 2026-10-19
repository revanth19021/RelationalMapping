package Mapping;

import jakarta.persistence.*;
@Entity
@Table(name="passport")
class Passport{
	@Id
	private int passport_id;
	
	@Column(unique=true)
	private String passport_number;
	
	public Passport() {
		
	}
	public Passport(int id,String name) {
		this.passport_id=id;
		this.passport_number=name;
	}
	@OneToOne
	@JoinColumn(name="person_id",unique=true)
	private Person person;
	
	
	 public int getPassport_id() {
	        return passport_id;
	    }

	    public void setPassport_id(int passport_id) {
	        this.passport_id = passport_id;
	    }

	    public String getPassport_number() {
	        return passport_number;
	    }

	    public void setPassport_number(String passport_number) {
	        this.passport_number = passport_number;
	    }

	    public Person getPerson() {
	        return person;
	    }

	    public void setPerson(Person person) {
	        this.person = person;
	    }
}