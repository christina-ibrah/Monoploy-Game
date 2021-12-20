/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class chanse extends field {
     static int index_card=-1;
static ArrayList<String> chanses=new ArrayList<String>();
public static boolean jail_card=false;
 
    public chanse(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4) 
    {
        super(name, panel, p1, p2, p3, p4);
    }
public static void read() throws FileNotFoundException, IOException{
File file1 = new File("E:\\Koky\\Graduated 2021\\CV\\Projects Githup\\MONOPOLY GAME PROJECT\\files\\CHANCE-1.txt"); 
  BufferedReader br1 = new BufferedReader(new FileReader(file1)); 
  String st;

  while ((st = br1.readLine()) != null) {
   chanses.add(st);
  }
        br1.close();
      
    

  }

   static public boolean checkedmoney =false;
     static int savemoney=0;
    public static String  next_card()
   {
       index_card++;
       if(index_card==14 &&jail_card){
       index_card++;
       }
       if(index_card==chanses.size())
       {
           index_card=0;
       }
       return (chanses.get(index_card));
   }
  public static void chanse_card(ArrayList <player> p,player player)
   {
        //index_card=3;
       switch(index_card)
       {
           case 0:
             
             JOptionPane.showMessageDialog(null, " No houses and Hotels are Built "," Chance",JOptionPane.INFORMATION_MESSAGE);  
               break;       
           case 1:
               player.money+=100;
               break;
               
           case 2:
               
               player.pos=10;
            if (player.money<50) 
               {
                savemoney=50;
                checkedmoney=true;
                JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
               }
             else
               player.money-=50;
               break;
               
               
           case 3:
               if(player.pos>24)
               {
              
                   player.pos=24;
                   player.money+=200;
               }
               else if (player.pos<24){
                   
                   player.pos=24;
               }
               break;
               
           case 4:
               
               player.pos-=3;
               
              
               break;
               
           case 5:
               
               player.pos=0;
               break;
               
           case 6:
               
                JOptionPane.showMessageDialog(null, " You do Not have any Buildings "," Chance",JOptionPane.INFORMATION_MESSAGE);
               break;
               
           case 7:
               if(player.pos>11)
               {
                   //array[player.pos].panel.remove(player.car);
                   //array[11].panel.add(player.car);
                   player.pos=11;
                   player.money+=200;
               }
               else if (player.pos<11){
                   //array[player.pos].panel.remove(player.car);
                   //array[11].panel.add(player.car);
                   player.pos=11;
               }
               break;
               
               
           case 8:
                if (player.money<15) 
               {
                savemoney=15;
                checkedmoney=true;
                JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
               }
             else
               player.money-=15;
               break;
               
           case 9:
               //array[player.pos].panel.remove(player.car);
               //array[39].panel.add(player.car);
               player.pos=39;
               break;
               
               
           case 10:
                if (player.money<150) 
               {
                savemoney=150;
                checkedmoney=true;
                JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
               }
             else
               
              player.money-=150;
               break;
               
               
           case 11:
               if(player.pos>18)
               {
                 //  array[player.pos].panel.remove(player.car);
                   //array[18].panel.add(player.car);
                   player.pos=18;
                   player.money+=200;
               }
               else if (player.pos<18){
                   //array[player.pos].panel.remove(player.car);
                   //array[18].panel.add(player.car);
                 player.pos=18;
               }
               break;
               
               
               
           case 12:
                if (player.money<20) 
               {
                savemoney=20;
                checkedmoney=true;
                JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
               }
             else
               player.money-=20;
               break;
               
           case 13:
               player.money+=150;
               break;
               
               
           case 14:
               
              player.get_out_ofJailCard_chance=true;
              jail_card=true;
              chanses.remove(14);         
               break;
               
           case 15:
               player.money+=50;
               break;
               
               
                
               
        }
               
               
               
       }
   
}
