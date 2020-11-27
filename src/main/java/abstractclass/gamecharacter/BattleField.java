package abstractclass.gamecharacter;

public class BattleField {

    private int round;


    public Character fight(Character one, Character other) {
        round = 1;

        while (oneHit(one, other)) {
            oneHit(one, other);
            if (oneHit(one, other)) {
                oneHit(other, one);
            }
            round++;
            System.out.println(showFight(one, other));
        }
        Character winner;
        if (one.isAlive()) {
            winner = one;
        } else {
            winner = other;
        }

        return winner;
    }

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
            return true;
        }
        return false;
    }

    public int getRound() {
        return round;
    }

    public String showFight(Character attacker, Character defender) {
        return "\t\t\t\t\tAttacker\t\t\t" + "Defender\n" +
                "Hit points: \t\t" + attacker.getHitPoint() + "\t\t\t\t\t" + defender.getHitPoint() + "\n" +
                "Primary attack: \t" + attacker.getActualPrimaryDamage() + "\t\t\t\t\t" + defender.getActualPrimaryDamage() + "\n"
                ;

    }
}
