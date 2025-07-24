package creature;

public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;

    public Monster(String name,char suffix,int hp){
        setName(name);
        setSuffix(suffix);
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
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = Math.max(0,hp);
    }
    public char getSuffix()     {
        return this.suffix;
    }
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
    public void run() {
        System.out.println(getName() + getSuffix() + "は逃げ出した！");
    }
    public void die() {
        System.out.println(getName() + getSuffix() + "を倒した！");
    }
    public final boolean isAlive() {
        return this.hp > 0;
    }
    public void showStatus() {
        System.out.println(getName() + getSuffix() + " : HP  " + getHp());
    }
}
