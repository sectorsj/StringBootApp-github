package ru.sectorsj.springcourse.cameraroll;

public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("- 1 black/white frame");
    }
}
