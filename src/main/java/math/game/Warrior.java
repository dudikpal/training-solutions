package math.game;

import java.util.Random;

public class Warrior {

    private final Random rnd = new Random();

    private String name;
    private int stamina;
    private Point position;
    private double skill;

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        this.stamina = rnd.nextInt(81) + 20;
        this.skill = rnd.nextDouble();
    }

    public Point getPosition() {
        return position;
    }

    public void move(Warrior masik) {
        int newX = getPosition().getX();
        int newY = getPosition().getY();
        int masikX = masik.getPosition().getX();
        int masikY = masik.getPosition().getY();

        if (masikX - newX > 0) {
            newX++;
        } else if (masikX - newX < 0) {
            newX--;
        }

        if (masikY - newY > 0) {
            newY++;
        } else if(masikY - newY < 0) {
            newY--;
        }

        position = new Point(newX, newY);
    }

    public void attack(Warrior warrior) {
        if (rnd.nextDouble() < skill) {
            warrior.stamina -= rnd.nextInt(4);
        }
    }

    public double distance(Warrior warrior) {
        return position.distance(warrior.getPosition());
    }

    public boolean isAlive() {
        return stamina > 0 ? true : false;
    }

    public String toString() {
        return name + ": (" + position.getX() + ", " + position.getY() + ") Stamina: " + stamina;
    }
}
