
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    // TODO - replace this line with instruction from step 1
    public static int DEFAULT_POWER = 10;


    // instance variables
    // TODO - replace this line with instruction from step 2
    int power;
    // TODO - replace this line with instruction from step 3
    String name ;
    // constructors

    // TODO - replace this line with instruction from step 4
    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public  PowerPill(String name){
        this.name = name;
        power = DEFAULT_POWER;
    }
    // TODO - replace this line with instruction from step 5
    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power){
        this.name = name;
        this.power = power;
    }

    // accessor methods

    // TODO - replace this line with instruction from step 6
    public int getPower(){
        return power;
    }
    public String getName(){
        return name;
    }
    // mutator methods

    // TODO - replace this line with instruction from step 7
    public void setPower(int power){
        this.power = power;
    }
    public void setName(String name){
        this.name = name;
    }
    // toString method

    // TODO - replace this line with instruction from step 8

    
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }
}