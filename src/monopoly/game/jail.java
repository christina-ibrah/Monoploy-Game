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
public class jail extends field{
int tax;
    public jail(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4) {
        super(name, panel, p1, p2, p3, p4);
        tax=50;
    }
    
}
