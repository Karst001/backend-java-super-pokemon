package Pokemons;

//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2private variabelen, 1 constructor, 2 methodes, 1 override methode, 2 getters en 2 setters bevatten
public class FirePokemon extends Pokemon {
    // subclass-specific private variables
    private int thunderPunch;
    private int flameThrower;

    public FirePokemon(String name, int level, int hp, int xp) {  //since FirePokemon is always Type 'Fire' no need to pass it again
        super(name, Type.FIRE, level, hp, xp);

        //initial values at startup
        this.thunderPunch = 5;
        this.flameThrower = 2;
    }

    //methods that can be called from Pokemon
    public void executeThunderPunch(int punchValue) {
        this.thunderPunch += punchValue;
    }

    public void executeFlameThrower(int flameThrowerValue) {
        this.flameThrower += flameThrowerValue;
    }

    //getters
    public int getThunderPunch() {
        return thunderPunch;
    }

    public int getFlameThrower() {
        return flameThrower;
    }

    //setters
    public void setThunderPunch(int thunderPunch) {
        this.thunderPunch = thunderPunch;
    }

    public void setFlameThrower(int flameThrower) {
        this.flameThrower = flameThrower;
    }

    //override toString called from the superclass Pokemon)
    @Override
    public String toString() {
        return super.toString() +
                " [Fire subclass: ThunderPunch=" + thunderPunch +
                ", FlameThrower=" + flameThrower + "]";
    }

    //added abstract class
    @Override
    public double makeMyMove(Pokemon target) {
        //access helper to see what damage might be done
        return DefenseHelper.effectiveAgainstFlameAttacks(target.getType());
    }
}
