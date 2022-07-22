package Lab03;

import java.time.LocalDate;

public abstract class Pet {
	
	// Fields
	private String name;
	private LocalDate dob;
	
	// Constructor
    public Pet (String n, int y, int m, int d) {
        this.name = n;
        this.dob = LocalDate.of(y, m, d);
    }
    
    // Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(int y, int m, int d) {
    	this.dob = LocalDate.of(y, m, d);
    }
    public int getAge() {
    	//TODO: Return the pet's age in number of actual years
    	return 0;
    }
    abstract public int getAgeInHumanYears();
    	// TODO: provide concrete methods by creating Cat and Dog classes to extend Pet.
    	// https://www.akc.org/expert-advice/health/how-to-calculate-dog-years-to-human-years/
    	// https://www.purina.co.uk/cats/key-life-stages/ageing/cats-age-in-human-years

}
