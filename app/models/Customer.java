package models;


import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * @author mAsK
 *
 */

@Entity
public class Customer extends Model {

	@Id
	public Long id;
	public String firstname;
	public String lastname;
	public String city;

	public static Finder<Long, Customer> finder = new Finder<Long, Customer>(Long.class, Customer.class);

}