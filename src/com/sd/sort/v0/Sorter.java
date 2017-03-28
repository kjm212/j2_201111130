package com.sd.sort.v0;
import java.util.*;

public class Sorter{
  public Sorter(){}
  
  public void sort(Integer[] data){
    for(int i=data.length-1;i>=0;i--) {
    int indexOfMax=0;
    for(int j=1;j<=i;j++) {
        if(data[j] > data[indexOfMax])
            indexOfMax=j;
        }
    Integer temp=data[i];
    data[i]=data[indexOfMax];
    data[indexOfMax]=temp;
    }
  }
  
  public void sort(String[] data){
    for(int i=data.length-1;i>=0;i--) {
      int indexOfMax=0;
    for(int j=1;j<=i;j++) {
      if(data[j].compareTo(data[indexOfMax])>0)
          indexOfMax=j;
    }
    String temp=data[i];
    data[i]=data[indexOfMax];
    data[indexOfMax]=temp;
    }

  }
}