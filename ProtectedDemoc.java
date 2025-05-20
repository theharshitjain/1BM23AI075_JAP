package dpack;

import bpack.B;
import cpack.C;


public class ProtectedDemo {
    public static void main(String[] args){
        B bobj=new B();
        C cobj=new C();

        System.out.println("From Class B:");
        bobj.display();

        System.out.println("From Class C:");
        cobj.display();

    }
}
