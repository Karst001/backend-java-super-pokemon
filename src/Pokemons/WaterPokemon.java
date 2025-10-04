package Pokemons;

//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2private variabelen, 1 constructor, 2 methodes, 1 override methode, 2 getters en 2 setters bevatten
public class WaterPokemon extends Pokemon{
    // subclass-specific private variables
    private int surf;
    private int hydroPump;

    public WaterPokemon(String name, int level, int hp, int xp) {  //since FirePokemon is always Type 'Fire' no need to pass it again
        super(name, Type.WATER, level, hp, xp);

        //initial values at startup
        this.surf = 7;
        this.hydroPump = 4;
    }

    //methods that can be called from Pokemon
    public void executeSurf(int surfValue) {
        this.surf += surfValue;
    }

    public void executeFlameThrower(int hydroPumpValue) {
        this.hydroPump += hydroPumpValue;
    }

    //getters
    public int getSurf() {
        return surf;
    }

    public double getHydroPump() {
        return hydroPump;
    }

    //setters
    public void setThunderPunch(int surf) {
        this.surf = surf;
    }

    public void setFlameThrower(int hydroPump) {
        this.hydroPump = hydroPump;
    }

    //override toString called from the superclass Pokemon)
    @Override
    public String toString() {
        return super.toString() +
                " [Hydro subclass: Surf=" + surf +
                ", HydroPump=" + hydroPump + "]";
    }
}
