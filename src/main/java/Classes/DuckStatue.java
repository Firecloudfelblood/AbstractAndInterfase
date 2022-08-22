package Classes;

import Abstract.AbstractDuck;

public class DuckStatue extends AbstractDuck {

    @Override
    public void swim() {
        System.out.println("Cant swim");
    }

    @Override
    public void quack() {
        System.out.println("Can't quack");
    }
}
