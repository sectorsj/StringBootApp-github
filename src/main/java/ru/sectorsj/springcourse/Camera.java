package ru.sectorsj.springcourse;

public interface Camera {
   CameraRoll getCameraRoll();

   void setCameraRoll(CameraRoll cameraRoll);
   void doPhotograph();
   void breaking();
   boolean isBroken();
}
