/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class community_chest extends field
{    
  static int index_card=-1;
 static ArrayList<String> commuinty_chest=new ArrayList<String>();
 public static boolean jail_card=false;
    public  community_chest(String name, JPanel panel, Point p1, Point p2, Point p3, Point p4) {
        super(name, panel, p1, p2, p3, p4);
    }
    public static void read() throws FileNotFoundException, IOException{
        File file2 = new File("E:\\Koky\\Graduated 2021\\CV\\Projects Githup\\MONOPOLY GAME PROJECT\\files\\COMMUNITY CHEST.txt");
          BufferedReader br2 = new BufferedReader(new FileReader(file2)); 
           String st;
          
          while ((st = br2.readLine()) != null) {
              commuinty_chest.add(st);
             }
          br2.close();

    }
    static public boolean checkedmoney =false;
     static int savemoney=0;
  
   
   static public String next_card(){
         
    index_card++;
    if(index_card==6&&jail_card){
    index_card++;
    }
    if(index_card==commuinty_chest.size()){
    index_card=0;
    }
    return(commuinty_chest.get(index_card));
    }
    static public void community_card(ArrayList <player> p,player player){
       // index_card=4;
    switch(index_card){
        case 0:
            if (player.money<50) 
             {
               savemoney=50;
               checkedmoney=true;
               JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
             }
            else
            player.money-=50;
            break;
           
        case 1:
           player.money+=10;
            break;
            
        case 2:
           player.money+=25;
            break;
            
        case 3:
          
             player.pos=1;
            break;
            
        case 4:
            board_test.btn_dice.setEnabled(false);
            board_test.btn_pay10.setVisible(true);
            board_test.btn_takeChance.setVisible(true);
            board_test.btn_pay10.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             if (player.money<10) 
             {
               savemoney=10;
               checkedmoney=true;
               JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
             }
            else
            player.money-=10;
             board_test.btn_pay10.setVisible(false);
            board_test.btn_takeChance.setVisible(false);
        }
 });
            
            board_test.btn_takeChance.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          //call function christeen m
            board_test.tp_chances.setText(chanse.next_card());
            chanse.chanse_card(p, player);
             board_test.btn_dice.setEnabled(true);
             board_test.btn_pay10.setVisible(false);
            board_test.btn_takeChance.setVisible(false);
        }
    });
            break;
           
        case 5:
         if (player.money<100) 
             {
               savemoney=100;
               checkedmoney=true;
               JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
             }
            else
            player.money-=100;
            break;
            
        case 6:
            player.get_out_ofJailCard_community=true;
            commuinty_chest.remove(6);
            jail_card=true;
          
            break;
            
        case 7:
           player.money+=200;
            break;
        case 8:
           // array[player.pos].panel.remove(player.car);
            //array[10].panel.add(player.car);
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
        case 9:
            player.money+=20;
            break;
        case 10:
             player.money+=100;
            break;
            
        case 11:
            
            //array[player.pos].panel.remove(player.car);
             //array[0].panel.add(player.car);
             player.pos=0;
             player.money+=200;
            break;
            
        case 12:
             for(int i=0;i<p.size();i++){
             if(player.name==p.get(i).name)
                 continue;
            player.money+=10;
              if (p.get(i).money<10) 
           {
               savemoney=10;
              checkedmoney=true;
                JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
           }
           else
             p.get(i).money-=10;
            
             }
            break;
            
        case 13:
             player.money+=50;
            break;
         
        case 14:
             if (player.money<50) 
             {
               savemoney=50;
               checkedmoney=true;
               JOptionPane.showMessageDialog(null, " No Enough Money"," Chance",JOptionPane.INFORMATION_MESSAGE);  
             }
            else
             player.money-=50;
            break;
        case 15:
            player.money+=100;
            break;
    }
 
    }
}
