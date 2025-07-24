package creature.character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Thief extends Character {
    private boolean guard;

    public Thief(String name,int hp,Weapon weapon) {
        super(name,hp,weapon);

    }
    public void guard() {
        guard = true;
    }

    public void setHp(int hp) {
        if(guard == true){
            guard = false;
            System.out.println("しかし、"+ getName() + "は攻撃を回避し、ダメージが入らなかった！");
        }
        super.setHp(hp);
    }

    @Override
    public void attack(Creature target){
        System.out.println(getName() + "は" + target.getName() + "に素早く2回攻撃した!" + getName() + "は" + getWeapon().getName() + getWeapon().attackMessage() + target.getName() + "に" + getWeapon().getDamage()+ "のダメージを与えた！");
        target.setHp(target.getHp() - getWeapon().getDamage()*2);
    }
}
