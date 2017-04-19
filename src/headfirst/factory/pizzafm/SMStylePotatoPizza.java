package headfirst.factory.pizzafm;

public class SMStylePotatoPizza extends Pizza {

 public SMStylePotatoPizza() { 
  name = "상명이 만든 포테이토 피자!!!!!";
  dough = "치즈크러스트 도우";
  sauce = "핫 소스";
 
  toppings.add("상명 특제야채!");
  toppings.add("상명 특제소스!");
  toppings.add("상명 유기농 감자 슬라이스!");
 }
}