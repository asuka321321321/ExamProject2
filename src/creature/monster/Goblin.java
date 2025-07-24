package creature.monster;

import creature.Monster;
import creature.Creature;

public class Goblin extends Monster {
    public Goblin(String name,char suffix,int hp) {
        super("ゴブリン",suffix,hp);
    }
    public void attack(Creature target){
        System.out.println("ゴブリン" + getSuffix() + "はナイフで切りつけた！" + target.getName() + "に８のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }

}