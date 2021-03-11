package ru.sectorsj.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("ru.sectorsj.springcourse")
public class AppConfig {

    //@Bean(name = "cameraRoll")
    //public CameraRoll cameraRoll(){
    //    return new ColorCameraRoll();
    //}

    @Bean(name = "cameraRoll")
    public CameraRoll cameraRoll(){
        return new BlackAndWhiteCameraRoll();
    }

    @Bean(name = "camera")
    public Camera camera (CameraRoll cameraRoll) {
        Camera camera = new CameraImpl();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
