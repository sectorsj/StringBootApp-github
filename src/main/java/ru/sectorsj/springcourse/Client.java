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
		camera.doPhotograph();

		// CameraRoll cameraRoll = new ColorCameraRoll();
		// Camera camera = new Camera();
		// camera.setCameraRoll(cameraRoll);
	}
}
