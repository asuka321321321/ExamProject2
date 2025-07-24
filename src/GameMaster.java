import creature.*;
import creature.character.*;
import creature.Character;
import creature.monster.*;
import weapon.*;
import java.io.*;
import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {

        ArrayList<creature.Character> party = new ArrayList<creature.Character>();

        Sword sword = new Sword("剣",10);
        Dagger dagger = new Dagger("短剣",6);
        Wand wand = new Wand("杖",15);

        Hero h = new Hero("勇者", 10,sword);
        Wizard w = new Wizard("魔法使い",60,20,wand);
        Thief t = new Thief("盗賊",70,dagger);

        party.add(h);
        party.add(w);
        party.add(t);

        ArrayList<Monster> monsters = new ArrayList<Monster>();

        int kinokoCnt  = 0;
        int goblinCnt = 0;
        int slimeCnt = 0;

        for(int i = 0;i < 5;i++) {
            int fortune = new java.util.Random().nextInt(3) + 1;
            switch (fortune) {
                case 1:
                    Matango m = new Matango("お化けキノコ", (char)('A'+kinokoCnt++), 45);
                    monsters.add(m);
                    break;
                case 2:
                    Goblin g = new Goblin("ゴブリン", (char)('A'+goblinCnt++), 50);
                    monsters.add(g);
                    break;
                case 3:
                    Slime s = new Slime("スライム", (char)('A'+slimeCnt++), 40);
                    monsters.add(s);
                    break;
                default:
                    break;
            }
        }

        System.out.println("--味方パーティ--");
        for(creature.Character ally : party) {
            ally.showStatus();
        }

        System.out.println("\n--敵グループ--");
        for(Monster enemy : monsters) {
            enemy.showStatus();
        }

        System.out.println("\n味方の総攻撃！");
        for(creature.Character ally : party){
            for(Monster enemy : monsters){
                ally.attack(enemy);
            }
        }
//        if (!enemy.isAlive()) {
//            System.out.println(target.getName() + " を倒した！");
//            monsters.remove(target);
//        }

        System.out.println("\n敵の総攻撃！");
        for(Monster enemy : monsters){
            for(creature.Character ally : party){
                enemy.attack(ally);
            }
        }
//        if (!target.isAlive()) {
//            System.out.println(target.getName() + " を倒した！");
//            monsters.remove(target);
//        }

        System.out.println("\nダメージを受けた勇者が突然光りだした！");

        SuperHero sh =  new SuperHero(h);
        for(Monster enemy : monsters){
            sh.attack(enemy);
        }

        System.out.println("\n--味方パーティ最終ステータス--");
        String alive = "生存状況 : ";
        for(Character ally : party){
            ally.showStatus();

            if(ally.isAlive()){
                System.out.println(alive  + "生存");
            }else{
                System.out.println(alive + "死亡");
            }

        }

        System.out.println("\n--敵パーティ最終ステータス--");
        for(Monster enemy : monsters){

            enemy.showStatus();
            if(enemy.isAlive()){
                System.out.println(alive  + "生存");
            }else{
                System.out.println(alive + "討伐済み");
            }

        }

    }
}
