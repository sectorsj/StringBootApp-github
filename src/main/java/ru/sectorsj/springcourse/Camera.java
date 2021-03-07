package ru.sectorsj.springcourse;

import ru.sectorsj.springcourse.cameraroll.CameraRoll;

public class Camera {
    private CameraRoll cameraRoll;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Click");
        cameraRoll.processing();
    }

}
