package abstraction;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int attackDamage;

    public Character(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public boolean isAlive() { return hp > 0; }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public abstract int attack();
    public abstract int specialMove();
    public abstract int secretPower();
}
