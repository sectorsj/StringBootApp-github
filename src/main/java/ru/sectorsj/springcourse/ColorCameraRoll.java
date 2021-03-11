package ru.sectorsj.springcourse;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Component("cameraRoll")
public class ColorCameraRoll implements CameraRoll {

    @Override
    public void processing() {
        System.out.println("- 1 color frame");
    }

}