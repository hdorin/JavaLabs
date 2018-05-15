package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Entity implementation class for Entity: Artist
 *
 */
@Entity

public class Artist implements Serializable {
	
	
	private static long serialVersionUID = 1L;

	public Artist() {
		super();
	}
   
}
