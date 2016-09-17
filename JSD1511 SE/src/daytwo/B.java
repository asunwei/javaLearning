package daytwo;


class A {

 public void start() {

  System.out.println("A Start");

 }

}

public class B extends A {

 public void start() {

  System.out.println("B Start");

 }

 public static void main(String[] args) {

  ((A) new B()).start();

 }

}
