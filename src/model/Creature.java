package model;

public class Creature {

    int hp;
    int attackPower;
    int defense;
    Creature(){

    }

    Creature(int hp, int attackPower, int defense){
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
