package ru.sectorsj.springcourse.cameraroll;

public class ColorCameraRoll implements CameraRoll {

    @Override
    public void processing() {
        System.out.println("- 1 color frame");
    }
}