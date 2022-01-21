package prova;

import java.io.*;

public class Principal {

    private static float i;
    
    public static void main(String[] args) throws IOException {
        
        System.out.println(i);
    }
    
    class B {
        void x(int i) throws IOException {
            if (i < 0) return;
                System.out.println("c");
        }
    }
    
    abstract class C extends B {
        @Override
        void x(int i) throws IOException {
            System.out.println("b");
            super.x(i);
        }
    }
    
    abstract class D extends C {
        @Override
        void x(int i) throws IOException {
            super.x(i);
        }
    }
    class E extends D { }
}