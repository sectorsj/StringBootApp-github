package ru.sectorsj.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sectorsj.springcourse.cameraroll.CameraRoll;
import ru.sectorsj.springcourse.cameraroll.ColorCameraRoll;

@SpringBootApplication
public class Client {

	public static void main(String[] args) {
		//SpringApplication.run(Client.class, args);

		Camera camera = new Camera();
		CameraRoll cameraRoll = new ColorCameraRoll();
		camera.setCameraRoll(cameraRoll);
		camera.doPhotograph();
	}
}
