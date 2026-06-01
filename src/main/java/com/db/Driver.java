package com.db;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		DbConfig d = app.getBean(DbConfig.class);
		d.details();
		app.close();
	}
}
