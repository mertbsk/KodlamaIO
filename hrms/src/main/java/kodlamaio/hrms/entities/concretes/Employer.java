package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employers")
public class Employer {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "phone_number")
	private String phoneNumber;
}
