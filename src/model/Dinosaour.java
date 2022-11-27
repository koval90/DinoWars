package model;

import java.util.Random;

abstract class Dinosaour extends Creature {

    public Dinosaour(){

    }
    public Dinosaour(int hp, int attackPower, int defenseStrenth) {
        super(hp, attackPower, defenseStrenth);
    }

    public void attack(Creature creatureAttacked) {
        int attackPower = this.getAttackPower();
        int tmpAttackPower = new Random().nextInt(0, attackPower);
        int defenseStrenth = creatureAttacked.getDefenseStrenth();
        int tmpDefenseStrenth = new Random().nextInt(0, defenseStrenth);
        System.out.println(tmpAttackPower);
        System.out.println(tmpDefenseStrenth);

        if (tmpAttackPower > tmpDefenseStrenth){
            int effectiveAttack = tmpAttackPower - tmpDefenseStrenth;
            creatureAttacked.hp = creatureAttacked.hp - effectiveAttack;
        }
        else System.out.println("Ineffective Attack...");
    }
}
