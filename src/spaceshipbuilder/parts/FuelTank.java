/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshipbuilder.parts;

import javafx.scene.image.Image;
import static utils.FuelTypes.density;

/**
 *
 * @author Gomez_866923
 */
public class FuelTank extends ShipPart {
    private String type;
    //In meters^2
    private float amount;
    private float containerMass;

    public FuelTank(String type, float amount, float containerMass) {
        super((density(type) * amount) + containerMass);
        this.containerMass = containerMass;
        this.type = type;
        setAmount(amount);
        setSprite("Assets/FuelTank.png");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        if(amount > 4)
            this.amount = 4;
        else this.amount = amount;
    }

    public float getContainerMass() {
        return containerMass;
    }
    
    
}
