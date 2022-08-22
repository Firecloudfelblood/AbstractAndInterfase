import Classes.*;

public class Main {
    public static void main(String[] args) {
        CanadianDuck cDuck = new CanadianDuck();
        RubberDuck rubberDuck = new RubberDuck();
        BrownDuckInterfase bDuck = new BrownDuckInterfase();
        DuckStatue sDuck = new DuckStatue();
        Mallard mallard = new Mallard();

        System.out.println("********** Canadian Duck **********");
        cDuck.quack();
        cDuck.swim();

        System.out.println("\n********** Rubber Duck **********");
        rubberDuck.quack();
        rubberDuck.swim();

        System.out.println("\n********** Brown duck interface **********");
        bDuck.speack("quack");
        bDuck.fly();
        System.out.println( bDuck.swim("can"));

        System.out.println("\n********** Duck Statue **********");
        sDuck.swim();
        sDuck.displayDuck();
        sDuck.quack();

        System.out.println("\n********** Mallard duck **********");
        mallard.swim();
        mallard.quack();
        mallard.displayDuck();

    }
}
