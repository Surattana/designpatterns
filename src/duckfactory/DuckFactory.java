package duckfactory;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import quack.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {

        return new MallardDuck();
    }
    public Quackable createRedheadDuck() {

        return new RedHeadDuck();
    }
    public Quackable createDuckCall() {

        return new DuckCall();
    }
    public Quackable createRubberDuck() {

        return new RubberDuck();

    }
}
