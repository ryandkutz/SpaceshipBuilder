/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshipbuilder.parts.engines;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import spaceshipbuilder.parts.*;
/**
 *
 * @author kutz_865792
 */
public class TestEngine extends Engine {
    
    //This is a test, please ignore
    
    public TestEngine(int x, int y)
    {
        super(x, y, new Vector2D(0, 10), 10, 10);
    }
}
