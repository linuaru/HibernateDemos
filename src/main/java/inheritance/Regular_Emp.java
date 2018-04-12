package inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*
 * Table-per-subclass
 * 
 * @Entity  
 
@Table(name="subclass-reg-emp")  
@PrimaryKeyJoinColumn(name="Reg-ID") 
*/

/*
 * table-per-class
 * 
 * @Entity  
 
@DiscriminatorValue("reg-emp")  
*/

/*
 *table-per-concrete
 * 
 * @Entity  
 
@Table(name="concrete-regemp")  
@AttributeOverrides({  
    @AttributeOverride(name="Id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
*/

public class Regular_Emp extends Employee {

	private float salary;
	private int bonus;
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public Regular_Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Regular_Emp(int id, String name, float salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
}
