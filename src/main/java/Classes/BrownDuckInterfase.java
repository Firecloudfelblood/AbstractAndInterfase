package Classes;

import Interfase.InterfaseDuck;

public class BrownDuckInterfase implements InterfaseDuck {
    @Override
    public void fly() {
        System.out.println("duck flys");
    }

    @Override
    public void speack(String sound) {
        System.out.println("quack");
    }

    @Override
    public String swim(String willSwim) {
        return "The duck " + willSwim+" Swim";
    }
}
