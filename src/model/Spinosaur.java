package model;


import java.util.Random;

public class Spinosaur extends Dinosaour {

    int creatingAttackPower = new Random().nextInt(80,100);
    int creatingDefenseStrenth = new Random().nextInt(30,50);

    public Spinosaur(){
        this.hp = 100;
        this.attackPower = creatingAttackPower;
        this.defenseStrenth = creatingDefenseStrenth;
    }

    public Spinosaur(int hp, int attackPower, int defenseStrenth){
        super(hp, attackPower,defenseStrenth);
    }


}