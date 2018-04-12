package inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*
 * table-per-subclass
 * 
 * @Entity  
 
@Table(name="subclass-con-emp")  
@PrimaryKeyJoinColumn(name="Con-ID")  
*/

/*
 * table-per-class
 * 
 * @Entity  
 
@DiscriminatorValue("con-emp")  
*/

/*
 * table-per-concrete
 * 
 * @Entity  
 
@Table(name="concrete-contemp")  
@AttributeOverrides({  
    @AttributeOverride(name="Id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
*/

public class Contract_Emp extends Employee {

	private int pay_per_hour;
	private int contract_duration;
	
	
	public int getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public int getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(int contract_duration) {
		this.contract_duration = contract_duration;
	}
	public Contract_Emp(int id , String name, int pay_per_hour, int contract_duration) {
		super(id, name);
		this.pay_per_hour = pay_per_hour;
		this.contract_duration = contract_duration;
	}
	public Contract_Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
