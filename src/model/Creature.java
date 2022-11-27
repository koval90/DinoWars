package model;

public class Creature {

    int hp = 100;
    int attackPower;
    int defenseStrenth;
    Creature(){

    }

    Creature(int hp, int attackPower, int defenseStrenth){
        this.hp = hp;
        this.attackPower = attackPower;
        this.defenseStrenth = defenseStrenth;
    }



    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefenseStrenth() {
        return defenseStrenth;
    }

    public void setDefenseStrenth(int defenseStrenth) {
        this.defenseStrenth = defenseStrenth;
    }
}
