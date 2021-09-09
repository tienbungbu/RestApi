package com.java.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
	private int id;
	private String username;
	private String password;
	private String address;
}
