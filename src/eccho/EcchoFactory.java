package eccho;

import duckfactory.AbstractDuckFactory;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import quack.QuackCounter;
import quack.Quackable;

public class EcchoFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new Eccho(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new Eccho(new RedHeadDuck());
    }

    public Quackable createDuckCall() {

        return new Eccho(new DuckCall());
    }

    public Quackable createRubberDuck() {

        return new Eccho(new RubberDuck());
    }
}
