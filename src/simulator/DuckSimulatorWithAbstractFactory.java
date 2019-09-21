package simulator;

import duckfactory.AbstractDuckFactory;
import duckfactory.CountingDuckFactory;
import eccho.Eccho;
import eccho.EcchoFactory;
import goose.Goose;
import goose.GooseAdapter;
import quack.QuackCounter;
import quack.Quackable;

public class DuckSimulatorWithAbstractFactory {

    public static void main(String[] args) {
        DuckSimulatorWithAbstractFactory simulator = new DuckSimulatorWithAbstractFactory();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory ecchoFactory = new EcchoFactory();


        simulator.simulate(duckFactory);
        simulator.simulate2(ecchoFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate2(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " + Eccho.getEccho() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
