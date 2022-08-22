import Classes.BrownDuckInterfase;
import Classes.DuckStatue;
import Classes.Mallard;

public class Main {
    public static void main(String[] args) {
        BrownDuckInterfase bDuck = new BrownDuckInterfase();
        DuckStatue sDuck = new DuckStatue();
        Mallard mallard = new Mallard();

        System.out.println("********** Brown duck interface **********");
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
