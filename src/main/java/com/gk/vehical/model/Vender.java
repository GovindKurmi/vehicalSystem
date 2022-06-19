package com.gk.vehical.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Vender {
	@Id
	private int id;
	private String vender;
	private String vehicalType;

}
