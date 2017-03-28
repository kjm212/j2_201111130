package com.sd.sort.v1;

public class Weight implements Comparable{
 private int KILO;
 
 public Weight(int k){
   this.KILO=k;
 }
 
 public int compareTo(Object o){
  Weight w = (Weight)o;
  return this.KILO-w.KILO;
 }
 
 public String toString(){
   String msg = KILO + "";
   return msg;
 }
}
