package cce105;

import javax.swing.JOptionPane;

class mage extends character {
    public mage(String name) {
        super(name, 100, 15);
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " casts Fireball!");
        return attackDamage;
    }

    @Override
    public int specialMove() {
        JOptionPane.showMessageDialog(null, name + " casts Meteor Shower");
        return attackDamage + 10;
    }

    @Override
    public int secretPower() {
        JOptionPane.showMessageDialog(null, name + " unleashes atom manipulation!");
        return attackDamage + 20;
    }
}
