package creature.character;
        //aa

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Wizard extends Character {
    private int mp;

    public Wizard(String name,int hp,int mp,Weapon weapon){
        super(name,hp,mp,weapon);
    }
    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp){
        this.mp = mp;
    }

    public void magic(Creature target){
        System.out.println(getName() + "は" + getWeapon().getName() + getWeapon().attackMessage() + target.getName() + "に" + getWeapon().getDamage()+ "のダメージを与えた！");
        setMp(getMp() - getWeapon().getCost());
        if(getMp() <= 0) {
            System.out.println("MPが足りない！");
        } else {
            target.setHp(target.getHp() - getWeapon().getDamage());
        }
    }
    public void attack(Creature target){
        System.out.println(getName() + "は石を投げた！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp() - 3);
    }
    public void showStatuas() {
        System.out.println(getName() + " : HP  " + getHp() + "/MP" + getMp());
    }
}
