package com.driver;



public class Main {

   public static void main(String[] args) {

        B b = new B();
        b.meth();

        B b1 = new B();
        b1.meth();

        System.out.println("Ami J tumarrr chum chum chum......");
   }

   
   public class A {
    
    public String meth() {
        return "Invoking method from class A";
    }

    @Override
    public class B extends A{
       
        String meth(){
            return "Method is overridden in Extendend class B";
        }

    }
}
}