package abstraction;
import javax.swing.JOptionPane;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 100, 20); 
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " casts Fireball! (20 damage)");
        return 20;
    }

    @Override
    public int specialMove() {
        JOptionPane.showMessageDialog(null, name + " summons Lightning Strike! (25 damage)");
        return 25;
    }

    @Override
    public int secretPower() {
        JOptionPane.showMessageDialog(null, name + " unleashes Arcane Blast! (35 damage)");
        return 35;
    }
}