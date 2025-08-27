package cce105;

import javax.swing.JOptionPane;

public class gilay {
    public static void main(String[] args) {
        // Ask for names
        String mageName = JOptionPane.showInputDialog("Enter a name for the Mage:");
        String warriorName = JOptionPane.showInputDialog("Enter a name for the Warrior:");

        character mage = new mage(mageName);
        character warrior = new warrior(warriorName);

        while (mage.isAlive() && warrior.isAlive()) {
            String mageMove = JOptionPane.showInputDialog(mage.name + 
                " - Choose move: 1. Attack  2. Special Move  3. Secret Power");
            int mageDamage = 0;
            if (mageMove.equals("1")) mageDamage = mage.attack();
            else if (mageMove.equals("2")) mageDamage = mage.specialMove();
            else if (mageMove.equals("3")) mageDamage = mage.secretPower();

            warrior.takeDamage(mageDamage);
            JOptionPane.showMessageDialog(null, warrior.name + " HP: " + warrior.hp);
            if (!warrior.isAlive()) break;

        
            String warriorMove = JOptionPane.showInputDialog(warrior.name + 
                " - Choose move: 1. Attack  2. Special Move  3. Secret Power");
            int warriorDamage = 0;
            if (warriorMove.equals("1")) warriorDamage = warrior.attack();
            else if (warriorMove.equals("2")) warriorDamage = warrior.specialMove();
            else if (warriorMove.equals("3")) warriorDamage = warrior.secretPower();

            mage.takeDamage(warriorDamage);
            JOptionPane.showMessageDialog(null, mage.name + " HP: " + mage.hp);
        }

        if (mage.isAlive()) {
            JOptionPane.showMessageDialog(null, mage.name + " wins!");
        } else {
            JOptionPane.showMessageDialog(null, warrior.name + " wins!");
        }
    }
}
