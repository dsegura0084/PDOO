
package irrgarten;

public class Weapon {
    
    private float power;
    private int uses;

    // Constructor
    public Weapon(float power, int uses) {
        this.power = power;
        this.uses = uses;
    }

    // Atack
    public float attack() {
        if (uses > 0) {
            uses--;
            return power;
        }
        else
            return 0;
    }

    // DISCARD (revisar)
    public boolean discard() {
        return Dice.discardElement(uses);
    }

    // toString
    public String toString() {
        return "W[" + power + ", " + uses + "]";
    }
}