/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;

import javax.swing.JPanel;
import java.awt.Point;
/**
 *
 * @author user
 */
abstract public class field {
    String name;
   JPanel panel;
   Point point1,point2,point3,point4;

    public field(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4) {
        this.name = name;
        this.panel = panel;
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        this.point4 = p4;
    }

    
}
