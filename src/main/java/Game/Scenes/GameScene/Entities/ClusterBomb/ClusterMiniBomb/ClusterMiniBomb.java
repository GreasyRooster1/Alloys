package main.java.Game.Scenes.GameScene.Entities.ClusterBomb.ClusterMiniBomb;

import main.java.Game.Scenes.GameScene.Entities.Explosion.Explosion;
import main.java.Game.Scenes.GameScene.Entities.Hit.Hit;
import main.java.Game.Scenes.GameScene.Entities.Missile.MissileRender;
import main.java.System.Setup.Setup;
import processing.core.PApplet;

import java.util.Set;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;

public class ClusterMiniBomb extends Hit {
    private int fuse = (int) Setup.getApplet().random(10,20);
    public ClusterMiniBomb(float xa, float ya) {
        super(xa, ya);
        setRender(new MissileRender());
        setSize(6);
        setFriction(1);
    }

    @Override
    public void everyFrame() {
        super.everyFrame();
        fuse--;
        if(fuse<=0){
            Setup.getSceneManager().getCurrentScene().addEntity(new Explosion(getX(),getY()));
            kill();
        }
    }

    public void setDir(float dir){
        PApplet applet = Setup.getApplet();
        setXvel(cos(dir)*applet.random(1,5));
        setYvel(sin(dir)*applet.random(1,5));
    }
}
