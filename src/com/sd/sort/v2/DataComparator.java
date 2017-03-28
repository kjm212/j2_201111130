package com.sd.sort.v2;
import java.util.*;

public class DataComparator implements Comparator{
  public DataComparator(){}
  public int compare(Object o1, Object o2){
    Date s1=(Date)o1;
    Date s2=(Date)o2;
    
    return s1.compareTo(s2);
  }
}