
package irrgarten;
import java.util.Random;
import java.util.ArrayList;

public class Dice {
    
    private static final int MAX_USES = 5;
    private static final float MAX_INTELLIGENCE = (float) 10.0;
    private static final float MAX_STRENGTH = (float) 10.0;
    private static final float RESURRECT_PROB = (float) 0.3;
    private static final int WEAPONS_REWARD = 2;
    private static final int SHIELDS_REWARD = 3;
    private static final int HEALTH_REWARD = 5;
    private static final int MAX_ATTACK = 3;
    private static final int MAX_SHIELD = 2;

    private static Random generator = new Random();

    public static int randomPos (int max) {
        return generator.nextInt(max);
    }

    //public static int whoStarts (int nplayers) {
       // return generator.nextInt(nplayers);
   // }

    //public static float randomIntelligence () {
        //
    //}

    //public static float randomStrength () {
        //
    //}

    //public static boolean resurrectPlayer() {
        //
    //}

    //public static int shieldsReward() {
        //
    //}

    //public static int healthReward() {
        //
    //}

    //public static float weaponPower() {
        //
    //}

    //public static float shieldPower() {
        //
    //}

    //public static int usesLeft() {
        //
    //}

    //public static float intensity(float competence) {
        //
    //}

    public static boolean discardElement(int usesLeft) {
        return false;    
    }

    //public static float weaponPower() {
        //
    //}
    
}