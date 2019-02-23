import java.io.*;
import java.util.Scanner;;
public class TestExtractIt{
    public static void main(String[] args){

     Scanner Key = new Scanner(System.in);
     System.out.println("Insert Url : ");
     String input = Key.nextLine();
     String arr[] = input.split("/");
     String ans;
     if(arr[arr.length-1].startsWith("*")){
        ans = "_"; 
        ans += arr[arr.length-1].substring(1);
     }
     else{
         ans = arr[arr.length-1];
     }
     System.out.println("Result : "+ ans);

    }
   }
   