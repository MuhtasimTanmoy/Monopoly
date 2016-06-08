/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author taaan
 */
 

public class Player {
    public int x;
    public int y;
    
    public int money;
    
    public int rent;
    
    //public static int xxx;
    
    public boolean valid=true;
    
    Player(){};
    Player(int a,int b,int moneyy){
        x=a;
        y=b;
        money=moneyy;
        //rent=rentt;
    }
    int getx(){
        return x;
    }
     int gety(){
        return y;
    }
     
     int getMoney(){
      return money;
     }
    
    
    
    
}
