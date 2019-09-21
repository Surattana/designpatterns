package eccho;

import quack.Quackable;

public class Eccho implements Quackable {
    Quackable duck;
    static int numberOfEccho;

    public Eccho (Quackable duck){

        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        numberOfEccho++;
    }

    public static int getEccho(){

        return numberOfEccho;
    }
}
