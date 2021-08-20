package FactoryMethod.Sample;

import FactoryMethod.Sample.framework.*;
import FactoryMethod.Sample.idcard.*;


public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("みい");
        Product card2 = factory.create("とら");
        Product card3 = factory.create("ちび");
        card1.use();
        card2.use();
        card3.use();
    }
}
