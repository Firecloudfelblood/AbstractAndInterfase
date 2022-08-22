package Classes;

import Abstract.AbstractDuck;

public class Mallard extends AbstractDuck {
    @Override
    public void swim() {
        System.out.println("swiming");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
