package bo.sigep.hexa.application;

import bo.sigep.hexa.domain.MyDomain;

public class Main {

    public static void main(String[] args) {
        MyApplication my = new MyApplication();
        my.print();

        MyDomain md = new MyDomain();
        md.print();
    }
}
