package com.sd.sort.v2;
import java.util.*;

public class ReverseComparator implements Comparator{
  public ReverseComparator(){} 
  
 public int compare(Object o1, Object o2){
    String s1=(String)o1;
    String s2=(String)o2;
    
    return s2.compareTo(s1); 
}
}