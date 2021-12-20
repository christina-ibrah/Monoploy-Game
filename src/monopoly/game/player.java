/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Popup;
/**
 *
 * @author user
 */
public class player {
    String name;
    int money;
    int pos;
    boolean turn =false;
    Color c;
    JPanel pane_board;
    JLabel car;
    Popup pop;
    ArrayList<country> countries;
    ArrayList<train_station>  stations;
    ArrayList<Water_Works> water;
    ArrayList<Electric_Company> electric;
    boolean get_out_ofJailCard_chance=false;
    boolean get_out_ofJailCard_community=false;
    public player(String name,JPanel p,Color c,Popup op,JLabel car) {
        this.name = name;
      money=1500;
      pane_board=p;
      this.c=c;
      pop=op;
      this.car=car;
      countries=new ArrayList<country>();
      stations=new ArrayList<train_station>();
      water=new ArrayList<Water_Works>();
      electric=new ArrayList<Electric_Company>();
    }
  public  void inset_country(country coun_player)
  {
      countries.add(coun_player);
  }
}
