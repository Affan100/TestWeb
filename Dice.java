//class Dice
class Dice{
//attribute
  private int face;
//methods and constructor
  public Dice(){//set face== 1
    this.face=1;
  }
  public void setFace(int newFace){//set attribute face value to newFace
    if(face<1 ||face>6){
      System.out.println("invalid face number\n");
      return;
    }
    this.face=newFace;
   }
  public int getFace(){
    return this.face;
  }
  public String toString(){
    String returnString;
    returnString="F = "+this.face ;
 
    return returnString;
  }
  public void roll(){
   this.face=1+(int)(Math.random() * 6);
   }
}//end class