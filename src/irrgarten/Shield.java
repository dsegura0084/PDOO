
package irrgarten;

public class Shield {
    
    private float protection;
    private int uses;

    // Constructor
    public Shield(float protection, int uses) {
        this.protection = protection;
        this.uses = uses;
    }

    // Protect
    public float protect() {
        if (uses > 0){
            uses--;
            return protection;
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
        return "S[" + protection + ", " + uses + "]";
    }
}
