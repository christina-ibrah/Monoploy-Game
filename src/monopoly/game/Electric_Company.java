package monopoly.game;

import java.awt.Point;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Electric_Company extends field{
   int price; 
   int rent;
   boolean sold=false;
   boolean ismortagage=false;
    public Electric_Company(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4,int price,int rent) {
        super(name, panel, p1, p2, p3, p4);
        this.price=price;
        this.rent=rent;
    }
}
