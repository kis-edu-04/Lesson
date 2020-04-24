package calkapp.main;

import calkapp.logics.Calklogic;
public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total =Calklogic. tasu(a, b);
    int delta =Calklogic. hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }

}