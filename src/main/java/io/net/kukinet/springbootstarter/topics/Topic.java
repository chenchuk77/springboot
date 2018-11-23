package io.net.kukinet.springbootstarter.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	// class is entity (db row), @Id is the primary-key
	

	@Id
	private String id;
	private String name;
	private String description;
	
	
	// constructors
	public Topic() {}
	public Topic(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	// setters/getters
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	

}
