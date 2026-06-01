package com.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConfig {
	
	@Value(value ="${test.user.name}")
	private String username;
	
	@Value(value = "${test.user.password}")
	private String password;
	
	@Value(value = "${test.db.url}")
	private String url;
	
	
	public void details() {
		System.out.println("-----Db details--------");
		System.out.println(username);
		System.out.println(password);
		System.out.println(url);
	}
}
