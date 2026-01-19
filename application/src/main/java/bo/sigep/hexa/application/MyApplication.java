package bo.sigep.hexa.application;

import bo.sigep.hexa.domain.MyDomain;

public class MyApplication {

    public void print() {
        System.out.println("this is my application ++++++++++++++++++++");

        MyDomain md = new MyDomain();
        md.print();
    }
}
