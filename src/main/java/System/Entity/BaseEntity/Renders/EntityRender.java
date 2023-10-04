package main.java.System.Entity.BaseEntity.Renders;

import main.java.System.Entity.BaseEntity.Entity;
import main.java.System.Scene.Scene;
import main.java.System.Setup.Setup;
import processing.core.PApplet;

public class EntityRender {
    public EntityRender() {

    }

    public void render(Entity e) {
        PApplet applet = Setup.getApplet();
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        float camX = currentScene.getCamera().getCamX();
        float camY = currentScene.getCamera().getCamY();
        applet.fill(255);
        applet.rect(e.getX() + camX, e.getY() + camY, e.getW(), e.getH());
        applet.noStroke();
    }

    public void preRender(Entity entity) {
        Setup.getApplet().noStroke();
    }
}
