package com.amit.springJDBC2;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("DESIGNATION")
public class Designation {

	@Id
	@Column("DESIGNATION_ID")
	private Long designation_id;
	
	@Column("DESIGNATION_NAME")
	private String designation_name;

	/**
	 * @param designation_id
	 * @param designation_name
	 */
	public Designation(Long designation_id, String designation_name) {
		this.designation_id = designation_id;
		this.designation_name = designation_name;
	}
	
	static Designation add(Long designation_id, String designation_name) {
		return new Designation(designation_id, designation_name);
	}

	public Long getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(Long designation_id) {
		this.designation_id = designation_id;
	}

	public String getDesignation_name() {
		return designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	@Override
	public String toString() {
		return "Designation [designation_id=" + designation_id + ", designation_name=" + designation_name + "]";
	}
	
	
	
}
