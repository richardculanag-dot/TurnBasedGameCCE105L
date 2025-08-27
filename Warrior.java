package abstraction;
import javax.swing.JOptionPane;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 100, 15);
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " slashes with his Sword! (15 damage)");
        return 15;
    }

    @Override
    public int specialMove() {
        JOptionPane.showMessageDialog(null, name + " performs a Heavy Strike! (20 damage)");
        return 20;
    }

    @Override
    public int secretPower() {
        JOptionPane.showMessageDialog(null, name + " uses Berserker Rage! (30 damage)");
        return 30;
    }
}

