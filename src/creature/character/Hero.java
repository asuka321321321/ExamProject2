package creature.character;
import creature.Character;
import creature.Creature;

import weapon.Dagger;
import weapon.Weapon;


public class Hero extends Character {

    public Hero(String name,int hp,Weapon weapon){
        super(name,hp,weapon);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeapon().getName() + getWeapon().attackMessage() + target.getName() + "に" + getWeapon().getDamage()+ "のダメージを与えた！");
        target.setHp(target.getHp() - getWeapon().getDamage());
    }
}
