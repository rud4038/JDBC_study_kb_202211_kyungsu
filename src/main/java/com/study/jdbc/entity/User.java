package main.java.com.study.jdbc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	
	private int user_id;
	private String username;
	private String name;
	private String email;
	private String phone;

}
