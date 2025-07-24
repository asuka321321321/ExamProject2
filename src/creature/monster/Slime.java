package creature.monster;

import creature.Creature;
import creature.Monster;

public final class Slime extends Monster {
    public Slime(String name,char suffix,int hp){
        super(name,suffix,hp);
    }

    @Override
    public void attack(Creature target){
        System.out.println(getName() + getSuffix() + "は体当たり攻撃！" + target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
}
