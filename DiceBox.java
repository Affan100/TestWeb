//class DiceBox
import java.io.*;
import java.util.*;

class DiceBox{
//attribute
  private ArrayList<Dice> dices;

//methods and constructor
  public DiceBox(){
    this.dices=new ArrayList<Dice>();
  }
  public void add(Dice addedDice){
    this.dices.add(addedDice);  
  }
  public void shake(){
   /*
   for loop 
    Dice d;
    for(int i=0;i<dices.size();i++){
      d=dices.get(i);
      d.roll();
    }
    */
    for(Dice d:  dices){
      d.roll();
    }
  }
  public int getTotal(){
   int total=0; 
   for(Dice d:  dices){
      total+=d.getFace();
   }
   return total;
  }
 public void printDices(){
   int i=0;
   for(Dice d:  dices){
     i++;
      System.out.println("Dice"+i+" Face = "+ d.getFace()+"\n");       
    }
 }
}//end class