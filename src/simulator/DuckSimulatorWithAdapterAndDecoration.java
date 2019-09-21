package simulator;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import eccho.Eccho;
import goose.Goose;
import goose.GooseAdapter;
import pegion.Pegion;
import pegion.PegionAdapter;
import quack.QuackCounter;
import quack.Quackable;

public class DuckSimulatorWithAdapterAndDecoration {
    public static void main(String[] args) {
        DuckSimulatorWithAdapterAndDecoration simulator = new DuckSimulatorWithAdapterAndDecoration();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter (new Eccho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new Eccho(new RedHeadDuck()));
        Quackable duckCall = new QuackCounter (new Eccho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new Eccho(new RubberDuck()));
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pegionDuck = new PegionAdapter(new Pegion());


        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pegionDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        System.out.println("The ducks quacked Eccho " + Eccho.getEccho() + " times");
    }
    void simulate(Quackable duck) {

         duck.quack();
    }
}