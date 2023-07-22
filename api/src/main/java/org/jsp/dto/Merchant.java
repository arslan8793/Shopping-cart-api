package org.jsp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Merchant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
@Column(unique=true)
private long phone;
@Column(unique=true)
private String email;
private long gst;
private String password;



	
}
