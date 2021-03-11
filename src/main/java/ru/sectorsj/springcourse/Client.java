package ru.sectorsj.springcourse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Client {

	public static void main(String[] args) {
		//SpringApplication.run(Client.class, args);

		ApplicationContext context = new
	AnnotationConfigApplicationContext(AppConfig.class);

		Camera camera = context.getBean("camera", Camera.class);

		// Ломает фотоаппарат
		camera.breaking();

		// Пытается сделать фото. Неудача!
		camera.doPhotograph();

		// Просит еще один фотоаппарат
		camera = context.getBean("camera", Camera.class);

		// Пытается сделать фото.
		camera.doPhotograph();

	}
}
