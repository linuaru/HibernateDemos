package inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/*  
 * Table-per-subclass
 * 
 * @Entity
@Table(name = "Emp_Table_per_class")
@Inheritance(strategy = InheritanceType.JOINED) */


/*
 * table-per-class
 * 
 * @Entity  
 
@Table(name = "EMP_table_per_class")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type")
@DiscriminatorValue(value="employee")  
*/

/*
 *table-per-concrete
 * 
 * @Entity  
 
@Table(name = "EMP_table_per_concrete-class")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
*/

public  class Employee {

	// @Id
	   
	private int Id;
	private String name;
	

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id,String name) {
		super();
		Id = id;
		this.name = name;
	}
	
}
