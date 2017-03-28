package com.sd.turtle;

import java.awt.Color;
import ch.aplu.turtle.*;
import java.util.ArrayList;

public class example{
  public static void main(String[] args){
  ArrayList<WeightTurtle> arrayList = new ArrayList<WeightTurtle>();
  arrayList.add(new WeightTurtle(10));
  arrayList.add(new WeightTurtle(20));
  arrayList.add(new WeightTurtle(30));
  
  for(WeightTurtle turtle : arrayList){
   System.out.println(turtle); 
   }
  }
}