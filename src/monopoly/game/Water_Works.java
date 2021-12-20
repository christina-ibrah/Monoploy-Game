/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;

import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author jesus
 */
public class Water_Works extends field{
   
   // int rent;
    int price;
    boolean sold=false;
    boolean ismortagage=false;
   // boolean isreturn=false;
    public Water_Works(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4,int price) {
        super(name,panel,p1,p2,p3,p4);
      // this.rent=rent; 
       this.price=price;
    }
    
    
    
}
