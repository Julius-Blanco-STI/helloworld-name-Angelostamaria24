/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
public class Main {

  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    String name="Angelo Sta Maria";
    String Address="Quezon City";
    
    
    System.out.println("Hello World ");
    System.out.println("What's your name?");
    name=scn.nextLine();
   
    
    System.out.println("What's your age");
    int age=scn.nextInt();
    
   
    System.out.println("What's your address?");
    String address =scn.nextLine();
    address =scn.nextLine();
    
    
     System.out.println("Hi!"+name);
     System.out.println("your are "+ age + " years old");
     System.out.println("you live at " + address );
  }

}