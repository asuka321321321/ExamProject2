package creature.character;
import creature.Creature;
import weapon.Weapon;

public class SuperHero extends Hero{

    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getHp(),hero.getWeapon());//SuperHeroのコンストラクタとして親クラスのコンストラクタを呼び出す
        System.out.println("勇者はスーパーヒーローに進化した！");
        hero.setHp(hero.getHp() - 30);
    }

    @Override
    public void attack(Creature target){
        //super.attack(target);
        System.out.println(getName() + "は" + getWeapon().getName() + getWeapon().attackMessage() + target.getName() + "に" + getWeapon().getDamage()+ "のダメージを与えた！");
        target.setHp((int) (target.getHp() - getWeapon().getDamage() * 2.5));
    }


}
