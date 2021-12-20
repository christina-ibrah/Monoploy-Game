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
public class Tax extends field{
    final int tax;
    public Tax(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4,int tax) {
        super(name, panel, p1, p2, p3, p4);
        this.tax=tax;
    }
    
}
