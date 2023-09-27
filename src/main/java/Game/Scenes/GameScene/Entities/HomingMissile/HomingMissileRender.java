package main.java.Game.Scenes.GameScene.Entities.HomingMissile;

import main.java.System.Entity.BaseEntity.Entity;
import main.java.System.Entity.BaseEntity.Renders.EntityRender;
import main.java.System.Scene.Scene;
import main.java.System.Setup.Setup;
import processing.core.PApplet;

import static processing.core.PApplet.*;

public class HomingMissileRender extends EntityRender {
    @Override
    public void render(Entity e) {
        PApplet applet = Setup.getApplet();
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        float camX = currentScene.getCamera().getCamX();
        float camY = currentScene.getCamera().getCamY();
        applet.fill(255,0,50);
        applet.ellipse(e.getX() + camX, e.getY() + camY, e.getW(), e.getH());
        float dir = atan2(Setup.getMouseY()-e.getY(),Setup.getMouseX()-e.getX());
        applet.line(e.getX() + camX, e.getY() + camY,e.getX() + camX+cos(dir)*10, e.getY() + camY+sin(dir)*10);
    }
}
