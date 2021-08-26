package Memento.Sample;

import Memento.Sample.game.*;


public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状: " + gamer);
            gamer.bet();
            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");
            if (gamer.getMoney() > memento.getMoney()) {
                memento = gamer.createMemento();
                System.out.println("     (だいぶ増えたので、現在の状態を保存しておこう) ");
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                gamer.restoreMemento(memento);
                System.out.println("     (だいぶ減ったので、以前の状態に復帰しよう) ");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
}
