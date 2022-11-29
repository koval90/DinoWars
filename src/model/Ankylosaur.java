package model;

import java.util.Random;

public class Ankylosaur extends Dinosaour{

    int creatingAttackPower = new Random().nextInt(50,70);
    int creatingDefenseStrenth = new Random().nextInt(60,80);
    public Ankylosaur(){
        this.hp = 100;
        this.attackPower = creatingAttackPower;
        this.defenseStrenth = creatingDefenseStrenth;
    };

    public Ankylosaur(int hp, int attackPower, int defenseStrenth){
        super(hp, attackPower, defenseStrenth);
    }
}
