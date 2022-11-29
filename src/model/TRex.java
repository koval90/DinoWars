package model;


import java.util.Random;

public class TRex extends Dinosaour {

    int creatingAttackPower = new Random().nextInt(70,90);
    int creatingDefenseStrenth = new Random().nextInt(40,60);



    public TRex() {
            this.hp = 100;
            this.attackPower = creatingAttackPower;
            this.defenseStrenth = creatingDefenseStrenth;

    }

    public TRex(int hp, int attackPower, int defenseStrenth){
        super(hp, attackPower,defenseStrenth);
    }
}
