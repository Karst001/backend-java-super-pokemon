package Pokemons;

//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2private variabelen, 1 constructor, 2 methodes, 1 override methode, 2 getters en 2 setters bevatten
public class ElectricPokemon extends Pokemon{
    // subclass-specific private variables
    private int electroBall;
    private int voltTackle;

    public ElectricPokemon(String name, int level, int hp, int xp) {
        super(name, Type.ELECTRIC, level, hp, xp);

        //initial values at startup
        this.electroBall = 1;
        this.voltTackle = 1;
    }

    //methods that can be called from Pokemon
    public void executeThunderPunch(int electroValue) {
        this.electroBall += electroValue;
    }

    public void executeFlameThrower(int voltValue) {
        this.voltTackle += voltValue;
    }

    //getters
    public int getElectroBall() {
        return electroBall;
    }

    public double getVoltTackle() {
        return voltTackle;
    }

    //setters
    public void setElectroBall(int electroBall) {
        this.electroBall = electroBall;
    }

    public void setVoltTackle(int voltTackle) {
        this.voltTackle = voltTackle;
    }

    //override toString called from the superclass Pokemon)
    @Override
    public String toString() {
        return super.toString() +
                " [Electric subclass: ElectroBall=" + electroBall +
                ", VoltTackle=" + voltTackle + "]";
    }
}
