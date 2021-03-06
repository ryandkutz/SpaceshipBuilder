/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshipbuilder.parts;

import com.badlogic.gdx.math.Vector2;
import javafx.scene.image.Image;


/**
 *
 * @author kutz_865792
 */



public class Engine extends ShipPart {
    
    private Vector2 thrust;
    private float fuelUsage;
    private String fuelType;
    
    public Engine() {
        super();
        this.thrust = new Vector2();
        this.fuelUsage = 1;
        fuelType = "default";
        super.setSprite("Assets/Engine.png");
    }

    public Engine(Vector2 thrust, float fuelUsage) {
        super();
        this.thrust = thrust;
        this.fuelUsage = fuelUsage;
        fuelType = "default";
        super.setSprite("Assets/Engine.png");
    }

    public Engine(Vector2 thrust, float fuelUsage, float mass) {
        super(mass);
        this.thrust = thrust;
        this.fuelUsage = fuelUsage;
        fuelType = "default";
        super.setSprite("Assets/Engine.png");
    }

    public Engine(Vector2 thrust, float fuelUsage, String fuelType) {
        this.thrust = thrust;
        this.fuelUsage = fuelUsage;
        this.fuelType = fuelType;
        super.setSprite("Assets/Engine.png");
    }

    public Engine(Vector2 thrust, float fuelUsage, String fuelType, float mass) {
        super(mass);
        this.thrust = thrust;
        this.fuelUsage = fuelUsage;
        this.fuelType = fuelType;
        super.setSprite("Assets/Engine.png");
    }
    
    public Vector2 getThrust() {
        return thrust;
    }

    public float getFuelUsage() {
        return fuelUsage;
    }

    public String getFuelType() {
        return fuelType;
    }
    
    public void setType(String type) {
        fuelType = type;
    }

    public void setThrust(Vector2 thrust) {
        this.thrust = thrust;
    }

    public void setFuelUsage(float fuelUsage) {
        this.fuelUsage = fuelUsage;
    }
    
    @Override
    public void setRotation(float rotation) {
        super.setRotation(rotation);
        thrust = new Vector2(0, thrust.len());
        thrust.rotate(rotation);
    }
    
}
