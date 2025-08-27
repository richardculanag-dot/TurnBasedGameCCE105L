package cce105;

import javax.swing.JOptionPane;

class warrior extends character {
    public warrior(String name) {
        super(name, 120, 12); 
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " swings a mighty sword!");
        return attackDamage;
    }

    @Override
    public int specialMove() {
        JOptionPane.showMessageDialog(null, name + " uses Shield Bash!");
        return attackDamage + 8;
    }

    @Override
    public int secretPower() {
        JOptionPane.showMessageDialog(null, name + " unleashes Berserk Rage!");
        return attackDamage + 18;
    }
}
