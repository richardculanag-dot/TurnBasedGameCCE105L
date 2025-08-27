package abstraction;
import javax.swing.JOptionPane;

public class TurnBasedGame {
    public static void main(String[] args) {

        String mageName = JOptionPane.showInputDialog("Enter Mage's name:");
        String warriorName = JOptionPane.showInputDialog("Enter Warrior's name:");

        Character mage = new Mage(mageName);
        Character warrior = new Warrior(warriorName);

        JOptionPane.showMessageDialog(null, "Game starts! Both have 100 HP.");

        while (mage.isAlive() && warrior.isAlive()) {
            int mageChoice = Integer.parseInt(JOptionPane.showInputDialog(
                mage.getName() + " the Mage's Turn!\n1. Fireball\n2. Lightning Strike\n3. Arcane Blast"));

            int damage = switch (mageChoice) {
                case 1 -> mage.attack();
                case 2 -> mage.specialMove();
                case 3 -> mage.secretPower();
                default -> 0;
            };
            warrior.takeDamage(damage);

            if (!warrior.isAlive()) break;

            int warChoice = Integer.parseInt(JOptionPane.showInputDialog(
                warrior.getName() + " the Warrior's Turn!\n1. Sword Slash\n2. Heavy Strike\n3. Berserker Rage"));

            damage = switch (warChoice) {
                case 1 -> warrior.attack();
                case 2 -> warrior.specialMove();
                case 3 -> warrior.secretPower();
                default -> 0;
            };
            mage.takeDamage(damage);

            // Show HP Status
            JOptionPane.showMessageDialog(null,
                mage.getName() + ": " + mage.getHp() + " HP\n" +
                warrior.getName() + ": " + warrior.getHp() + " HP");
        }

        // Winner
        String winner = mage.isAlive() ? mage.getName() : warrior.getName();
        JOptionPane.showMessageDialog(null, "🎉 " + winner + " wins the battle!");
    }
}
