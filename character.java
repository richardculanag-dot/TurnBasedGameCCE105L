package cce105;

abstract class character {
    String name;
    int hp;
    int attackDamage;

    public character(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public abstract int attack();
    public abstract int specialMove();
    public abstract int secretPower();

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public void showStatus() {
        System.out.println(name + " HP: " + hp);
    }
}
