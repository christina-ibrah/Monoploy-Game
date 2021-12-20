/*-
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;
//import jaco.mp3.player.MP3Player;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.Popup;
import javax.swing.PopupFactory;



/**
 *
 * @author user
 */
public class board_test extends javax.swing.JFrame {

 

    /**
     * Creates new form board_test
     */
     public Popup op1;
     public Popup op2;
     public Popup op3;
     public Popup op4;
     public PopupFactory pf=new PopupFactory();
     public boolean check =false;// use in function of buying the jail card
     public  int saveindex=0;// use in function of buying the jail card
 
     public ArrayList<player> players=new ArrayList<player>();;
     public field Fields[];
    JLabel car1;
    JLabel car2;
    JLabel car3;
    JLabel car4;
    public int numOfPlayers;
    public int index=0;
    public void refersh(){
        if(numOfPlayers==2){
            tf_p1Mon.setText( Integer.toString(players.get(0).money)+" $");
            tf_p2Mon.setText( Integer.toString(players.get(1).money)+" $");
        }
        else  if(numOfPlayers==3){
            tf_p1Mon.setText( Integer.toString(players.get(0).money)+" $");
            tf_p2Mon.setText( Integer.toString(players.get(1).money)+" $");
            tf_p3Mon.setText( Integer.toString(players.get(2).money)+" $");
          }
          
         else if(numOfPlayers==4){
             tf_p1Mon.setText( Integer.toString(players.get(0).money)+" $");
            tf_p2Mon.setText( Integer.toString(players.get(1).money)+" $");
            tf_p3Mon.setText( Integer.toString(players.get(2).money)+" $");
            tf_p4Mon.setText( Integer.toString(players.get(3).money)+" $");
         }
      
    }
    
    public board_test(int num,String nameOfp1,String nameOfp2,String nameOfp3,String nameOfp4) throws IOException  {
        initComponents();
           Fields= new field[40];
           Fields[0]= new go("Go",panel1,new Point(panel1.getX()+4,panel1.getY()+26),new Point(panel1.getX()+68,panel1.getY()+24),new Point(panel1.getX()+2,panel1.getY()+80),new Point(panel1.getX()+68,panel1.getY()+80));
           Fields[1]= new country("MEDITERRANEAN AVENUE",Panel2,new Point(Panel2.getX()+2,Panel2.getY()+24),new Point(Panel2.getX()+59,Panel2.getY()+24),new Point(Panel2.getX()+2,Panel2.getY()+81),new Point(Panel2.getX()+59,Panel2.getY()+81),60,2);           
           Fields[2]= new community_chest("cumm1",Panel3,new Point(Panel3.getX()+2,Panel3.getY()+24),new Point(Panel3.getX()+59,Panel3.getY()+24),new Point(Panel3.getX()+2,Panel3.getY()+81),new Point(Panel3.getX()+59,Panel3.getY()+81));
           Fields[3]= new country("BALTIC AVENUE",Panel4,new Point(Panel4.getX()+2,Panel4.getY()+24),new Point(Panel4.getX()+59,Panel4.getY()+24),new Point(Panel4.getX()+2,Panel4.getY()+81),new Point(Panel4.getX()+59,Panel4.getY()+81),60,4); 
           Fields[4]= new Tax("Income tax",this.Panel5,new Point(Panel5.getX(),Panel5.getY()+26),new Point(Panel5.getX()+59,Panel5.getY()+26),new Point(Panel5.getX(),Panel5.getY()+81),new Point(Panel5.getX()+59,Panel5.getY()+81),200);       
           Fields[5]= new train_station("READING RAILOAD",Panel6,new Point(Panel6.getX()+2,Panel6.getY()+24),new Point(Panel6.getX()+59,Panel6.getY()+24),new Point(Panel6.getX()+2,Panel6.getY()+81),new Point(Panel6.getX()+59,Panel6.getY()+81),6);
           Fields[6]= new country("ORIENTAL AVENUE",Panel7,new Point(Panel7.getX()+2,Panel7.getY()+24),new Point(Panel7.getX()+59,Panel7.getY()+24),new Point(Panel7.getX()+2,Panel7.getY()+81),new Point(Panel7.getX()+59,Panel7.getY()+81),100,6);    
           Fields[7]= new chanse("chanse1",Panel8,new Point(Panel8.getX()+2,Panel8.getY()+24),new Point(Panel8.getX()+59,Panel8.getY()+24),new Point(Panel8.getX()+2,Panel8.getY()+81),new Point(Panel8.getX()+59,Panel8.getY()+81));
           Fields[8]= new country("VERMONT AVENUE",Panel9,new Point(Panel9.getX()+2,Panel9.getY()+24),new Point(Panel9.getX()+59,Panel9.getY()+24),new Point(Panel9.getX()+2,Panel9.getY()+81),new Point(Panel9.getX()+59,Panel9.getY()+81),100,6);
           Fields[9]= new country("CONNECTICUT AVENUE",Panel10,new Point(Panel10.getX()+2,Panel10.getY()+24),new Point(Panel10.getX()+59,Panel10.getY()+24),new Point(Panel10.getX()+2,Panel10.getY()+81),new Point(Panel10.getX()+59,Panel10.getY()+81),120,8);
           Fields[10]= new jail("Jail",Panel11,new Point(Panel11.getX()+2,Panel11.getY()+24),new Point(Panel11.getX()+68,Panel11.getY()+24),new Point(Panel11.getX()+2,Panel11.getY()+80),new Point(Panel11.getX()+68,Panel11.getY()+80));
           Fields[11]= new country("ST.CHARLES PLACE",Panel12,new Point(Panel12.getX(),Panel12.getY()+24),new Point(Panel12.getX()+69,Panel12.getY()+24),new Point(Panel12.getX(),Panel12.getY()+62),new Point(Panel12.getX()+69,Panel12.getY()+62),140,10);
           Fields[12]= new Electric_Company("ELECTRIC COMPANY",Panel13,new Point(Panel13.getX(),Panel13.getY()+24),new Point(Panel13.getX()+69,Panel13.getY()+24),new Point(Panel13.getX(),Panel13.getY()+62),new Point(Panel13.getX()+69,Panel13.getY()+62),150,60);
           Fields[13]= new country("STATES AVENUE",Panel14,new Point(Panel14.getX(),Panel14.getY()+24),new Point(Panel14.getX()+69,Panel14.getY()+24),new Point(Panel14.getX(),Panel14.getY()+62),new Point(Panel14.getX()+69,Panel14.getY()+62),140,10);
           Fields[14]= new country("VIRGINIA AVENUE",Panel15,new Point(Panel15.getX(),Panel15.getY()+34),new Point(Panel15.getX()+69,Panel15.getY()+34),new Point(Panel15.getX(),Panel15.getY()+62),new Point(Panel15.getX()+69,Panel15.getY()+62),160,12);
           Fields[15]= new train_station("PENNSYLVANIA RAILROAD",Panel16,new Point(Panel16.getX(),Panel16.getY()+24),new Point(Panel16.getX()+69,Panel16.getY()+24),new Point(Panel16.getX(),Panel16.getY()+62),new Point(Panel16.getX()+69,Panel16.getY()+62),25);          
           Fields[16]= new country("ST.JAMES PLACE",Panel17,new Point(Panel17.getX(),Panel17.getY()+24),new Point(Panel17.getX()+69,Panel17.getY()+24),new Point(Panel17.getX(),Panel17.getY()+62),new Point(Panel17.getX()+69,Panel17.getY()+62),180,14);
           Fields[17]= new community_chest("cumm2",Panel18,new Point(Panel18.getX(),Panel18.getY()+24),new Point(Panel18.getX()+69,Panel18.getY()+24),new Point(Panel18.getX(),Panel18.getY()+62),new Point(Panel18.getX()+69,Panel18.getY()+62));
           Fields[18]= new country("TENNLSSLE AVENUE",Panel19,new Point(Panel19.getX(),Panel19.getY()+24),new Point(Panel19.getX()+69,Panel19.getY()+24),new Point(Panel19.getX(),Panel19.getY()+62),new Point(Panel19.getX()+69,Panel19.getY()+62),180,14);
           Fields[19]= new country("NEW YORK AVENUE",Panel20,new Point(Panel20.getX(),Panel20.getY()+24),new Point(Panel20.getX()+69,Panel20.getY()+24),new Point(Panel20.getX(),Panel20.getY()+62),new Point(Panel20.getX()+69,Panel20.getY()+62),200,16);
           Fields[20]= new Free_Parking("free parking",Panel21,new Point(Panel21.getX(),Panel21.getY()+24),new Point(Panel21.getX()+69,Panel21.getY()+24),new Point(Panel21.getX(),Panel21.getY()+82),new Point(Panel21.getX()+69,Panel21.getY()+82));
         
           
           Fields[21]= new country("KENTUCKY AVENUE",Panel22,new Point(Panel22.getX()+2,Panel22.getY()+24),new Point(Panel22.getX()+59,Panel22.getY()+24),new Point(Panel22.getX()+2,Panel22.getY()+81),new Point(Panel22.getX()+59,Panel22.getY()+81),220,18);
           Fields[22]= new chanse("chanse2",Panel23,new Point(Panel23.getX()+2,Panel23.getY()+24),new Point(Panel23.getX()+59,Panel23.getY()+24),new Point(Panel23.getX()+2,Panel23.getY()+81),new Point(Panel23.getX()+59,Panel23.getY()+81));
           Fields[23]= new country("ILLINOIS AVENUE",Panel24,new Point(Panel24.getX()+2,Panel24.getY()+24),new Point(Panel24.getX()+59,Panel24.getY()+24),new Point(Panel24.getX()+2,Panel24.getY()+81),new Point(Panel24.getX()+59,Panel24.getY()+81),220,18);
           Fields[24]=new country("INDIANA AVENUE",Panel25,new Point(Panel25.getX()+2,Panel25.getY()+24),new Point(Panel25.getX()+59,Panel25.getY()+24),new Point(Panel25.getX()+2,Panel25.getY()+81),new Point(Panel25.getX()+59,Panel25.getY()+81),240,20);
           Fields[25]=new train_station("B&Q RAILOAD",Panel26,new Point(Panel26.getX()+2,Panel22.getY()+24),new Point(Panel26.getX()+59,Panel26.getY()+24),new Point(Panel26.getX()+2,Panel26.getY()+81),new Point(Panel26.getX()+59,Panel26.getY()+81),25);
           Fields[26]= new country("ATLANTIC AVENUE",Panel27,new Point(Panel27.getX()+2,Panel27.getY()+24),new Point(Panel27.getX()+59,Panel27.getY()+24),new Point(Panel27.getX()+2,Panel27.getY()+81),new Point(Panel27.getX()+59,Panel27.getY()+81),260,22);
           Fields[27]= new country("VENTNOR AVENUE",Panel28,new Point(Panel28.getX()+2,Panel28.getY()+24),new Point(Panel28.getX()+59,Panel28.getY()+24),new Point(Panel28.getX()+2,Panel28.getY()+81),new Point(Panel28.getX()+59,Panel28.getY()+81),260,22);
           Fields[28]= new Water_Works("WATER WORKS",Panel29,new Point(Panel29.getX()+2,Panel29.getY()+24),new Point(Panel29.getX()+59,Panel29.getY()+24),new Point(Panel29.getX()+2,Panel29.getY()+81),new Point(Panel29.getX()+59,Panel29.getY()+81),150);
           Fields[29]= new country("MARVIN AVENUE",Panel30,new Point(Panel30.getX()+2,Panel30.getY()+24),new Point(Panel30.getX()+59,Panel30.getY()+24),new Point(Panel30.getX()+2,Panel30.getY()+81),new Point(Panel30.getX()+59,Panel30.getY()+81),280,24);
           Fields[30]= new Go_to_Jail("GO TO JAIL",Panel31,new Point(Panel31.getX(),Panel31.getY()+24),new Point(Panel31.getX()+69,Panel31.getY()+24),new Point(Panel31.getX(),Panel31.getY()+82),new Point(Panel31.getX()+69,Panel31.getY()+82));

           Fields[31]= new country("PACIFIC AVENUE",Panel32,new Point(Panel32.getX(),Panel32.getY()+24),new Point(Panel32.getX()+69,Panel32.getY()+24),new Point(Panel32.getX(),Panel32.getY()+62),new Point(Panel32.getX()+69,Panel32.getY()+62),300,26);
           Fields[32]= new country("NORTH CAROLINA AVENUE",Panel33,new Point(Panel33.getX(),Panel33.getY()+24),new Point(Panel33.getX()+69,Panel33.getY()+24),new Point(Panel33.getX(),Panel33.getY()+62),new Point(Panel33.getX()+69,Panel33.getY()+62),300,26);
           Fields[33]= new community_chest("cumm3",Panel34,new Point(Panel34.getX(),Panel34.getY()+24),new Point(Panel34.getX()+69,Panel34.getY()+24),new Point(Panel34.getX(),Panel34.getY()+62),new Point(Panel34.getX()+69,Panel34.getY()+62));
           Fields[34]=  new country("PENNSYLVANIA AVENUE",Panel35,new Point(Panel35.getX(),Panel35.getY()+24),new Point(Panel35.getX()+69,Panel35.getY()+24),new Point(Panel35.getX(),Panel35.getY()+62),new Point(Panel35.getX()+69,Panel35.getY()+62),320,28);
           Fields[35]=  new train_station("short line",Panel36,new Point(Panel36.getX(),Panel36.getY()+24),new Point(Panel36.getX()+69,Panel36.getY()+24),new Point(Panel36.getX(),Panel36.getY()+62),new Point(Panel36.getX()+69,Panel36.getY()+62),25);
           Fields[36]=  new chanse("chanse3",Panel37,new Point(Panel37.getX(),Panel37.getY()+24),new Point(Panel37.getX()+69,Panel37.getY()+24),new Point(Panel37.getX(),Panel37.getY()+62),new Point(Panel37.getX()+69,Panel37.getY()+62));
           Fields[37]=  new country("PARK PLACE",Panel38,new Point(Panel38.getX(),Panel38.getY()+24),new Point(Panel38.getX()+69,Panel38.getY()+24),new Point(Panel38.getX(),Panel38.getY()+62),new Point(Panel38.getX()+69,Panel38.getY()+62),350,35);
           Fields[38]= new Tax("LUXURY tax",Panel39,new Point(Panel39.getX(),Panel39.getY()+24),new Point(Panel39.getX()+69,Panel39.getY()+24),new Point(Panel39.getX(),Panel39.getY()+62),new Point(Panel39.getX()+69,Panel39.getY()+62),100);
           Fields[39]=  new country("BOARDWALK",Panel40,new Point(Panel40.getX(),Panel40.getY()+24),new Point(Panel40.getX()+69,Panel40.getY()+24),new Point(Panel40.getX(),Panel40.getY()+55),new Point(Panel40.getX()+69,Panel40.getY()+55),400,50);
        numOfPlayers=num;
       community_chest.read();
       chanse.read();
    btn_pay10.setVisible(false);
    btn_takeChance.setVisible(false);
        Color player1c=panel_player1.getBackground();
        Color player2c=panel_player2.getBackground();
      if(num==2){        
          car1=new JLabel();
         String image="/yellow_car.jpg";
         car1.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));
         car2=new JLabel();
         String image2="/blue_car.jpg";
         car2.setIcon(new javax.swing.ImageIcon(getClass().getResource(image2)));
         players.add(new player(nameOfp1,panel_player1,player1c,op1,car1));
         players.add(new player(nameOfp2,panel_player2,player2c,op2,car2));
         panel_player3.setVisible(false);
         panel_player4.setVisible(false);
         players.get(0).pop=pf.getPopup(this, car1,Fields[0].point1.x, Fields[0].point1.y);
         players.get(0).pop.show();
         players.get(1).pop=pf.getPopup(this, car2, Fields[0].point2.x,Fields[0].point2.y);
         players.get(1).pop.show();
          lb_p1.setText(nameOfp1);
         lb_p2.setText(nameOfp2);
      }
      else if(num==3){
         
          car1=new JLabel();
         String image="/yellow_car.jpg";
         car1.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));
         car2=new JLabel();
         String image2="/blue_car.jpg";
         car2.setIcon(new javax.swing.ImageIcon(getClass().getResource(image2)));
         car3=new JLabel();
         String image3="/green_car.jpg";
         car3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image3)));
      players.add(new player(nameOfp1,panel_player1,panel_player1.getBackground(),op1,car1));
      players.add(new player(nameOfp2,panel_player2,panel_player2.getBackground(),op2,car2));
      players.add(new player(nameOfp3,panel_player3,panel_player3.getBackground(),op3,car3));
       panel_player4.setVisible(false);  
         players.get(0).pop=pf.getPopup(this, car1,Fields[0].point1.x, Fields[0].point1.y);
         players.get(0).pop.show();
         players.get(1).pop=pf.getPopup(this, car2, Fields[0].point2.x,Fields[0].point2.y);
         players.get(1).pop.show();
         players.get(2).pop=pf.getPopup(this, car3, Fields[0].point3.x,Fields[0].point3.y);
         players.get(2).pop.show();
         lb_p1.setText(nameOfp1);
         lb_p2.setText(nameOfp2);
         lb_p3.setText(nameOfp3);
      } else if(num==4){
                car1=new JLabel();
         String image="/yellow_car.jpg";
         car1.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));
         car2=new JLabel();
         String image2="/blue_car.jpg";
         car2.setIcon(new javax.swing.ImageIcon(getClass().getResource(image2)));
         car3=new JLabel();
         String image3="/green_car.jpg";
         car3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image3)));
         car4=new JLabel();
         String image4="/red_car.jpg";
         car4.setIcon(new javax.swing.ImageIcon(getClass().getResource(image4)));
      players.add(new player(nameOfp1,panel_player1,panel_player1.getBackground(),op1,car1));
      players.add(new player(nameOfp2,panel_player2,panel_player2.getBackground(),op2,car2));
      players.add(new player(nameOfp3,panel_player3,panel_player3.getBackground(),op3,car3));
      players.add(new player(nameOfp4,panel_player4,panel_player4.getBackground(),op4,car4));  
   
         players.get(0).pop=pf.getPopup(this, car1,Fields[0].point1.x, Fields[0].point1.y);
         players.get(0).pop.show();
         players.get(1).pop=pf.getPopup(this, car2, Fields[0].point2.x,Fields[0].point2.y);
         players.get(1).pop.show();
         players.get(2).pop=pf.getPopup(this, car3, Fields[0].point3.x,Fields[0].point3.y);
         players.get(2).pop.show();
         players.get(3).pop=pf.getPopup(this, car4, Fields[0].point4.x,Fields[0].point4.y);
         players.get(3).pop.show();
             lb_p1.setText(nameOfp1);
             lb_p2.setText(nameOfp2);
             lb_p3.setText(nameOfp3);
             lb_p4.setText(nameOfp4);
      }
      refersh();
      players.get(index).turn=true;
      change_color(players.get(index));

    }
   public static final String song ="E:\\Koky\\Graduated 2021\\CV\\Projects Githup\\MONOPOLY GAME PROJECT\\music\\game music.mp3";
   public static final String song1 ="E:\\Koky\\Graduated 2021\\CV\\Projects Githup\\MONOPOLY GAME PROJECT\\music\\dice.mp3 ";
   public static final String song2="E:\\Koky\\Graduated 2021\\CV\\Projects Githup\\MONOPOLY GAME PROJECT\\music\\winner.mp3";
//   MP3Player mp3 =new MP3Player(new File(song));
    //MP3Player mp31 =new MP3Player(new File(song1));
  //  MP3Player winner_music=new MP3Player(new File(song2));
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel4 = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        Panel8 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        Panel9 = new javax.swing.JPanel();
        label13 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        Panel21 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        Panel10 = new javax.swing.JPanel();
        label16 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        Panel30 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Panel25 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Panel23 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        Panel27 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Panel29 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        Panel24 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Panel22 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Panel31 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Panel28 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Panel32 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Panel33 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        Panel34 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        Panel35 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Panel36 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jPanel117 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Panel37 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        Panel38 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Panel39 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        Panel40 = new javax.swing.JPanel();
        jPanel125 = new javax.swing.JPanel();
        jPanel126 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jPanel129 = new javax.swing.JPanel();
        jPanel130 = new javax.swing.JPanel();
        jPanel131 = new javax.swing.JPanel();
        jPanel132 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jPanel134 = new javax.swing.JPanel();
        jPanel135 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jPanel137 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Panel20 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Panel19 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Panel18 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        Panel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Panel16 = new javax.swing.JPanel();
        jPanel145 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        jPanel147 = new javax.swing.JPanel();
        jPanel148 = new javax.swing.JPanel();
        jPanel149 = new javax.swing.JPanel();
        jPanel150 = new javax.swing.JPanel();
        jPanel151 = new javax.swing.JPanel();
        jPanel152 = new javax.swing.JPanel();
        jPanel153 = new javax.swing.JPanel();
        jPanel154 = new javax.swing.JPanel();
        jPanel155 = new javax.swing.JPanel();
        jPanel156 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jPanel158 = new javax.swing.JPanel();
        jPanel159 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Panel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Panel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Panel13 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        jPanel164 = new javax.swing.JPanel();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jPanel167 = new javax.swing.JPanel();
        jPanel168 = new javax.swing.JPanel();
        jPanel169 = new javax.swing.JPanel();
        jPanel170 = new javax.swing.JPanel();
        jPanel171 = new javax.swing.JPanel();
        jPanel172 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        jPanel174 = new javax.swing.JPanel();
        jPanel175 = new javax.swing.JPanel();
        jPanel176 = new javax.swing.JPanel();
        jPanel177 = new javax.swing.JPanel();
        jPanel178 = new javax.swing.JPanel();
        label17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Panel7 = new javax.swing.JPanel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        Panel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Panel26 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        lab_image = new javax.swing.JLabel();
        lab_image2 = new javax.swing.JLabel();
        btn_dice = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btn_mortgage = new javax.swing.JButton();
        btn_pay10 = new javax.swing.JButton();
        btn_takeChance = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tp_chances = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_commuintyChest = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel_player1 = new javax.swing.JPanel();
        lb_p1 = new javax.swing.JLabel();
        tf_p1Mon = new javax.swing.JTextField();
        player1_countries = new javax.swing.JButton();
        p1_buyjailcard = new javax.swing.JButton();
        p1_selljailcard = new javax.swing.JButton();
        panel_player4 = new javax.swing.JPanel();
        lb_p4 = new javax.swing.JLabel();
        tf_p4Mon = new javax.swing.JTextField();
        player4_countries = new javax.swing.JButton();
        p4_buyjailcard = new javax.swing.JButton();
        p4_selljailcard = new javax.swing.JButton();
        panel_player2 = new javax.swing.JPanel();
        lb_p2 = new javax.swing.JLabel();
        tf_p2Mon = new javax.swing.JTextField();
        player2_countries = new javax.swing.JButton();
        p2_buyjailcard1 = new javax.swing.JButton();
        p2_selljailcard = new javax.swing.JButton();
        panel_player3 = new javax.swing.JPanel();
        lb_p3 = new javax.swing.JLabel();
        tf_p3Mon = new javax.swing.JTextField();
        player3_countries = new javax.swing.JButton();
        p3_buyjailcard = new javax.swing.JButton();
        p3_selljailcard = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        Panel4.setBackground(new java.awt.Color(255, 255, 255));
        Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel4.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel4.setPreferredSize(new java.awt.Dimension(68, 102));

        label4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label4.setText("$60");

        label5.setBackground(new java.awt.Color(0, 51, 51));
        label5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 204));
        label5.setText("BALTIC");

        label6.setBackground(new java.awt.Color(0, 51, 51));
        label6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 204));
        label6.setText("AVENUE");

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                                .addComponent(label6)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                                .addComponent(label4)
                                .addContainerGap())))
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addComponent(label5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(label5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(Panel4);
        Panel4.setBounds(640, 610, 90, 80);

        Panel8.setBackground(new java.awt.Color(255, 255, 255));
        Panel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel8.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel8.setPreferredSize(new java.awt.Dimension(68, 102));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 204, 204));
        jLabel74.setText("CHANSE");

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel74)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(Panel8);
        Panel8.setBounds(280, 610, 90, 80);

        Panel6.setBackground(new java.awt.Color(255, 255, 255));
        Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel6.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel6.setPreferredSize(new java.awt.Dimension(68, 102));
        Panel6.setLayout(null);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/train4.jpg"))); // NOI18N
        Panel6.add(jLabel46);
        jLabel46.setBounds(0, 0, 80, 50);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("$200");
        Panel6.add(jLabel55);
        jLabel55.setBounds(20, 60, 36, 17);

        getContentPane().add(Panel6);
        Panel6.setBounds(460, 610, 90, 80);

        Panel9.setBackground(new java.awt.Color(255, 255, 255));
        Panel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel9.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel9.setPreferredSize(new java.awt.Dimension(68, 102));
        Panel9.setLayout(null);

        label13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label13.setText("$100");
        Panel9.add(label13);
        label13.setBounds(50, 50, 32, 15);

        label11.setBackground(new java.awt.Color(0, 51, 51));
        label11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label11.setForeground(new java.awt.Color(51, 0, 0));
        label11.setText("VERMONT");
        Panel9.add(label11);
        label11.setBounds(20, 10, 59, 15);

        label12.setBackground(new java.awt.Color(0, 51, 51));
        label12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label12.setForeground(new java.awt.Color(51, 0, 0));
        label12.setText("AVENUE");
        Panel9.add(label12);
        label12.setBounds(20, 30, 47, 15);

        getContentPane().add(Panel9);
        Panel9.setBounds(190, 610, 90, 80);

        Panel3.setBackground(new java.awt.Color(255, 255, 255));
        Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel3.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel3.setPreferredSize(new java.awt.Dimension(68, 102));
        Panel3.setLayout(null);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/com c.png"))); // NOI18N
        Panel3.add(jLabel60);
        jLabel60.setBounds(10, 0, 70, 80);

        getContentPane().add(Panel3);
        Panel3.setBounds(730, 610, 90, 80);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setMinimumSize(new java.awt.Dimension(60, 102));
        panel1.setName("panal1"); // NOI18N
        panel1.setPreferredSize(new java.awt.Dimension(68, 102));
        panel1.setLayout(null);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel72.setText("<- GO");
        panel1.add(jLabel72);
        jLabel72.setBounds(10, 20, 90, 40);

        getContentPane().add(panel1);
        panel1.setBounds(910, 610, 100, 80);

        Panel21.setBackground(new java.awt.Color(255, 255, 255));
        Panel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel21.setForeground(new java.awt.Color(0, 204, 204));
        Panel21.setName("panal1"); // NOI18N
        Panel21.setPreferredSize(new java.awt.Dimension(102, 100));
        Panel21.setLayout(null);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/free parking.jpg"))); // NOI18N
        Panel21.add(jLabel57);
        jLabel57.setBounds(20, 0, 70, 80);

        getContentPane().add(Panel21);
        Panel21.setBounds(0, 0, 100, 80);

        Panel10.setBackground(new java.awt.Color(255, 255, 255));
        Panel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel10.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel10.setPreferredSize(new java.awt.Dimension(68, 102));

        label16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label16.setText("$120");

        label14.setBackground(new java.awt.Color(0, 51, 51));
        label14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        label14.setForeground(new java.awt.Color(51, 0, 0));
        label14.setText("CONNECTICUT");

        label15.setBackground(new java.awt.Color(0, 51, 51));
        label15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label15.setForeground(new java.awt.Color(51, 0, 0));
        label15.setText("AVENUE");

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(label14))
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel10Layout.createSequentialGroup()
                                .addComponent(label15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label16)))))
                .addContainerGap())
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(Panel10);
        Panel10.setBounds(100, 610, 90, 80);

        Panel30.setBackground(new java.awt.Color(255, 255, 255));
        Panel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel30.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel30.setPreferredSize(new java.awt.Dimension(70, 102));
        Panel30.setLayout(null);

        jLabel26.setBackground(new java.awt.Color(255, 255, 0));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 255, 255));
        jLabel26.setText("MARVIN");
        Panel30.add(jLabel26);
        jLabel26.setBounds(0, 0, 62, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 255, 255));
        jLabel27.setText("GARDENS");
        Panel30.add(jLabel27);
        jLabel27.setBounds(10, 20, 58, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("$280");
        Panel30.add(jLabel28);
        jLabel28.setBounds(40, 40, 32, 15);

        getContentPane().add(Panel30);
        Panel30.setBounds(820, 0, 90, 80);

        Panel25.setBackground(new java.awt.Color(255, 255, 255));
        Panel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel25.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel25.setPreferredSize(new java.awt.Dimension(70, 102));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 0, 0));
        jLabel37.setText("INDIANA");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 0, 0));
        jLabel36.setText("AVENUE");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("$240");

        javax.swing.GroupLayout Panel25Layout = new javax.swing.GroupLayout(Panel25);
        Panel25.setLayout(Panel25Layout);
        Panel25Layout.setHorizontalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel25Layout.setVerticalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel25Layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(Panel25);
        Panel25.setBounds(370, 0, 90, 80);

        Panel23.setBackground(new java.awt.Color(255, 255, 255));
        Panel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel23.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel23.setPreferredSize(new java.awt.Dimension(70, 102));
        Panel23.setLayout(null);

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 204, 204));
        jLabel75.setText("CHANSE");
        Panel23.add(jLabel75);
        jLabel75.setBounds(10, 30, 60, 17);

        getContentPane().add(Panel23);
        Panel23.setBounds(190, 0, 90, 80);

        Panel27.setBackground(new java.awt.Color(255, 255, 255));
        Panel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel27.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel27.setPreferredSize(new java.awt.Dimension(70, 102));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 255, 255));
        jLabel35.setText("ATLANTIC");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 255, 255));
        jLabel40.setText("AVENUE");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("$260");

        javax.swing.GroupLayout Panel27Layout = new javax.swing.GroupLayout(Panel27);
        Panel27.setLayout(Panel27Layout);
        Panel27Layout.setHorizontalGroup(
            Panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel27Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel27Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        Panel27Layout.setVerticalGroup(
            Panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel27Layout.createSequentialGroup()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(Panel27);
        Panel27.setBounds(550, 0, 90, 80);

        Panel29.setBackground(new java.awt.Color(255, 255, 255));
        Panel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel29.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel29.setPreferredSize(new java.awt.Dimension(70, 102));
        Panel29.setLayout(null);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/hjhkj (1).jpg"))); // NOI18N
        Panel29.add(jLabel70);
        jLabel70.setBounds(10, 0, 70, 80);

        getContentPane().add(Panel29);
        Panel29.setBounds(730, 0, 90, 80);

        Panel24.setBackground(new java.awt.Color(255, 255, 255));
        Panel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel24.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel24.setPreferredSize(new java.awt.Dimension(70, 102));
        Panel24.setLayout(null);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 0, 51));
        jLabel38.setText("ILLINOIS");
        Panel24.add(jLabel38);
        jLabel38.setBounds(10, 0, 60, 20);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 0, 0));
        jLabel33.setText("AVENUE");
        Panel24.add(jLabel33);
        jLabel33.setBounds(10, 20, 50, 20);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("$220");
        Panel24.add(jLabel54);
        jLabel54.setBounds(40, 40, 36, 17);

        getContentPane().add(Panel24);
        Panel24.setBounds(280, 0, 90, 80);

        Panel22.setBackground(new java.awt.Color(255, 255, 255));
        Panel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel22.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel22.setName(""); // NOI18N
        Panel22.setPreferredSize(new java.awt.Dimension(70, 102));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 0, 51));
        jLabel39.setText("KENTUCKY");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 0, 51));
        jLabel44.setText("AVENUE");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("$220");

        javax.swing.GroupLayout Panel22Layout = new javax.swing.GroupLayout(Panel22);
        Panel22.setLayout(Panel22Layout);
        Panel22Layout.setHorizontalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel44))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addContainerGap())
        );
        Panel22Layout.setVerticalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel22Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(Panel22);
        Panel22.setBounds(100, 0, 90, 80);

        Panel31.setBackground(new java.awt.Color(255, 255, 255));
        Panel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel31.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel31.setName("panal1"); // NOI18N
        Panel31.setPreferredSize(new java.awt.Dimension(70, 102));
        Panel31.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/police2.jpg"))); // NOI18N
        Panel31.add(jLabel6);
        jLabel6.setBounds(0, 0, 60, 80);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("JAIL !");
        Panel31.add(jLabel50);
        jLabel50.setBounds(60, 50, 40, 20);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("GO");
        Panel31.add(jLabel51);
        jLabel51.setBounds(70, 10, 20, 15);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("TO");
        Panel31.add(jLabel52);
        jLabel52.setBounds(70, 30, 40, 15);

        getContentPane().add(Panel31);
        Panel31.setBounds(910, 0, 100, 80);

        Panel28.setBackground(new java.awt.Color(255, 255, 255));
        Panel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel28.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel28.setPreferredSize(new java.awt.Dimension(70, 102));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 255, 255));
        jLabel30.setText("VENTNOR");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 255, 255));
        jLabel31.setText("AVENUE");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("$260");

        javax.swing.GroupLayout Panel28Layout = new javax.swing.GroupLayout(Panel28);
        Panel28.setLayout(Panel28Layout);
        Panel28Layout.setHorizontalGroup(
            Panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel28Layout.createSequentialGroup()
                        .addGroup(Panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel28Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addContainerGap())))
        );
        Panel28Layout.setVerticalGroup(
            Panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel28Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(Panel28);
        Panel28.setBounds(640, 0, 90, 80);

        Panel32.setBackground(new java.awt.Color(255, 255, 255));
        Panel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel32.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel32.setName("panel4"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("PACIFIC");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 102, 51));
        jLabel61.setText("AVENUE");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("$300");

        javax.swing.GroupLayout Panel32Layout = new javax.swing.GroupLayout(Panel32);
        Panel32.setLayout(Panel32Layout);
        Panel32Layout.setHorizontalGroup(
            Panel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel32Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Panel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel61))
                .addGap(15, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        Panel32Layout.setVerticalGroup(
            Panel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel32Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel32);
        Panel32.setBounds(910, 80, 100, 60);

        Panel33.setBackground(new java.awt.Color(255, 255, 255));
        Panel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel33.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel33.setName("panel4"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("NORTH ");

        jLabel17.setBackground(new java.awt.Color(0, 255, 51));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 0));
        jLabel17.setText("AVENUE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("$300");

        jLabel66.setBackground(new java.awt.Color(0, 255, 51));
        jLabel66.setForeground(new java.awt.Color(0, 153, 0));
        jLabel66.setText("CAROLINA");

        javax.swing.GroupLayout Panel33Layout = new javax.swing.GroupLayout(Panel33);
        Panel33.setLayout(Panel33Layout);
        Panel33Layout.setHorizontalGroup(
            Panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel33Layout.createSequentialGroup()
                .addGroup(Panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel33Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel33Layout.setVerticalGroup(
            Panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel33Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel33);
        Panel33.setBounds(910, 140, 100, 60);

        Panel34.setBackground(new java.awt.Color(255, 255, 255));
        Panel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel34.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel34.setName("panel4"); // NOI18N
        Panel34.setLayout(null);

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/com c.png"))); // NOI18N
        Panel34.add(jLabel67);
        jLabel67.setBounds(10, 0, 80, 70);

        getContentPane().add(Panel34);
        Panel34.setBounds(910, 200, 100, 60);

        Panel35.setBackground(new java.awt.Color(255, 255, 255));
        Panel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel35.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel35.setName("panel4"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("$320");

        jLabel2.setBackground(new java.awt.Color(0, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("AVENUE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("PENNSYLVANIA");

        javax.swing.GroupLayout Panel35Layout = new javax.swing.GroupLayout(Panel35);
        Panel35.setLayout(Panel35Layout);
        Panel35Layout.setHorizontalGroup(
            Panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel35Layout.createSequentialGroup()
                .addGroup(Panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(Panel35Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        Panel35Layout.setVerticalGroup(
            Panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel35Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Panel35);
        Panel35.setBounds(910, 260, 100, 60);

        Panel36.setBackground(new java.awt.Color(255, 255, 255));
        Panel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel36.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel36.setName("panel4"); // NOI18N
        Panel36.setLayout(null);

        jPanel90.setBackground(new java.awt.Color(255, 0, 51));
        jPanel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel90.setName("panel4"); // NOI18N
        jPanel90.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel90.setLayout(null);
        Panel36.add(jPanel90);
        jPanel90.setBounds(0, 490, 102, 55);

        jPanel91.setBackground(new java.awt.Color(255, 0, 51));
        jPanel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel91.setName("panel4"); // NOI18N
        jPanel91.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel91.setLayout(null);

        jPanel92.setBackground(new java.awt.Color(255, 0, 51));
        jPanel92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel92.setName("panel4"); // NOI18N
        jPanel92.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel92.setLayout(null);
        jPanel91.add(jPanel92);
        jPanel92.setBounds(0, 490, 102, 55);

        Panel36.add(jPanel91);
        jPanel91.setBounds(0, 490, 102, 55);

        jPanel93.setBackground(new java.awt.Color(255, 0, 51));
        jPanel93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel93.setName("panel4"); // NOI18N
        jPanel93.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel93.setLayout(null);

        jPanel94.setBackground(new java.awt.Color(255, 0, 51));
        jPanel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel94.setName("panel4"); // NOI18N
        jPanel94.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel94.setLayout(null);
        jPanel93.add(jPanel94);
        jPanel94.setBounds(0, 490, 102, 55);

        jPanel95.setBackground(new java.awt.Color(255, 0, 51));
        jPanel95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel95.setName("panel4"); // NOI18N
        jPanel95.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel95.setLayout(null);

        jPanel96.setBackground(new java.awt.Color(255, 0, 51));
        jPanel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel96.setName("panel4"); // NOI18N
        jPanel96.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel96.setLayout(null);
        jPanel95.add(jPanel96);
        jPanel96.setBounds(0, 490, 102, 55);

        jPanel93.add(jPanel95);
        jPanel95.setBounds(0, 490, 102, 55);

        Panel36.add(jPanel93);
        jPanel93.setBounds(130, 540, 102, 55);

        jPanel113.setBackground(new java.awt.Color(255, 0, 51));
        jPanel113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel113.setName("panel4"); // NOI18N
        jPanel113.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel113.setLayout(null);

        jPanel114.setBackground(new java.awt.Color(255, 0, 51));
        jPanel114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel114.setName("panel4"); // NOI18N
        jPanel114.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel114.setLayout(null);
        jPanel113.add(jPanel114);
        jPanel114.setBounds(0, 490, 102, 55);

        jPanel115.setBackground(new java.awt.Color(255, 0, 51));
        jPanel115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel115.setName("panel4"); // NOI18N
        jPanel115.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel115.setLayout(null);

        jPanel116.setBackground(new java.awt.Color(255, 0, 51));
        jPanel116.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel116.setName("panel4"); // NOI18N
        jPanel116.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel116.setLayout(null);
        jPanel115.add(jPanel116);
        jPanel116.setBounds(0, 490, 102, 55);

        jPanel113.add(jPanel115);
        jPanel115.setBounds(0, 490, 102, 55);

        jPanel117.setBackground(new java.awt.Color(255, 0, 51));
        jPanel117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel117.setName("panel4"); // NOI18N
        jPanel117.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel117.setLayout(null);

        jPanel118.setBackground(new java.awt.Color(255, 0, 51));
        jPanel118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel118.setName("panel4"); // NOI18N
        jPanel118.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel118.setLayout(null);
        jPanel117.add(jPanel118);
        jPanel118.setBounds(0, 490, 102, 55);

        jPanel119.setBackground(new java.awt.Color(255, 0, 51));
        jPanel119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel119.setName("panel4"); // NOI18N
        jPanel119.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel119.setLayout(null);

        jPanel120.setBackground(new java.awt.Color(255, 0, 51));
        jPanel120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel120.setName("panel4"); // NOI18N
        jPanel120.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel120.setLayout(null);
        jPanel119.add(jPanel120);
        jPanel120.setBounds(0, 490, 102, 55);

        jPanel117.add(jPanel119);
        jPanel119.setBounds(0, 490, 102, 55);

        jPanel113.add(jPanel117);
        jPanel117.setBounds(130, 540, 102, 55);

        Panel36.add(jPanel113);
        jPanel113.setBounds(30, 520, 102, 55);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/train4.jpg"))); // NOI18N
        Panel36.add(jLabel48);
        jLabel48.setBounds(10, 0, 80, 40);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("$200");
        Panel36.add(jLabel53);
        jLabel53.setBounds(10, 40, 36, 17);

        getContentPane().add(Panel36);
        Panel36.setBounds(910, 320, 100, 60);

        Panel37.setBackground(new java.awt.Color(255, 255, 255));
        Panel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel37.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel37.setName("panel4"); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 204, 204));
        jLabel73.setText("CHANSE");

        javax.swing.GroupLayout Panel37Layout = new javax.swing.GroupLayout(Panel37);
        Panel37.setLayout(Panel37Layout);
        Panel37Layout.setHorizontalGroup(
            Panel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel37Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel73)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panel37Layout.setVerticalGroup(
            Panel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(Panel37);
        Panel37.setBounds(910, 380, 100, 60);

        Panel38.setBackground(new java.awt.Color(255, 255, 255));
        Panel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel38.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel38.setName("panel4"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 255));
        jLabel4.setText("PARK PLACE");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("$350");

        javax.swing.GroupLayout Panel38Layout = new javax.swing.GroupLayout(Panel38);
        Panel38.setLayout(Panel38Layout);
        Panel38Layout.setHorizontalGroup(
            Panel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(Panel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel38Layout.setVerticalGroup(
            Panel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Panel38);
        Panel38.setBounds(910, 440, 100, 60);

        Panel39.setBackground(new java.awt.Color(255, 255, 255));
        Panel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel39.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel39.setName("panel4"); // NOI18N
        Panel39.setLayout(null);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/Webp.net-resizeimage (1)_1.jpg"))); // NOI18N
        Panel39.add(jLabel71);
        jLabel71.setBounds(10, 0, 80, 70);

        getContentPane().add(Panel39);
        Panel39.setBounds(910, 500, 100, 60);

        Panel40.setBackground(new java.awt.Color(255, 255, 255));
        Panel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel40.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel40.setName("panel4"); // NOI18N
        Panel40.setLayout(null);

        jPanel125.setBackground(new java.awt.Color(255, 0, 51));
        jPanel125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel125.setName("panel4"); // NOI18N
        jPanel125.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel125.setLayout(null);
        Panel40.add(jPanel125);
        jPanel125.setBounds(0, 490, 102, 55);

        jPanel126.setBackground(new java.awt.Color(255, 0, 51));
        jPanel126.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel126.setName("panel4"); // NOI18N
        jPanel126.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel126.setLayout(null);

        jPanel127.setBackground(new java.awt.Color(255, 0, 51));
        jPanel127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel127.setName("panel4"); // NOI18N
        jPanel127.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel127.setLayout(null);
        jPanel126.add(jPanel127);
        jPanel127.setBounds(0, 490, 102, 55);

        Panel40.add(jPanel126);
        jPanel126.setBounds(0, 490, 102, 55);

        jPanel128.setBackground(new java.awt.Color(255, 0, 51));
        jPanel128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel128.setName("panel4"); // NOI18N
        jPanel128.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel128.setLayout(null);

        jPanel129.setBackground(new java.awt.Color(255, 0, 51));
        jPanel129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel129.setName("panel4"); // NOI18N
        jPanel129.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel129.setLayout(null);
        jPanel128.add(jPanel129);
        jPanel129.setBounds(0, 490, 102, 55);

        jPanel130.setBackground(new java.awt.Color(255, 0, 51));
        jPanel130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel130.setName("panel4"); // NOI18N
        jPanel130.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel130.setLayout(null);

        jPanel131.setBackground(new java.awt.Color(255, 0, 51));
        jPanel131.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel131.setName("panel4"); // NOI18N
        jPanel131.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel131.setLayout(null);
        jPanel130.add(jPanel131);
        jPanel131.setBounds(0, 490, 102, 55);

        jPanel128.add(jPanel130);
        jPanel130.setBounds(0, 490, 102, 55);

        Panel40.add(jPanel128);
        jPanel128.setBounds(130, 540, 102, 55);

        jPanel132.setBackground(new java.awt.Color(255, 0, 51));
        jPanel132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel132.setName("panel4"); // NOI18N
        jPanel132.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel132.setLayout(null);

        jPanel133.setBackground(new java.awt.Color(255, 0, 51));
        jPanel133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel133.setName("panel4"); // NOI18N
        jPanel133.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel133.setLayout(null);
        jPanel132.add(jPanel133);
        jPanel133.setBounds(0, 490, 102, 55);

        jPanel134.setBackground(new java.awt.Color(255, 0, 51));
        jPanel134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel134.setName("panel4"); // NOI18N
        jPanel134.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel134.setLayout(null);

        jPanel135.setBackground(new java.awt.Color(255, 0, 51));
        jPanel135.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel135.setName("panel4"); // NOI18N
        jPanel135.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel135.setLayout(null);
        jPanel134.add(jPanel135);
        jPanel135.setBounds(0, 490, 102, 55);

        jPanel132.add(jPanel134);
        jPanel134.setBounds(0, 490, 102, 55);

        jPanel136.setBackground(new java.awt.Color(255, 0, 51));
        jPanel136.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel136.setName("panel4"); // NOI18N
        jPanel136.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel136.setLayout(null);

        jPanel137.setBackground(new java.awt.Color(255, 0, 51));
        jPanel137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel137.setName("panel4"); // NOI18N
        jPanel137.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel137.setLayout(null);
        jPanel136.add(jPanel137);
        jPanel137.setBounds(0, 490, 102, 55);

        jPanel138.setBackground(new java.awt.Color(255, 0, 51));
        jPanel138.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel138.setName("panel4"); // NOI18N
        jPanel138.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel138.setLayout(null);

        jPanel139.setBackground(new java.awt.Color(255, 0, 51));
        jPanel139.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel139.setName("panel4"); // NOI18N
        jPanel139.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel139.setLayout(null);
        jPanel138.add(jPanel139);
        jPanel139.setBounds(0, 490, 102, 55);

        jPanel136.add(jPanel138);
        jPanel138.setBounds(0, 490, 102, 55);

        jPanel132.add(jPanel136);
        jPanel136.setBounds(130, 540, 102, 55);

        Panel40.add(jPanel132);
        jPanel132.setBounds(30, 520, 102, 55);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 204));
        jLabel3.setText("BOARDWALK");
        Panel40.add(jLabel3);
        jLabel3.setBounds(10, 10, 80, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("$400");
        Panel40.add(jLabel15);
        jLabel15.setBounds(30, 30, 34, 10);

        getContentPane().add(Panel40);
        Panel40.setBounds(910, 560, 100, 50);

        Panel20.setBackground(new java.awt.Color(255, 255, 255));
        Panel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel20.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel20.setName("panel4"); // NOI18N

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 102, 102));
        jLabel62.setText("AVENUE");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 102, 102));
        jLabel34.setText("NEW YORK");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("$200");

        javax.swing.GroupLayout Panel20Layout = new javax.swing.GroupLayout(Panel20);
        Panel20.setLayout(Panel20Layout);
        Panel20Layout.setHorizontalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel20Layout.createSequentialGroup()
                .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel20Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        Panel20Layout.setVerticalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel20Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addGap(1, 1, 1)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel20);
        Panel20.setBounds(0, 80, 100, 60);

        Panel19.setBackground(new java.awt.Color(255, 255, 255));
        Panel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel19.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel19.setName("panel4"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("TENNLSSLE");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 102, 102));
        jLabel63.setText("AVENUE");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("$180");

        javax.swing.GroupLayout Panel19Layout = new javax.swing.GroupLayout(Panel19);
        Panel19.setLayout(Panel19Layout);
        Panel19Layout.setHorizontalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(Panel19Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel19Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel63))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Panel19Layout.setVerticalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel19Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29))
        );

        getContentPane().add(Panel19);
        Panel19.setBounds(0, 140, 100, 60);

        Panel18.setBackground(new java.awt.Color(255, 255, 255));
        Panel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel18.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel18.setName("panel4"); // NOI18N

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/com c.png"))); // NOI18N

        javax.swing.GroupLayout Panel18Layout = new javax.swing.GroupLayout(Panel18);
        Panel18.setLayout(Panel18Layout);
        Panel18Layout.setHorizontalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel18Layout.setVerticalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Panel18);
        Panel18.setBounds(0, 200, 100, 60);

        Panel17.setBackground(new java.awt.Color(255, 255, 255));
        Panel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel17.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel17.setName("panel4"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("ST.JAMES");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("$180");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 102, 102));
        jLabel65.setText("PLACE");

        javax.swing.GroupLayout Panel17Layout = new javax.swing.GroupLayout(Panel17);
        Panel17.setLayout(Panel17Layout);
        Panel17Layout.setHorizontalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        Panel17Layout.setVerticalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel17Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel17);
        Panel17.setBounds(0, 260, 100, 60);

        Panel16.setBackground(new java.awt.Color(255, 255, 255));
        Panel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel16.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel16.setName("panel4"); // NOI18N
        Panel16.setLayout(null);

        jPanel145.setBackground(new java.awt.Color(255, 0, 51));
        jPanel145.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel145.setName("panel4"); // NOI18N
        jPanel145.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel145.setLayout(null);
        Panel16.add(jPanel145);
        jPanel145.setBounds(0, 490, 102, 55);

        jPanel146.setBackground(new java.awt.Color(255, 0, 51));
        jPanel146.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel146.setName("panel4"); // NOI18N
        jPanel146.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel146.setLayout(null);

        jPanel147.setBackground(new java.awt.Color(255, 0, 51));
        jPanel147.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel147.setName("panel4"); // NOI18N
        jPanel147.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel147.setLayout(null);
        jPanel146.add(jPanel147);
        jPanel147.setBounds(0, 490, 102, 55);

        Panel16.add(jPanel146);
        jPanel146.setBounds(0, 490, 102, 55);

        jPanel148.setBackground(new java.awt.Color(255, 0, 51));
        jPanel148.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel148.setName("panel4"); // NOI18N
        jPanel148.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel148.setLayout(null);

        jPanel149.setBackground(new java.awt.Color(255, 0, 51));
        jPanel149.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel149.setName("panel4"); // NOI18N
        jPanel149.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel149.setLayout(null);
        jPanel148.add(jPanel149);
        jPanel149.setBounds(0, 490, 102, 55);

        jPanel150.setBackground(new java.awt.Color(255, 0, 51));
        jPanel150.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel150.setName("panel4"); // NOI18N
        jPanel150.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel150.setLayout(null);

        jPanel151.setBackground(new java.awt.Color(255, 0, 51));
        jPanel151.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel151.setName("panel4"); // NOI18N
        jPanel151.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel151.setLayout(null);
        jPanel150.add(jPanel151);
        jPanel151.setBounds(0, 490, 102, 55);

        jPanel148.add(jPanel150);
        jPanel150.setBounds(0, 490, 102, 55);

        Panel16.add(jPanel148);
        jPanel148.setBounds(130, 540, 102, 55);

        jPanel152.setBackground(new java.awt.Color(255, 0, 51));
        jPanel152.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel152.setName("panel4"); // NOI18N
        jPanel152.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel152.setLayout(null);

        jPanel153.setBackground(new java.awt.Color(255, 0, 51));
        jPanel153.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel153.setName("panel4"); // NOI18N
        jPanel153.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel153.setLayout(null);
        jPanel152.add(jPanel153);
        jPanel153.setBounds(0, 490, 102, 55);

        jPanel154.setBackground(new java.awt.Color(255, 0, 51));
        jPanel154.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel154.setName("panel4"); // NOI18N
        jPanel154.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel154.setLayout(null);

        jPanel155.setBackground(new java.awt.Color(255, 0, 51));
        jPanel155.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel155.setName("panel4"); // NOI18N
        jPanel155.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel155.setLayout(null);
        jPanel154.add(jPanel155);
        jPanel155.setBounds(0, 490, 102, 55);

        jPanel152.add(jPanel154);
        jPanel154.setBounds(0, 490, 102, 55);

        jPanel156.setBackground(new java.awt.Color(255, 0, 51));
        jPanel156.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel156.setName("panel4"); // NOI18N
        jPanel156.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel156.setLayout(null);

        jPanel157.setBackground(new java.awt.Color(255, 0, 51));
        jPanel157.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel157.setName("panel4"); // NOI18N
        jPanel157.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel157.setLayout(null);
        jPanel156.add(jPanel157);
        jPanel157.setBounds(0, 490, 102, 55);

        jPanel158.setBackground(new java.awt.Color(255, 0, 51));
        jPanel158.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel158.setName("panel4"); // NOI18N
        jPanel158.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel158.setLayout(null);

        jPanel159.setBackground(new java.awt.Color(255, 0, 51));
        jPanel159.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel159.setName("panel4"); // NOI18N
        jPanel159.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel159.setLayout(null);
        jPanel158.add(jPanel159);
        jPanel159.setBounds(0, 490, 102, 55);

        jPanel156.add(jPanel158);
        jPanel158.setBounds(0, 490, 102, 55);

        jPanel152.add(jPanel156);
        jPanel156.setBounds(130, 540, 102, 55);

        Panel16.add(jPanel152);
        jPanel152.setBounds(30, 520, 102, 55);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/train4.jpg"))); // NOI18N
        Panel16.add(jLabel49);
        jLabel49.setBounds(10, 0, 90, 40);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("$200");
        Panel16.add(jLabel56);
        jLabel56.setBounds(10, 40, 36, 17);

        getContentPane().add(Panel16);
        Panel16.setBounds(0, 320, 100, 60);

        Panel15.setBackground(new java.awt.Color(255, 255, 255));
        Panel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel15.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel15.setName("panel4"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 0));
        jLabel14.setText("VIRGINIA");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("$160");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 0));
        jLabel21.setText("AVENUE");

        javax.swing.GroupLayout Panel15Layout = new javax.swing.GroupLayout(Panel15);
        Panel15.setLayout(Panel15Layout);
        Panel15Layout.setHorizontalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel15Layout.setVerticalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Panel15);
        Panel15.setBounds(0, 370, 100, 60);

        Panel14.setBackground(new java.awt.Color(255, 255, 255));
        Panel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel14.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel14.setName("panel4"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("STATES");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 0));
        jLabel13.setText("AVENUE");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("$140");

        javax.swing.GroupLayout Panel14Layout = new javax.swing.GroupLayout(Panel14);
        Panel14.setLayout(Panel14Layout);
        Panel14Layout.setHorizontalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel14Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel14Layout.setVerticalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Panel14);
        Panel14.setBounds(0, 430, 100, 60);

        Panel13.setBackground(new java.awt.Color(255, 255, 255));
        Panel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel13.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel13.setName("panel4"); // NOI18N
        Panel13.setLayout(null);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/hjhkj (2).jpg"))); // NOI18N
        Panel13.add(jLabel68);
        jLabel68.setBounds(10, 10, 50, 50);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setText("$150");
        Panel13.add(jLabel69);
        jLabel69.setBounds(60, 30, 34, 14);

        getContentPane().add(Panel13);
        Panel13.setBounds(0, 490, 100, 60);

        Panel12.setBackground(new java.awt.Color(255, 255, 255));
        Panel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel12.setMinimumSize(new java.awt.Dimension(102, 55));
        Panel12.setName("panel4"); // NOI18N
        Panel12.setLayout(null);

        jPanel164.setBackground(new java.awt.Color(255, 0, 51));
        jPanel164.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel164.setName("panel4"); // NOI18N
        jPanel164.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel164.setLayout(null);
        Panel12.add(jPanel164);
        jPanel164.setBounds(0, 490, 102, 55);

        jPanel165.setBackground(new java.awt.Color(255, 0, 51));
        jPanel165.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel165.setName("panel4"); // NOI18N
        jPanel165.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel165.setLayout(null);

        jPanel166.setBackground(new java.awt.Color(255, 0, 51));
        jPanel166.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel166.setName("panel4"); // NOI18N
        jPanel166.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel166.setLayout(null);
        jPanel165.add(jPanel166);
        jPanel166.setBounds(0, 490, 102, 55);

        Panel12.add(jPanel165);
        jPanel165.setBounds(0, 490, 102, 55);

        jPanel167.setBackground(new java.awt.Color(255, 0, 51));
        jPanel167.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel167.setName("panel4"); // NOI18N
        jPanel167.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel167.setLayout(null);

        jPanel168.setBackground(new java.awt.Color(255, 0, 51));
        jPanel168.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel168.setName("panel4"); // NOI18N
        jPanel168.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel168.setLayout(null);
        jPanel167.add(jPanel168);
        jPanel168.setBounds(0, 490, 102, 55);

        jPanel169.setBackground(new java.awt.Color(255, 0, 51));
        jPanel169.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel169.setName("panel4"); // NOI18N
        jPanel169.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel169.setLayout(null);

        jPanel170.setBackground(new java.awt.Color(255, 0, 51));
        jPanel170.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel170.setName("panel4"); // NOI18N
        jPanel170.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel170.setLayout(null);
        jPanel169.add(jPanel170);
        jPanel170.setBounds(0, 490, 102, 55);

        jPanel167.add(jPanel169);
        jPanel169.setBounds(0, 490, 102, 55);

        Panel12.add(jPanel167);
        jPanel167.setBounds(130, 540, 102, 55);

        jPanel171.setBackground(new java.awt.Color(255, 0, 51));
        jPanel171.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel171.setName("panel4"); // NOI18N
        jPanel171.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel171.setLayout(null);

        jPanel172.setBackground(new java.awt.Color(255, 0, 51));
        jPanel172.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel172.setName("panel4"); // NOI18N
        jPanel172.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel172.setLayout(null);
        jPanel171.add(jPanel172);
        jPanel172.setBounds(0, 490, 102, 55);

        jPanel173.setBackground(new java.awt.Color(255, 0, 51));
        jPanel173.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel173.setName("panel4"); // NOI18N
        jPanel173.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel173.setLayout(null);

        jPanel174.setBackground(new java.awt.Color(255, 0, 51));
        jPanel174.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel174.setName("panel4"); // NOI18N
        jPanel174.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel174.setLayout(null);
        jPanel173.add(jPanel174);
        jPanel174.setBounds(0, 490, 102, 55);

        jPanel171.add(jPanel173);
        jPanel173.setBounds(0, 490, 102, 55);

        jPanel175.setBackground(new java.awt.Color(255, 0, 51));
        jPanel175.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel175.setName("panel4"); // NOI18N
        jPanel175.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel175.setLayout(null);

        jPanel176.setBackground(new java.awt.Color(255, 0, 51));
        jPanel176.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel176.setName("panel4"); // NOI18N
        jPanel176.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel176.setLayout(null);
        jPanel175.add(jPanel176);
        jPanel176.setBounds(0, 490, 102, 55);

        jPanel177.setBackground(new java.awt.Color(255, 0, 51));
        jPanel177.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel177.setName("panel4"); // NOI18N
        jPanel177.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel177.setLayout(null);

        jPanel178.setBackground(new java.awt.Color(255, 0, 51));
        jPanel178.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel178.setName("panel4"); // NOI18N
        jPanel178.setPreferredSize(new java.awt.Dimension(102, 55));
        jPanel178.setLayout(null);
        jPanel177.add(jPanel178);
        jPanel178.setBounds(0, 490, 102, 55);

        jPanel175.add(jPanel177);
        jPanel177.setBounds(0, 490, 102, 55);

        jPanel171.add(jPanel175);
        jPanel175.setBounds(130, 540, 102, 55);

        Panel12.add(jPanel171);
        jPanel171.setBounds(30, 520, 102, 55);

        label17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label17.setText("$140");
        Panel12.add(label17);
        label17.setBounds(20, 44, 34, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 0));
        jLabel7.setText("ST.CHARLES");
        Panel12.add(jLabel7);
        jLabel7.setBounds(10, 10, 90, 10);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 0));
        jLabel64.setText("PLACE");
        Panel12.add(jLabel64);
        jLabel64.setBounds(30, 20, 40, 20);

        getContentPane().add(Panel12);
        Panel12.setBounds(0, 550, 100, 60);

        Panel7.setBackground(new java.awt.Color(255, 255, 255));
        Panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel7.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel7.setPreferredSize(new java.awt.Dimension(68, 102));

        label9.setBackground(new java.awt.Color(0, 51, 51));
        label9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label9.setForeground(new java.awt.Color(51, 0, 0));
        label9.setText("AVENUE");

        label10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label10.setText("$100");

        label8.setBackground(new java.awt.Color(0, 51, 51));
        label8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(51, 0, 51));
        label8.setText("ORIENTAL");

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel7Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label10)
                .addContainerGap())
        );

        getContentPane().add(Panel7);
        Panel7.setBounds(370, 610, 90, 80);

        Panel11.setBackground(new java.awt.Color(255, 255, 255));
        Panel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel11.setName("panal1"); // NOI18N
        Panel11.setPreferredSize(new java.awt.Dimension(102, 100));
        Panel11.setLayout(null);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/Webp.net-resizeimage (1).jpg"))); // NOI18N
        Panel11.add(jLabel20);
        jLabel20.setBounds(1, -2, 100, 80);

        getContentPane().add(Panel11);
        Panel11.setBounds(0, 610, 100, 80);

        Panel26.setBackground(new java.awt.Color(255, 255, 255));
        Panel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel26.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel26.setPreferredSize(new java.awt.Dimension(70, 102));
        Panel26.setLayout(null);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/train4.jpg"))); // NOI18N
        Panel26.add(jLabel47);
        jLabel47.setBounds(10, 10, 80, 70);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("$200");
        Panel26.add(jLabel43);
        jLabel43.setBounds(20, 10, 36, 17);

        getContentPane().add(Panel26);
        Panel26.setBounds(460, 0, 90, 80);

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel2.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel2.setPreferredSize(new java.awt.Dimension(68, 102));

        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setText("$60");

        label2.setBackground(new java.awt.Color(0, 0, 255));
        label2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 204));
        label2.setText("MEDITERRANEAN");

        label3.setBackground(new java.awt.Color(0, 51, 51));
        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 204));
        label3.setText("AVENUE");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3)
                            .addComponent(label1))))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(Panel2);
        Panel2.setBounds(820, 610, 90, 80);

        Panel5.setBackground(new java.awt.Color(255, 255, 255));
        Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel5.setMinimumSize(new java.awt.Dimension(60, 102));
        Panel5.setPreferredSize(new java.awt.Dimension(68, 102));
        Panel5.setLayout(null);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/Webp.net-resizeimage.jpg"))); // NOI18N
        Panel5.add(jLabel58);
        jLabel58.setBounds(0, 0, 80, 70);

        getContentPane().add(Panel5);
        Panel5.setBounds(550, 610, 90, 80);

        lab_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num1.png"))); // NOI18N
        getContentPane().add(lab_image);
        lab_image.setBounds(400, 450, 80, 80);

        lab_image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num1.png"))); // NOI18N
        getContentPane().add(lab_image2);
        lab_image2.setBounds(480, 450, 80, 80);

        btn_dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/dice.jpg"))); // NOI18N
        btn_dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dice);
        btn_dice.setBounds(450, 370, 60, 60);

        jButton8.setBackground(new java.awt.Color(0, 153, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1030, 710, 110, 40);

        jButton9.setBackground(new java.awt.Color(0, 153, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Save Game");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(870, 710, 150, 40);

        btn_mortgage.setBackground(new java.awt.Color(153, 153, 153));
        btn_mortgage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_mortgage.setText("Mortgage");
        btn_mortgage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mortgageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mortgage);
        btn_mortgage.setBounds(1020, 20, 120, 40);

        btn_pay10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_pay10.setText("Pay 10$");
        btn_pay10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pay10);
        btn_pay10.setBounds(150, 340, 83, 23);

        btn_takeChance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_takeChance.setText("Take Chance");
        getContentPane().add(btn_takeChance);
        btn_takeChance.setBounds(260, 340, 110, 23);

        jScrollPane1.setViewportView(tp_chances);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 200, 230, 120);

        jScrollPane2.setViewportView(tb_commuintyChest);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 200, 230, 120);

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("play Music");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1020, 270, 127, 31);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("stop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1020, 350, 120, 25);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("pause");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1020, 310, 120, 30);

        panel_player1.setBackground(new java.awt.Color(255, 255, 0));

        lb_p1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_p1.setText("player 1");

        tf_p1Mon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_p1Mon.setToolTipText("");
        tf_p1Mon.setEnabled(false);
        tf_p1Mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_p1MonActionPerformed(evt);
            }
        });

        player1_countries.setBackground(new java.awt.Color(0, 204, 255));
        player1_countries.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player1_countries.setText("owned countries");
        player1_countries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1_countriesActionPerformed(evt);
            }
        });

        p1_buyjailcard.setBackground(new java.awt.Color(0, 204, 255));
        p1_buyjailcard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p1_buyjailcard.setText("Buy the Jail Card");
        p1_buyjailcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_buyjailcardActionPerformed(evt);
            }
        });

        p1_selljailcard.setBackground(new java.awt.Color(0, 204, 255));
        p1_selljailcard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p1_selljailcard.setText("Sell the Jail card");
        p1_selljailcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_selljailcardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_player1Layout = new javax.swing.GroupLayout(panel_player1);
        panel_player1.setLayout(panel_player1Layout);
        panel_player1Layout.setHorizontalGroup(
            panel_player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_p1)
                    .addComponent(tf_p1Mon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1_countries, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1_buyjailcard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1_selljailcard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_player1Layout.setVerticalGroup(
            panel_player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player1Layout.createSequentialGroup()
                .addComponent(lb_p1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_p1Mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player1_countries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1_buyjailcard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1_selljailcard)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(panel_player1);
        panel_player1.setBounds(1150, 0, 180, 170);

        panel_player4.setBackground(new java.awt.Color(255, 0, 0));
        panel_player4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                panel_player4ComponentHidden(evt);
            }
        });

        lb_p4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_p4.setText("player 4");

        tf_p4Mon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_p4Mon.setToolTipText("");
        tf_p4Mon.setEnabled(false);
        tf_p4Mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_p4MonActionPerformed(evt);
            }
        });

        player4_countries.setBackground(new java.awt.Color(0, 204, 255));
        player4_countries.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player4_countries.setText("owned countries");
        player4_countries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player4_countriesActionPerformed(evt);
            }
        });

        p4_buyjailcard.setBackground(new java.awt.Color(0, 204, 255));
        p4_buyjailcard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p4_buyjailcard.setText("Buy the Jail Card");
        p4_buyjailcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4_buyjailcardActionPerformed(evt);
            }
        });

        p4_selljailcard.setBackground(new java.awt.Color(0, 204, 255));
        p4_selljailcard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p4_selljailcard.setText("Sell the Jail card");
        p4_selljailcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4_selljailcardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_player4Layout = new javax.swing.GroupLayout(panel_player4);
        panel_player4.setLayout(panel_player4Layout);
        panel_player4Layout.setHorizontalGroup(
            panel_player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_p4)
                    .addComponent(tf_p4Mon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player4_countries, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4_buyjailcard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4_selljailcard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_player4Layout.setVerticalGroup(
            panel_player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player4Layout.createSequentialGroup()
                .addComponent(lb_p4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_p4Mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player4_countries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4_buyjailcard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4_selljailcard)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(panel_player4);
        panel_player4.setBounds(1150, 520, 180, 170);

        panel_player2.setBackground(new java.awt.Color(0, 0, 255));

        lb_p2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_p2.setText("player 2");

        tf_p2Mon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_p2Mon.setToolTipText("");
        tf_p2Mon.setEnabled(false);
        tf_p2Mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_p2MonActionPerformed(evt);
            }
        });

        player2_countries.setBackground(new java.awt.Color(0, 204, 255));
        player2_countries.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player2_countries.setText("owned countries");
        player2_countries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2_countriesActionPerformed(evt);
            }
        });

        p2_buyjailcard1.setBackground(new java.awt.Color(0, 204, 255));
        p2_buyjailcard1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p2_buyjailcard1.setText("Buy the Jail Card");
        p2_buyjailcard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2_buyjailcard1ActionPerformed(evt);
            }
        });

        p2_selljailcard.setBackground(new java.awt.Color(0, 204, 255));
        p2_selljailcard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p2_selljailcard.setText("Sell the Jail card");
        p2_selljailcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2_selljailcardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_player2Layout = new javax.swing.GroupLayout(panel_player2);
        panel_player2.setLayout(panel_player2Layout);
        panel_player2Layout.setHorizontalGroup(
            panel_player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_p2)
                    .addComponent(tf_p2Mon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2_countries, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2_buyjailcard1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2_selljailcard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_player2Layout.setVerticalGroup(
            panel_player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player2Layout.createSequentialGroup()
                .addComponent(lb_p2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_p2Mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player2_countries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2_buyjailcard1)
                .addGap(11, 11, 11)
                .addComponent(p2_selljailcard)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(panel_player2);
        panel_player2.setBounds(1150, 170, 180, 180);

        panel_player3.setBackground(new java.awt.Color(0, 204, 0));

        lb_p3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_p3.setText("player 3");

        tf_p3Mon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_p3Mon.setToolTipText("");
        tf_p3Mon.setEnabled(false);
        tf_p3Mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_p3MonActionPerformed(evt);
            }
        });

        player3_countries.setBackground(new java.awt.Color(0, 204, 255));
        player3_countries.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player3_countries.setText("owned countries");
        player3_countries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player3_countriesActionPerformed(evt);
            }
        });

        p3_buyjailcard.setBackground(new java.awt.Color(0, 204, 255));
        p3_buyjailcard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p3_buyjailcard.setText("Buy the Jail Card");
        p3_buyjailcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3_buyjailcardActionPerformed(evt);
            }
        });

        p3_selljailcard.setBackground(new java.awt.Color(0, 204, 255));
        p3_selljailcard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p3_selljailcard.setText("Sell the Jail card");
        p3_selljailcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3_selljailcardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_player3Layout = new javax.swing.GroupLayout(panel_player3);
        panel_player3.setLayout(panel_player3Layout);
        panel_player3Layout.setHorizontalGroup(
            panel_player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_p3)
                    .addComponent(tf_p3Mon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player3_countries, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3_buyjailcard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3_selljailcard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_player3Layout.setVerticalGroup(
            panel_player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_player3Layout.createSequentialGroup()
                .addComponent(lb_p3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_p3Mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player3_countries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3_buyjailcard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3_selljailcard)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(panel_player3);
        panel_player3.setBounds(1150, 350, 180, 170);

        jButton13.setBackground(new java.awt.Color(153, 153, 153));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13.setText("ٌReturn");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(1030, 70, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public int number,number2;

 public void change_color(player p){
     if(p.turn==true){
      p.pane_board.setBackground(Color.WHITE);}
     else{
       p.pane_board.setBackground(p.c);
     }
 }

    private void btn_diceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diceActionPerformed
 
        
    //   mp31.play();
        number =((int)(Math.random()*(5))+1);
        System.out.println("random"+number);
        JTextField  tf_test=new JTextField();
        tf_test.setText(String.valueOf(number));
        String image2="/num"+ number+".png";
        lab_image.setIcon(new javax.swing.ImageIcon(getClass().getResource(image2)));
        number2=((int)(Math.random()*(5))+1);
        System.out.println("random"+number2);
        JTextField tf_test2=new JTextField();
        tf_test2.setText(String.valueOf(number2));
        String image="/num"+ number2+".png";
         lab_image2.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));
          tp_chances.setText("");
          tb_commuintyChest.setText("");
          tp_chances.setEditable(false);
          tb_commuintyChest.setEditable(false);
          move(players.get(index));
       
        
    }//GEN-LAST:event_btn_diceActionPerformed
   public int turn(int index){
       if(player_lose){
             player_lose=false;
       }
       else{
       index++;
       if(index==numOfPlayers)
       {
         index=0;
       }
       }
       return index;
      
   }
      public void ShowcountryiesOfplayers (int indexOfplayer)
    {
        fram1.ta_countries.setText("");
        if (players.get(indexOfplayer).countries.size()==0)
            fram1.ta_countries.append("You Dont Have any Countries\n");  
        else
        {
             for (int i=0;i<players.get(indexOfplayer).countries.size();i++)
               {
                 fram1.ta_countries.append(players.get(indexOfplayer).countries.get(i).name);
                  fram1.ta_countries.append("\n");
               }
        } 
        if(players.get(indexOfplayer).stations.size()==0)
            fram1.ta_countries.append("you Don't Have any Stations\n");
        else
        {
            for(int s=0;s<players.get(indexOfplayer).stations.size();s++)
            {
                fram1.ta_countries.append(players.get(indexOfplayer).stations.get(s).name);
                fram1.ta_countries.append("\n");
            }
        }
        if(players.get(indexOfplayer).electric.size()==0)
            fram1.ta_countries.append("you Don't Have any electric_company\n");
        else
        {
              for(int e=0;e<players.get(indexOfplayer).electric.size();e++)
            {
                fram1.ta_countries.append(players.get(indexOfplayer).electric.get(e).name);
                fram1.ta_countries.append("\n");
            }
        }
          if(players.get(indexOfplayer).water.size()==0)
            fram1.ta_countries.append("you Don't Have any water_work\n");
        else
        {
              for(int w=0;w<players.get(indexOfplayer).water.size();w++)
            {
                fram1.ta_countries.append(players.get(indexOfplayer).water.get(w).name);
                fram1.ta_countries.append("\n");
            }
        }
        if (players.get(indexOfplayer).get_out_ofJailCard_chance==true)     
            fram1.tf_JailChanceCard.setText("Owned");             
        else
            fram1.tf_JailChanceCard.setText("None");
        if (players.get(indexOfplayer).get_out_ofJailCard_community==true)     
            fram1.tf_JailCommunityCard.setText("Owned");             
        else
            fram1.tf_JailCommunityCard.setText("None");
        fram1.setVisible(true);       
    }
    
    
    public void  BuyTheJailCard(int indexOfbuyplayer)
  {
        ChanceOrCommuntiy choose= new ChanceOrCommuntiy();
        choose.setVisible(true);
        choose.bt_chance.addActionListener(new ActionListener()
        {
         @Override
         public void actionPerformed(ActionEvent e)
          {
          jailcard jail =new jailcard();
           jail.lb_offer.setVisible(false);
           jail.bt_no.setVisible(false);
           jail.bt_yes.setVisible(false);        
            if(players.get(indexOfbuyplayer).get_out_ofJailCard_chance==true)
           {
              JOptionPane.showMessageDialog(null, "you already have the Chance Card","The Bank",JOptionPane.INFORMATION_MESSAGE);
           }
           else
           {
            for(int i=0;i<players.size();i++)
            {
                if(i==indexOfbuyplayer)
                  continue;
                else if(players.get(i).get_out_ofJailCard_chance==true)
                {
                  jail.lb_nameofplayerjailcard.setText(players.get(i).name + " have Chance the jail card ");
                  saveindex=i;
                  jail.setVisible(true);
                  check= true;
                }
                
            }
            if (check==false)
            {
                 JOptionPane.showMessageDialog(null, "The Bank Have the  Chance jail card and you can not sell the card  wait to your Chance","The Bank",JOptionPane.INFORMATION_MESSAGE);
                 jail.setVisible(false);                
            }
           }
            jail.bt_offer.addActionListener(new ActionListener()
               {
                 @Override
                 public void actionPerformed(ActionEvent e)
                  {
                     try
                       {
                          if( Integer.parseInt(jail.tf_money.getText())>players.get(indexOfbuyplayer).money)
                          {
                                JOptionPane.showMessageDialog(jail,"Your Offer is More than your Money","Monopoly",JOptionPane.ERROR_MESSAGE);
                          }
                          else
                          {
                           jail.lb_offer.setVisible(true);
                           jail.lb_offer.setText(players.get(saveindex).name+" : " +players.get(indexOfbuyplayer).name+ " want to buy your Chance Jail card by " +jail.tf_money.getText()+"$");
                           jail.bt_no.setVisible(true);
                           jail.bt_yes.setVisible(true);
                           jail.tf_money.enable(false);   
                          }
                       }
                      catch ( Exception a)
                           {                                                      
                             JOptionPane.showMessageDialog(jail,"You must Enter your Offer and it must be Number Not letters ","Error",JOptionPane.ERROR_MESSAGE);
                            }                  
                    }
                      });
            jail.bt_yes.addActionListener(new ActionListener()
             {
               @Override
               public void actionPerformed(ActionEvent e)
                 {                                             
                  players.get(indexOfbuyplayer).get_out_ofJailCard_chance=true;
                  players.get(indexOfbuyplayer).money-=Integer.parseInt(jail.tf_money.getText());
                  players.get(saveindex).money+=Integer.parseInt(jail.tf_money.getText());
                  players.get(saveindex).get_out_ofJailCard_chance=false;
                  jail.tf_money.enable(true);
                  JOptionPane.showMessageDialog(null, players.get(indexOfbuyplayer).name+":"+players.get(saveindex).name+ "  agree on your offer","congratulation",JOptionPane.INFORMATION_MESSAGE);
                   refersh();
                   jail.setVisible(false);
                    }
                        });
             jail.bt_no.addActionListener(new ActionListener()
              {
                 @Override
                 public void actionPerformed(ActionEvent e)
                  {
                    jail.tf_money.enable(true);                 
                    JOptionPane.showMessageDialog(null, players.get(indexOfbuyplayer).name+":"+players.get(saveindex).name+ " refused your offer"," What  a pity",JOptionPane.INFORMATION_MESSAGE);
                    jail.setVisible(false);
                  }
                          });
      
              choose.setVisible(false);                                  
                   }
                    });
        
         choose.bt_community.addActionListener(new ActionListener()
            {
             @Override
               public void actionPerformed(ActionEvent e)
                 {
                    jailcard jail =new jailcard();
                    jail.lb_offer.setVisible(false);
                    jail.bt_no.setVisible(false);
                    jail.bt_yes.setVisible(false);
                     if(players.get(indexOfbuyplayer).get_out_ofJailCard_community==true)
                      {
                        JOptionPane.showMessageDialog(null, "you already have the Community Card","The Bank",JOptionPane.INFORMATION_MESSAGE);
                      }
                     else
                     {
                       for(int i=0;i<players.size();i++)
                       {
                         if(i==indexOfbuyplayer)
                           continue;
                         else if(players.get(i).get_out_ofJailCard_community==true)
                             {
                               jail.lb_nameofplayerjailcard.setText(players.get(i).name + " have Community the jail card ");
                               saveindex=i;
                               jail.setVisible(true);
                               check= true;
                               }               
                       }
                      if (check==false)
                         {
                         JOptionPane.showMessageDialog(null, "The Bank Have the  Community jail card and you can not sell the card  wait to your Community","The Bank",JOptionPane.INFORMATION_MESSAGE);
                         jail.setVisible(false);                
                          }
                     }
                   jail.bt_offer.addActionListener(new ActionListener()
                    {
                      @Override
                      public void actionPerformed(ActionEvent e)
                     {
                        try
                        {
                          if( Integer.parseInt(jail.tf_money.getText())>players.get(indexOfbuyplayer).money)
                          {
                                JOptionPane.showMessageDialog(jail,"Your Offer is More than your Money","Monopoly",JOptionPane.ERROR_MESSAGE);
                          }
                          else
                          {
                           jail.lb_offer.setVisible(true);
                           jail.lb_offer.setText(players.get(saveindex).name+" : " +players.get(indexOfbuyplayer).name+ " want to buy your Community Jail card by " +jail.tf_money.getText()+"$");
                           jail.bt_no.setVisible(true);
                           jail.bt_yes.setVisible(true);
                           jail.tf_money.enable(false);   
                          }
                        }
                        catch ( Exception a)
                           {                                                      
                             JOptionPane.showMessageDialog(jail,"You must Enter your Offer and it must be Number Not letters ","Error",JOptionPane.ERROR_MESSAGE);
                            }                  
                    }
                      });
                  jail.bt_yes.addActionListener(new ActionListener()
                   {
                     @Override
                    public void actionPerformed(ActionEvent e)
                   {                                             
                      players.get(indexOfbuyplayer).get_out_ofJailCard_community=true;
                      players.get(indexOfbuyplayer).money-=Integer.parseInt(jail.tf_money.getText());
                       players.get(saveindex).money+=Integer.parseInt(jail.tf_money.getText());
                       players.get(saveindex).get_out_ofJailCard_chance=false;
                      jail.tf_money.enable(true);
                      JOptionPane.showMessageDialog(null,  players.get(indexOfbuyplayer).name+":"+ players.get(saveindex).name+ "  agree on your offer","congratulation",JOptionPane.INFORMATION_MESSAGE);
                      refersh();
                      jail.setVisible(false);
                     }
                        });
                  jail.bt_no.addActionListener(new ActionListener()
                   {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                      jail.tf_money.enable(true);                 
                      JOptionPane.showMessageDialog(null,  players.get(indexOfbuyplayer).name+":"+ players.get(saveindex).name+ " refused your offer"," What  a pity",JOptionPane.INFORMATION_MESSAGE);
                      jail.setVisible(false);
                    }
                          });
      
                    choose.setVisible(false); 
                    }
                          });
  }
    public boolean player_lose=false;
   public void fieldmortagaga(player p,int money)
   {
       boolean mor_countries=false;
       boolean mor_stations=false;
       boolean mor_water=false;
       boolean mor_elec=false;
      for(int i=0;i<p.countries.size();i++)
      {
          if(p.countries.get(i).ismortagage==true )
          {
              mor_countries=true;
          }     
      }
      for(int i=0;i<p.stations.size();i++)
      {
          if(p.stations.get(i).ismortagage==true )
          {
              mor_stations=true;
          }     
      }
         for(int i=0;i<p.water.size();i++)
        {
          if(p.water.get(i).ismortagage==true )
          {
              mor_water=true;
          }     
       } 
          for(int i=0;i<p.electric.size();i++)
          {
          if(p.electric.get(i).ismortagage==true)
          {
              mor_elec=true;
          }     
        }
           if((mor_countries||p.countries.size()==0) &&(mor_stations||p.stations.size()==0)&&(mor_elec||p.electric.size()==0)&&(mor_water|| p.water.size()==0)&&p.get_out_ofJailCard_chance==false&&p.money<money&&p.get_out_ofJailCard_community==false){
              for(int c=0;c<p.countries.size();c++)
              {
                  p.countries.get(c).sold=false;
              }
               for(int c=0;c<p.stations.size();c++)
              {
                  p.stations.get(c).sold=false;
              }
                for(int c=0;c<p.electric.size();c++)
              {
                  p.electric.get(c).sold=false;
              }
                 for(int c=0;c<p.water.size();c++)
              {
                  p.water.get(c).sold=false;
              }
                 p.pop.hide();
                 p.pane_board.setVisible(false);
                 players.remove(p);
                 numOfPlayers--;
                 player_lose=true;
                 
                  
                 
               
                
                repaint();
                 if(players.size()==1)
                 {
                    // winner_music.play();
                     String options[]={"Exit","Play Again"};
                   int result2=JOptionPane.showOptionDialog(null,players.get(0).name+ " IS THE WINNER","Congratulation",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
                   if(result2==0){
                   System.exit(0);
                   }
                   else{
                   start s=new start();
                   s.setVisible(true);
                   }
                 }

               repaint();
          }
          else if(p.money<money &&( mor_countries==false||mor_stations==false||mor_elec==false||mor_water==false||p.get_out_ofJailCard_chance==false || p.get_out_ofJailCard_community==false))     
          {
              
              String options[]={"yes","no"};
             int result= JOptionPane.showOptionDialog(null,"You Have properties,do you want to mortagage or exits(yes to exit)?","confirm",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
             if(result==0)
             {
              for(int c=0;c<p.countries.size();c++)
              {
                  p.countries.get(c).sold=false;
              }
               for(int c=0;c<p.stations.size();c++)
              {
                  p.stations.get(c).sold=false;
              }
                for(int c=0;c<p.electric.size();c++)
              {
                  p.electric.get(c).sold=false;
              }
                 for(int c=0;c<p.water.size();c++)
              {
                  p.water.get(c).sold=false;
              }
                 p.pop.hide();
                 p.pane_board.setVisible(false);
                 players.remove(p);
                 numOfPlayers--;
                 player_lose=true;
                 
                 
                 
                  
                 
                 repaint();
                  if(players.size()==1)
               {
                   JOptionPane.showMessageDialog(null,players.get(0).name+ " IS THE WINNER");
               }

               }
          else  
           {   
              showchecked();   
            }
          
          }
          
       
       
   }
   
  public void test(player p)
   {
     p.turn=false;
     change_color(p);
     index=turn(index);
     players.get(index).turn=true;
     change_color(players.get(index));
    
   }
      
    public void move(player p)
    {
       
        if(p.name.equals(players.get(0).name))
        {
          p.pos+=number+number2;
          if(p.pos>=39)
          {
             p.pos%=40;
             if(p.pos!=0){
               p.money+=200;
             }
             refersh();
          }
          p.pop.hide();
          p.pop=pf.getPopup(this, car1,Fields[p.pos].point1.x,Fields[p.pos].point1.y);
          p.pop.show();
        }
        else if(p.name.equals(players.get(1).name))
        {
            p.pos+=number+number2;
          if(p.pos>=39)
          {
             p.pos%=40;
             if(p.pos!=0){
               p.money+=200;
             }
             refersh();
          }
          p.pop.hide();
          p.pop=pf.getPopup(this, car2,Fields[p.pos].point2.x, Fields[p.pos].point2.y);
          p.pop.show();
        }
         else if(p.name.equals(players.get(2).name))
        {
         p.pos+=number+number2;
          if(p.pos>=39)
          {
             p.pos%=40;
             if(p.pos!=0){
               p.money+=200;
             }
             refersh();
          }
          p.pop.hide();
          p.pop=pf.getPopup(this, car3,Fields[p.pos].point3.x, Fields[p.pos].point3.y);
          p.pop.show();
        }
        else if(p.name.equals(players.get(3).name))
        {
            p.pos+=number+number2;
          if(p.pos>=39)
          {
             p.pos%=40;
             if(p.pos!=0){
               p.money+=200;
             }
             refersh();
          }
          p.pop.hide();
          p.pop=pf.getPopup(this, car4,Fields[p.pos].point4.x, Fields[p.pos].point4.y);
          p.pop.show();
        }
          check_field(Fields[p.pos]);
           
       
       
   
    }
     public int arr;
    public void move_car(){
     if(index==0){
        players.get(index).pop.hide();
        players.get(index).pop=pf.getPopup(this, players.get(index).car,Fields[players.get(index).pos].point1.x, Fields[players.get(index).pos].point1.y);
        players.get(index).pop.show();
        }else if(index==1){
        players.get(index).pop.hide();
        players.get(index).pop=pf.getPopup(this, players.get(index).car,Fields[players.get(index).pos].point2.x, Fields[players.get(index).pos].point2.y);
        players.get(index).pop.show();
        }else if(index==2){
        players.get(index).pop.hide();
        players.get(index).pop=pf.getPopup(this, players.get(index).car,Fields[players.get(index).pos].point3.x, Fields[players.get(index).pos].point3.y);
        players.get(index).pop.show();
        }else if(index==3){
        players.get(index).pop.hide();
        players.get(index).pop=pf.getPopup(this, players.get(index).car,Fields[players.get(index).pos].point4.x, Fields[players.get(index).pos].point4.y);
        players.get(index).pop.show();
        }
    }
    public void check_field(field f)
{
    
    if(f instanceof country)
    {
           if(((country)f).sold)
           {
                 for(int a=0;a<players.size();a++)
                     {
                                  if(players.get(index).countries.contains(((country)f)))
                                  {
                                      
                                      continue;
                                  }
                                  else if(players.get(a).countries.contains(((country)f))){
                                      if(((country)f).ismortagage)
                                      {
                                          JOptionPane.showMessageDialog(null,"This Country is mortagaged");
                                      }
                                      else
                                      {
                                       
                                          
                                            if(players.get(index).money>=((country)f).rent)
                                            {
                                              players.get(index).money-=((country)f).rent;
                                              players.get(a).money+=((country)f).rent;
                                               JOptionPane.showMessageDialog(null, "YOU PAY RENT"+((country)f).rent+"TO"+players.get(a).name);
                                               refersh();
                                            }
                                            else
                                                  fieldmortagaga(players.get(index),((country)f).rent);
                                      }
                                  }
                                  
                         }
                 test(players.get(index));
           }
            else
             {
                
                   Information info;
                  info=new Information();
                 info.setVisible(true);
                 this.setEnabled(false);
                 Information.tf_info_name.setText(f.name);
                Information.tf_info_price.setText(String.valueOf(((country)f).price));
                  Information.tf_info_rent.setText(String.valueOf(((country)f).rent));
                  Information.btn_cancel.addActionListener(new ActionListener()
                            {
                                         @Override
                                          public void actionPerformed(ActionEvent e)
                                            {          
                                               
                                                info.setVisible(false);
                                              setEnabled(true);
                                                setVisible(true);
//                                                setVisible(true);
//                                                  revalidate();
//                                                  validate();
//                                                  repaint();
                                                   test(players.get(index));
                                                   
                                            }
                                       });
                  
                 Information.but_buy.addActionListener(new ActionListener()
                            {
                                         @Override
                                          public void actionPerformed(ActionEvent e)
                                            {
                                              
                                                
                                                if(players.get(index).money>=(((country) f).price))
                                                {
                                                  players.get(index).countries.add((country)f);
                                                 ((country)f).sold=true;
                                                 players.get(index).money-=(((country) f).price);
                                                 refersh();
                                                JOptionPane.showMessageDialog(null, "YOU HAD BOUGHT"+f.name);
                                                }
                                                else
                                                {
                                                    JOptionPane.showMessageDialog(null, "YOU DON'T HAVE ENOUGH MONEY TO BUY"+f.name);
                                                    //fieldmortagaga(players.get(index), (((country) f).price));
                                                }
                                                info.setVisible(false);
                                                setEnabled(true);
                                                
                                                setVisible(true);
                                                
                                                  test(players.get(index));
                                            }
                                       });
                    
            }

    }
    else if(f instanceof chanse)
    {
    //call function read
        tp_chances.setText(chanse.next_card());
        chanse.chanse_card(players, players.get(index));
      if(chanse.checkedmoney==true)
      {
          fieldmortagaga(players.get(index),chanse.savemoney);
      }
        chanse.checkedmoney=false;
       move_car();
        check_field(Fields[players.get(index).pos]);
        test(players.get(index));

        refersh();
       
    }
     else if(f instanceof community_chest)
    {
    //call function read
     tb_commuintyChest.setText(community_chest.next_card());
      community_chest.community_card(players, players.get(index));
    if(community_chest.checkedmoney==true)
      {
          fieldmortagaga(players.get(index),community_chest.savemoney);
      }
      community_chest.checkedmoney=false;
         move_car();
         check_field(Fields[players.get(index).pos]);
      test(players.get(index));
      refersh();

    }
     else if(f instanceof go)
    {
   
       players.get(index).money+=200;
       refersh();
       test(players.get(index));
       
    }
      else if(f instanceof Tax)
       {
           
         if(f.name.equals(Fields[4].name))
         {
             if(players.get(index).money>=200)
             {
              players.get(index).money-=200;
              JOptionPane.showMessageDialog(null, "Pay 200 $","Tax",JOptionPane.INFORMATION_MESSAGE);
              refersh();
             }
             else
             {
                 fieldmortagaga(players.get(index),200);
             }
             test(players.get(index));
         }
         else if(f.name.equals(Fields[38].name))
         {
              if(players.get(index).money>=100)
             {
              players.get(index).money-=100;
               JOptionPane.showMessageDialog(null, "Pay 100 $","Tax",JOptionPane.INFORMATION_MESSAGE);
              refersh();
             }
                else
             {
                 fieldmortagaga(players.get(index), 100);
             }
              test(players.get(index));
         }         
    } 
      else if(f instanceof Go_to_Jail)
      {
             //player move to jail
            if(players.get(index).get_out_ofJailCard_chance==true ||players.get(index).get_out_ofJailCard_community==true)
            {
               //  array[10].panel.add(players.get(index).car);
                players.get(index).pop.hide();
                players.get(index).pos=10;
                move_car();

                 JOptionPane.showMessageDialog(null, "You will go to the Jail But You Will Get out Without Tax Because You Have The Jail card ", "From The Jail",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
              if(players.get(index).money>=50)
              {
              players.get(index).money-=50;             
             refersh();
                players.get(index).pos=10;
                    move_car();
              JOptionPane.showMessageDialog(null, "You Are Arrested  Pay 50 $", "From The Jail",JOptionPane.INFORMATION_MESSAGE);
              }
             else
              {
                  fieldmortagaga(players.get(index), 50);
              }
              
            }
             test(players.get(index)); 
      }
    else if(f instanceof jail)
     {
         JOptionPane.showMessageDialog(null, "Thanks For Your Visting , see you Later ", "From The Jail",JOptionPane.INFORMATION_MESSAGE);
         test(players.get(index));
     }
    else if(f instanceof Electric_Company)
    {
        boolean elewat=false;
        boolean ele=false;
        int loop=0;
            for(int r=0;r<numOfPlayers;r++)
            {
                    if(players.get(index).electric.contains((Electric_Company)f)){
                        
                        break;}
                    else if(!players.get(index).electric.contains((Electric_Company)f))
                    {
                        if(players.get(r).water.contains((Water_Works)Fields[28]) && players.get(r).electric.contains((Electric_Company)f))
                        {
                            elewat=true;
                            loop=r;
                        }
                        else if(players.get(r).electric.contains((Electric_Company)f))
                        {
                            ele=true;
                            loop=r;
                        }
                     
                    }
            }
                    if(elewat==true)
                    {
                        if(((Electric_Company)f).ismortagage)
                        {

                            JOptionPane.showMessageDialog(null,"This Company is mortagaged");

                        }
                        else
                        {
                            if(players.get(index).money>=10*(number+number2))
                            {
                                players.get(index).money=(players.get(index).money)-10*(number+number2);
                               players.get(loop).money=(players.get(loop).money)+10*(number+number2);
                                 refersh();
                              JOptionPane.showMessageDialog(null, "RENT IS 10 TIMES AMOUNT SHOWN ON DICE TO"+players.get(loop).name,"Electric_company",JOptionPane.INFORMATION_MESSAGE);
                           
                            }
                            else
                                fieldmortagaga(players.get(index),10*(number+number2));
                        }
                       test(players.get(index));     
                    }
                   else if(ele==true)
                    {
                        if(((Electric_Company)f).ismortagage)
                        {
                             JOptionPane.showMessageDialog(null,"This Company is mortagaged");
                            test(players.get(index));
                        }
                        else
                        {
                            if(players.get(index).money>=4*(number+number2))
                            {
                                 players.get(index).money=(players.get(index).money)-4*(number+number2);  
                                 players.get(loop).money=(int)((players.get(loop).money)+4*(number+number2)); 
                                 refersh();
                                 JOptionPane.showMessageDialog(null, "RENT IS 4 TIMES AMOUNT SHOWN ON DICE TO"+players.get(loop).name,"Electric_company",JOptionPane.INFORMATION_MESSAGE);
         
                            }
                            else
                                fieldmortagaga(players.get(index),4*(number+number2));
                            test(players.get(index));
                        }
                    }
                        
                   else if(!players.get(index).electric.contains((Electric_Company)f)&&ele==false&&elewat==false)
                           {
                               
                                          Information info;
                                           info=new Information();
                                          info.setVisible(true);
                                          this.setEnabled(false);
                                          Information.tf_info_name.setText(f.name);
                                          Information.tf_info_price.setText(String.valueOf(((Electric_Company)f).price));
                                          Information.tf_info_rent.setText(String.valueOf(((Electric_Company)f).rent));
                                          Information.btn_cancel.addActionListener(new ActionListener()
                            {
                                         @Override
                                          public void actionPerformed(ActionEvent e)
                                            {          
                                               
                                                info.setVisible(false);
                                              setEnabled(true);
                                              
                                                setVisible(true);
                                                
                                                   test(players.get(index));
                                                   
                                            }
                                       });
                                          Information.but_buy.addActionListener(new ActionListener()
                                         {
                                         @Override
                                          public void actionPerformed(ActionEvent e)
                                            {
                                              
                                                 if(players.get(index).money>=(((Electric_Company) f).price))
                                                 {
                                                    players.get(index).electric.add((Electric_Company)f);
                                                  ((Electric_Company)f).sold=true;
                                                  players.get(index).money-=((Electric_Company)f).price;
                                                 refersh();
                                                 JOptionPane.showMessageDialog(null, "YOU HAD BOUGHT"+f.name);
                                                }
                                                 else
                                                 {
                                                     
                                                     JOptionPane.showMessageDialog(null, "YOU DON'T HAVE ENOUGH MONEY TO BUY"+f.name);
                                                 }
                                                info.setVisible(false);
                                                setEnabled(true);
                                               
                                               setVisible(true);
                                                test(players.get(index));
                                            }
                                       });
                              }                  
               }
    else if(f instanceof Water_Works)
    {
        boolean watele=false;
        boolean wat=false;
        int loop2=0;
            for(int e=0;e<numOfPlayers;e++)
            {
               
                    if(players.get(index).water.contains((Water_Works)f))
                    {
                        
                        break;
                    }  
                    else if(!players.get(index).water.contains((Water_Works)f))
                    {
                        if(players.get(e).electric.contains((Electric_Company)Fields[12]) && players.get(e).water.contains((Water_Works)f))
                        {
                            watele=true;
                            loop2=e;
                          
                        }
                        else if(players.get(e).water.contains((Water_Works)f))
                        {
                            wat=true;
                            loop2=e;

                        }
                     
                    }
            }
                    if(watele==true)
                    {
                        if(((Water_Works)f).ismortagage)
                        {

                             JOptionPane.showMessageDialog(null,"This Company is mortagaged");
                            test(players.get(index)); 
                        }
                        else
                        {
                            if(players.get(index).money>=10*(number+number2))
                            {
                                 players.get(index).money=(players.get(index).money)-10*(number+number2);
                                players.get(loop2).money=(int)((players.get(loop2).money)+10*(number+number2)); 
                                 JOptionPane.showMessageDialog(null, "RENT IS 10 TIMES AMOUNT SHOWN ON DICE TO"+players.get(loop2).name,"Water_works",JOptionPane.INFORMATION_MESSAGE);
                                 refersh();
                            }
                            else
                                fieldmortagaga(players.get(index),10*(number+number2));
                            test(players.get(index)); 
                        }
                         
                            
                    }
                    else if(wat==true)
                    {
                        if(((Water_Works)f).ismortagage)
                        {

                           JOptionPane.showMessageDialog(null,"This Company is mortagaged");
                            test(players.get(index)); 
                        }
                        else
                        {
                            if(players.get(index).money>=4*(number+number2))
                            {
                            players.get(index).money=(players.get(index).money)-4*(number+number2); 
                            players.get(loop2).money=(players.get(loop2).money)+4*(number+number2); 
                             JOptionPane.showMessageDialog(null, "RENT IS 4 TIMES AMOUNT SHOWN ON DICE TO"+players.get(loop2).name,"Water_works",JOptionPane.INFORMATION_MESSAGE);
                                       refersh();
                            }
                            else
                                fieldmortagaga(players.get(index),4*(number+number2)); 
                            test(players.get(index)); 
                        }
                      
                    }
                    else if(!players.get(index).water.contains((Water_Works)f)&&watele==false && wat==false)
                    {
                      //  String.valueOf(((Water_Works)f).rent)
                                     Information info;
                                           info=new Information();
                                          info.setVisible(true);
                                          this.setEnabled(false);
                                          Information.tf_info_name.setText(f.name);
                                          Information.tf_info_price.setText(String.valueOf(((Water_Works)f).price));
                                         Information.tf_info_rent.setText(String.valueOf(number*(number+number2)));
                                          Information.btn_cancel.addActionListener(new ActionListener()
                            {
                                         @Override
                                          public void actionPerformed(ActionEvent e)
                                            {          
                                               
                                                info.setVisible(false);
                                              setEnabled(true);
                                                // enable(true);
                                             
                                             setVisible(true);
                                                   test(players.get(index));
                                                   
                                            }
                                       });
                                          Information.but_buy.addActionListener(new ActionListener()
                                         {
                                             
                                           @Override
                                           public void actionPerformed(ActionEvent e)
                                            {
                                              //  players[index].inset_country(f);
                                                  if(players.get(index).money>=(((Water_Works) f).price))
                                                {
                                                players.get(index).water.add((Water_Works)f);
                                                ((Water_Works)f).sold=true;
                                                players.get(index).money-=((Water_Works)f).price;
                                                refersh();
                                                JOptionPane.showMessageDialog(null, "YOU HAD BOUGHT"+f.name);
                                                }
                                                  else
                                                 {
                                                     JOptionPane.showMessageDialog(null, "YOU DON'T HAVE ENOUGH MONEY TO BUY"+f.name);
                                                    // fieldmortagaga(players.get(index),(((Water_Works) f).price));
                                                 }
                                                  
                                                info.setVisible(false);
                                                setEnabled(true);
                                               
                                               setVisible(true);
                                                 test(players.get(index));
                                            }
                                         });
                                      
        }
                     
            
            
    }
    else if(f instanceof train_station)
    {  
            boolean train=false;
            for(int p=0;p<numOfPlayers;p++)
            {
                     if(players.get(index).stations.contains(((train_station)f)))
                     {
                       
                         break;
                       // continue;
                     }
                     else if(players.get(p).stations.contains(((train_station)f)))
                     {
                         train=true;
                         int length=players.get(p).stations.size();
                         if(length==1)
                          {
                              if(((train_station)f).ismortagage)
                              { 
                                JOptionPane.showMessageDialog(null,"This Station is mortagaged");
                                test(players.get(index));
                              }
                              else
                              {
                                   ((train_station) f).rent=25;
                                   if(players.get(index).money>=((train_station) f).rent)
                                   {
                                        players.get(index).money=(players.get(index).money)-((train_station) f).rent;
                                       players.get(p).money+=((train_station) f).rent;
                                        JOptionPane.showMessageDialog(null, "YOU PAY RENT"+((train_station) f).rent+"TO"+ players.get(p).name);
                                        //test(players.get(index)); 
                                   }
                                   else
                                           fieldmortagaga(players.get(index),((train_station) f).rent);
                                   test(players.get(index)); 
                              }
                            refersh();
                            
                             
                           }
                           else if(length==2)
                          {
                              if(((train_station)f).ismortagage)
                              {

                                   JOptionPane.showMessageDialog(null,"This Staion is mortagaged");

                                  test(players.get(index)); 
                                  
                              }
                              else
                              {
                                  if(players.get(index).money>=50)
                                  {
                                         players.get(index).money=(players.get(index).money)-50;
                                       players.get(p).money+=50;
                                        JOptionPane.showMessageDialog(null, "YOU PAY RENT"+50+"TO"+ players.get(p).name);
                                  }
                                  else
                                      fieldmortagaga(players.get(index),50);
                                  test(players.get(index)); 
                              }
                          refersh(); 
                     
                          }
                         else if(length==3)
                           {
                                // ((train_station) f).rent=25;
                               if(((train_station)f).ismortagage)
                               {

                                    JOptionPane.showMessageDialog(null,"This Staion is mortagaged");
                                        test(players.get(index)); 
                              }
                               else
                               {
                                   if(players.get(index).money>=100)
                                   {
                                    players.get(index).money=(players.get(index).money)-100;
                                   players.get(p).money+=100;
                                    JOptionPane.showMessageDialog(null, "YOU PAY RENT"+100+"TO"+ players.get(p).name);
                                   }
                                   else
                                        fieldmortagaga(players.get(index), 100);
                                         test(players.get(index)); 
                               }
                                 
                                  refersh();
                                 
                           }
                         else if(length==4)
                           {
                               if(((train_station)f).ismortagage)
                               {

                                    JOptionPane.showMessageDialog(null,"This Station is mortagaged");
                                   test(players.get(index)); 
                              }
                               else
                               {
                                   if(players.get(index).money>=200)
                                   {
                                       players.get(index).money=(players.get(index).money)-200;
                                       players.get(p).money+=200;
                                       JOptionPane.showMessageDialog(null, "YOU PAY RENT"+200+"TO"+players.get(p).name);
                                   }
                                   
                                   else
                                        fieldmortagaga(players.get(index),200);
                                        test(players.get(index)); 
                               }
                                          
                                    refersh();     
                                     
                             }
                        
                    }
                 }
                    if(!players.get(index).stations.contains(((train_station)f))&& train==false)
                     {
                              Information info;
                                           info=new Information();
                                          info.setVisible(true);
                                           this.setEnabled(false);
                                          Information.tf_info_name.setText(f.name);
                                          Information.tf_info_price.setText(String.valueOf(((train_station)f).price));
                                          Information.tf_info_rent.setText(String.valueOf(((train_station)f).rent));
                                          Information.btn_cancel.addActionListener(new ActionListener()
                                         {
                                         @Override
                                          public void actionPerformed(ActionEvent e)
                                            {          
                                               
                                                info.setVisible(false);
                                              setEnabled(true);
                                             
                                              setVisible(true);
                                             
                                                // enable(true);
                                                   test(players.get(index));
                                                   
                                            }
                                       });
                                          Information.but_buy.addActionListener(new ActionListener()
                                         {
                                         @Override
                                           public void actionPerformed(ActionEvent e)
                                            {
                                              //  players[index].inset_country(f);
                                                if(players.get(index).money>=((train_station)f).price){
                                                players.get(index).stations.add((train_station)f);
                                                ((train_station)f).sold=true;
                                                players.get(index).money-=((train_station)f).price;
                                                refersh();
                                                JOptionPane.showMessageDialog(null, "YOU HAD BOUGHT"+f.name);
                                                }
                                                 else
                                                 {
                                                     JOptionPane.showMessageDialog(null, "YOU DON'T HAVE ENOUGH MONEY TO BUY"+f.name);
                                                    // fieldmortagaga(players.get(index),((train_station)f).price);
                                                 }
                                                info.setVisible(false); 
                                                setEnabled(true);
                                                setVisible(true);
                                                test(players.get(index));
                                            }
                                       });
                                    }
      
    }
    else if(f instanceof Free_Parking)
        test(players.get(index));
}
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton9ActionPerformed
 countryiesOfplayers fram1=new countryiesOfplayers(); 
 public static ArrayList<Checkbox>checkBox_list=new ArrayList<Checkbox>();
 public void showchecked()
 {
      Checkbox c;
       
        int   x=10,y=0;
        mortagage m=new mortagage();
        for(int i=0;i<players.get(index).countries.size();i++){
            if(players.get(index).countries.get(i).ismortagage==false){
            c=new Checkbox(players.get(index).countries.get(i).name);
            c.setBounds(x, y, 150, 40);
            y+=40;
            mortagage.mainPanel.add(c);
            c.setVisible(true);
            m.repaint();
            checkBox_list.add(c);
            }
        }
        for(int k=0;k<players.get(index).stations.size();k++){
            if(players.get(index).stations.get(k).ismortagage==false){
        c=new Checkbox(players.get(index).stations.get(k).name);
            c.setBounds(x, y, 150, 40);
            y+=40;
            mortagage.mainPanel.add(c);
            c.setVisible(true);
            m.repaint();
            checkBox_list.add(c);
            }
        }
        for(int k=0;k<players.get(index).electric.size();k++){
            if(players.get(index).electric.get(k).ismortagage==false){
        c=new Checkbox(players.get(index).electric.get(k).name);
            c.setBounds(x, y, 150, 40);
            y+=40;
            mortagage.mainPanel.add(c);
            c.setVisible(true);
            m.repaint();
            checkBox_list.add(c);
            }
        }
         for(int k=0;k<players.get(index).water.size();k++){
             if(players.get(index).water.get(k).ismortagage==false){
        c=new Checkbox(players.get(index).water.get(k).name);
            c.setBounds(x, y, 150, 40);
            y+=40;
            mortagage.mainPanel.add(c);
            c.setVisible(true);
            m.repaint();
            checkBox_list.add(c);
             }
        }
        m.btn_done.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             for(int i=0;i<board_test.checkBox_list.size();i++){
                if(board_test.checkBox_list.get(i).getState()==true){
                   for(int j=0;j<players.get(index).countries.size();j++){
                       if(board_test.checkBox_list.get(i).getLabel().equals(players.get(index).countries.get(j).name)){
                       players.get(index).countries.get(j).ismortagage=true;
                       board_test.checkBox_list.get(i).setState(true);
                       board_test.checkBox_list.get(i).enable(false);
                       players.get(index).money+=(int)(players.get(index).countries.get(j).price)*0.5;
                       refersh();
                       }
                   }
                  for(int l=0;l<players.get(index).stations.size();l++){
                      if(board_test.checkBox_list.get(i).getLabel().equals(players.get(index).stations.get(l).name)){
                       players.get(index).stations.get(l).ismortagage=true;
                       // board_test.checkBox_list.remove(board_test.checkBox_list.get(i));
                        board_test.checkBox_list.get(i).setState(true);
                        board_test.checkBox_list.get(i).enable(false);
                       players.get(index).money+=(int)(players.get(index).stations.get(l).price)*0.5;
                       refersh();
                       }
                       
                   }
                   for(int l=0;l<players.get(index).electric.size();l++){
                       players.get(index).electric.get(l).ismortagage=true;
                       // board_test.checkBox_list.remove(board_test.checkBox_list.get(i));
                       board_test.checkBox_list.get(i).setState(true);
                       board_test.checkBox_list.get(i).enable(false);
                       players.get(index).money+=(int)(players.get(index).electric.get(l).price)*0.5;
                       refersh();
                       
                   }
                   for(int l=0;l<players.get(index).water.size();l++){
                       players.get(index).water.get(l).ismortagage=true;
                      // board_test.checkBox_list.remove(board_test.checkBox_list.get(i));
                       board_test.checkBox_list.get(i).setState(true);
                       board_test.checkBox_list.get(i).enable(false);
                        players.get(index).money+=(int)(players.get(index).water.get(l).price)*0.5;
                        refersh();
                   }
                }
                  }
             
            
            }
        });
        m.setVisible(true);
 
 }
 public static ArrayList<Checkbox>checkBox_list2=new ArrayList<Checkbox>(); 
 public void checked()
 {
      Checkbox c;
       
        int   x=10,y=0;
        Return r =new Return();
       
        for(int i=0;i<players.get(index).countries.size();i++)
        {
            if(players.get(index).countries.get(i).ismortagage==true)
            {
            c=new Checkbox(players.get(index).countries.get(i).name);
            c.setBounds(x, y, 150, 40);
            y+=40;
            Return.Panel2.add(c);
            c.setVisible(true);
            r.repaint();
            checkBox_list2.add(c);
            }

        }
        for(int k=0;k<players.get(index).stations.size();k++)
        {
           if(players.get(index).stations.get(k).ismortagage==true)
             {
               c=new Checkbox(players.get(index).stations.get(k).name);
               c.setBounds(x, y, 150, 40);
               y+=40;
               Return.Panel2.add(c);
               c.setVisible(true);
               r.repaint();
               checkBox_list2.add(c);
              }

        }
        for(int k=0;k<players.get(index).electric.size();k++)
        {
             if(players.get(index).electric.get(k).ismortagage==true) 
                {
                   c=new Checkbox(players.get(index).electric.get(k).name);
                   c.setBounds(x, y, 150, 40);
                   y+=40;
                   Return.Panel2.add(c);
                   c.setVisible(true);
                   r.repaint();
                   checkBox_list2.add(c);
                }
        }
        for(int k=0;k<players.get(index).water.size();k++)
        {
            if(players.get(index).water.get(k).ismortagage==true) 
               {
                 c=new Checkbox(players.get(index).water.get(k).name);
                 c.setBounds(x, y, 150, 40);
                 y+=40;
                 Return.Panel2.add(c);
                 c.setVisible(true);
                 r.repaint();
                 checkBox_list2.add(c);
               }

        }
   r.Btn_done.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             for(int i=0;i<board_test.checkBox_list.size();i++){
                if(board_test.checkBox_list.get(i).getState()==true){
                   for(int j=0;j<players.get(index).countries.size();j++){
                       if(board_test.checkBox_list.get(i).getLabel().equals(players.get(index).countries.get(j).name)){
                       players.get(index).countries.get(j).ismortagage=false;
                       //players[index].countries.add(((country)array[i]));
                       players.get(index).money-=((int)(players.get(index).countries.get(j).price)*0.5+(int)(players.get(index).countries.get(j).price)*0.1);
                       
                       }
                      
                   }
                  for(int l=0;l<players.get(index).stations.size();l++){
                      if(board_test.checkBox_list.get(i).getLabel().equals(players.get(index).stations.get(l).name)){
                       players.get(index).stations.get(l).ismortagage=false;
                    board_test.checkBox_list2.get(i).setState(true);
                     board_test.checkBox_list2.get(i).enable(false);
                       players.get(index).money-=((int)(players.get(index).stations.get(l).price)*0.5+(int)(players.get(index).stations.get(l).price)*0.1);
                     
                       }
                        
                   }
                   for(int l=0;l<players.get(index).electric.size();l++){
                       players.get(index).electric.get(l).ismortagage=false;
                     board_test.checkBox_list2.get(i).setState(true);
                     board_test.checkBox_list2.get(i).enable(false);
                      players.get(index).money-=((int)(players.get(index).electric.get(l).price)*0.5+(int)(players.get(index).electric.get(l).price)*0.1);
                      
                       
                   }
                   for(int l=0;l<players.get(index).water.size();l++){
                       players.get(index).water.get(l).ismortagage=false;
                       //players[index].water.add(((Water_Works)array[i]));
                        board_test.checkBox_list2.get(i).setState(true);
                     board_test.checkBox_list2.get(i).enable(false);
                         players.get(index).money-=((int)(players.get(index).water.get(l).price)*0.5+(int)(players.get(index).water.get(l).price)*0.1);
                        
                   }
                     refersh();
                }
                
                  }
             
            
            }
        });
        
             
    r.setVisible(true);
      

 


      
 }
    private void btn_mortgageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mortgageActionPerformed

        showchecked();
       
    }//GEN-LAST:event_btn_mortgageActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
//        mp3.play();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     // mp3.stop();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
     //  mp3.pause();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_p1MonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_p1MonActionPerformed
        
    }//GEN-LAST:event_tf_p1MonActionPerformed

    private void player1_countriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1_countriesActionPerformed
       
        ShowcountryiesOfplayers(0);
    }//GEN-LAST:event_player1_countriesActionPerformed

    private void p1_buyjailcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_buyjailcardActionPerformed
      
        BuyTheJailCard(0);
    }//GEN-LAST:event_p1_buyjailcardActionPerformed

    private void p1_selljailcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_selljailcardActionPerformed
        
        JOptionPane.showMessageDialog(null, "To all players : " + players.get(0).name +" want to sell his chance or community card, if you have an offer click on your (Buy the Jail card) Button","Attention please",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_p1_selljailcardActionPerformed

    private void tf_p4MonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_p4MonActionPerformed
       
    }//GEN-LAST:event_tf_p4MonActionPerformed

    private void player4_countriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player4_countriesActionPerformed
       
        ShowcountryiesOfplayers(3);
    }//GEN-LAST:event_player4_countriesActionPerformed

    private void p4_buyjailcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4_buyjailcardActionPerformed
        
        BuyTheJailCard(3);
    }//GEN-LAST:event_p4_buyjailcardActionPerformed

    private void panel_player4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panel_player4ComponentHidden
       
    }//GEN-LAST:event_panel_player4ComponentHidden

    private void tf_p2MonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_p2MonActionPerformed
       
    }//GEN-LAST:event_tf_p2MonActionPerformed

    private void player2_countriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2_countriesActionPerformed
        
        ShowcountryiesOfplayers(1);
    }//GEN-LAST:event_player2_countriesActionPerformed

    private void p2_buyjailcard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2_buyjailcard1ActionPerformed
        
        BuyTheJailCard(1);

    }//GEN-LAST:event_p2_buyjailcard1ActionPerformed

    private void tf_p3MonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_p3MonActionPerformed
       
    }//GEN-LAST:event_tf_p3MonActionPerformed

    private void player3_countriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player3_countriesActionPerformed
       
        ShowcountryiesOfplayers(2);
    }//GEN-LAST:event_player3_countriesActionPerformed

    private void p3_buyjailcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3_buyjailcardActionPerformed
        
        BuyTheJailCard(2);
    }//GEN-LAST:event_p3_buyjailcardActionPerformed

    private void p2_selljailcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2_selljailcardActionPerformed
        
          JOptionPane.showMessageDialog(null, "To all players : " + players.get(1).name +" want to sell his chance or community card, if you have an offer click on your (Buy the Jail card) Button","Attention please",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_p2_selljailcardActionPerformed

    private void p3_selljailcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3_selljailcardActionPerformed
       
          JOptionPane.showMessageDialog(null, "To all players : " + players.get(2).name +" want to sell his chance or community card, if you have an offer click on your (Buy the Jail card) Button","Attention please",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_p3_selljailcardActionPerformed

    private void p4_selljailcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4_selljailcardActionPerformed
        
          JOptionPane.showMessageDialog(null, "To all players : " + players.get(3).name +" want to sell his chance or community card, if you have an offer click on your (Buy the Jail card) Button","Attention please",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_p4_selljailcardActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        checked();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btn_pay10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pay10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(board_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
            try {
                new board_test(0,"","","","").setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(board_test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel14;
    private javax.swing.JPanel Panel15;
    private javax.swing.JPanel Panel16;
    private javax.swing.JPanel Panel17;
    private javax.swing.JPanel Panel18;
    private javax.swing.JPanel Panel19;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel20;
    private javax.swing.JPanel Panel21;
    private javax.swing.JPanel Panel22;
    private javax.swing.JPanel Panel23;
    private javax.swing.JPanel Panel24;
    private javax.swing.JPanel Panel25;
    private javax.swing.JPanel Panel26;
    private javax.swing.JPanel Panel27;
    private javax.swing.JPanel Panel28;
    private javax.swing.JPanel Panel29;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel30;
    private javax.swing.JPanel Panel31;
    private javax.swing.JPanel Panel32;
    private javax.swing.JPanel Panel33;
    private javax.swing.JPanel Panel34;
    private javax.swing.JPanel Panel35;
    private javax.swing.JPanel Panel36;
    private javax.swing.JPanel Panel37;
    private javax.swing.JPanel Panel38;
    private javax.swing.JPanel Panel39;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel40;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    public static javax.swing.JButton btn_dice;
    private javax.swing.JButton btn_mortgage;
    public static javax.swing.JButton btn_pay10;
    public static javax.swing.JButton btn_takeChance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lab_image;
    private javax.swing.JLabel lab_image2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb_p1;
    private javax.swing.JLabel lb_p2;
    private javax.swing.JLabel lb_p3;
    private javax.swing.JLabel lb_p4;
    private javax.swing.JButton p1_buyjailcard;
    private javax.swing.JButton p1_selljailcard;
    private javax.swing.JButton p2_buyjailcard1;
    private javax.swing.JButton p2_selljailcard;
    private javax.swing.JButton p3_buyjailcard;
    private javax.swing.JButton p3_selljailcard;
    private javax.swing.JButton p4_buyjailcard;
    private javax.swing.JButton p4_selljailcard;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel_player1;
    private javax.swing.JPanel panel_player2;
    private javax.swing.JPanel panel_player3;
    private javax.swing.JPanel panel_player4;
    private javax.swing.JButton player1_countries;
    private javax.swing.JButton player2_countries;
    private javax.swing.JButton player3_countries;
    private javax.swing.JButton player4_countries;
    public static javax.swing.JTextPane tb_commuintyChest;
    private javax.swing.JTextField tf_p1Mon;
    private javax.swing.JTextField tf_p2Mon;
    private javax.swing.JTextField tf_p3Mon;
    private javax.swing.JTextField tf_p4Mon;
    public static javax.swing.JTextPane tp_chances;
    // End of variables declaration//GEN-END:variables

    

    
}
