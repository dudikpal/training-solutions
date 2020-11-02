package math.game;

public class Game {
    public static void main(String[] args) {
        Point w1Point = new Point(5, 5);
        Point w2Point = new Point(10, 10);
        Warrior warrior1 = new Warrior("Warrior1", w1Point);
        Warrior warrior2 = new Warrior("Warrior2", w2Point);

        for(int round = 0; warrior1.isAlive() && warrior2.isAlive(); round++) {
            System.out.println("Round " + round);
            System.out.println(warrior1);
            System.out.println(warrior2);

            if (warrior1.distance(warrior2) > 0) {
                warrior1.move(warrior2);
                warrior2.move(warrior1);
            } else {
                warrior1.attack(warrior2);
                if (warrior2.isAlive()) {
                    warrior2.attack(warrior1);
                }
            }
        }
        System.out.println("Winner: " + (warrior1.isAlive() ? warrior1 : warrior2));

    }
}
