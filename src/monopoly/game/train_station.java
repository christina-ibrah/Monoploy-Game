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
 * @author user
 */
public class train_station extends field{
final int price;
int rent;
player Owner_train;
boolean sold=false;
boolean ismortagage=false;
boolean isreturn=false;
    public train_station(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4,int rent) {
        super(name, panel, p1, p2, p3, p4);
        price=200;
        this.rent=rent;
    }
    public void calculate_rent(player p){
         
    }
}
