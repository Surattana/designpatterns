package flock;

import quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    int count = 0;
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
        this.count=1;
    }
    public void quack() {
        Iterator iterator = quackers.iterator();


        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            if (count == 1) {
                quacker.quack();
                quacker.quack();
                count+=1;
            }
            quacker.quack();
        }
    }
}
