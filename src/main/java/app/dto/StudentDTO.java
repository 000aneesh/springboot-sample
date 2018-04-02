/**
 * 
 */
package app.dto;

/**
 * @author 419312
 *
 */
public class StudentDTO {

	private int id;
	
	private String name;
	
	private String address;
	
	private String batch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
	
}
