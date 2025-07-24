package creature;

import weapon.Weapon;

public abstract class Character implements Creature {
    private String name;
    private int hp;
    private Weapon weapon;
    private int mp;

    public Character(String name,int hp,Weapon weapon){
        setName(name);
        setWeapon(weapon);
        setHp(hp);
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
    }
    public Character(String name,int hp,int mp,Weapon weapon){
        setName(name);
        setWeapon(weapon);
        setMp(mp);
        setHp(hp);
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp(){
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = Math.max(0,hp);
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = Math.max(0,mp);
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public final boolean isAlive(){
        return this.hp > 0;
    }
    public void showStatus(){
        System.out.println(getName() + " : HP  " + getHp());
    }
    void die() {
        System.out.println(getName() + "は死んでしまった！");
    }




}
