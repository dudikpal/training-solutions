package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends  Character{

    private int numberOfArrow;

    public Archer(Point position, Random random) {
        super(position, random);
        numberOfArrow = 100;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow--;
        super.hit(enemy, getActualSecondaryDamage());
    }

    private int getActualSecondaryDamage() {
        return super.getRandom().nextInt(5) + 1;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }
}
