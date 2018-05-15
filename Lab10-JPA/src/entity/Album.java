package entity;

import java.io.Serializable;

import javax.persistence.*;
/**
 * Entity implementation class for Entity: Album
 *
 */
@Entity
@Table(name = "PERSONS")
public class Album implements Serializable {
	@Id
	@SequenceGenerator(name = "sequence",
	sequenceName = "persons_id_seq")
	@GeneratedValue(generator = "sequence")
	@Column(name = "PERSON_ID")
	
	private static  long serialVersionUID = 1L;

	public Album() {
		super();
	}
   
}
