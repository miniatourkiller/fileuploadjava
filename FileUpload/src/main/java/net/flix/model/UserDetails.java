package net.flix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int id;
private String name;
private String fileName;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}

}
