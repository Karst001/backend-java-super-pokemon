package Pokemons;

//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2private variabelen, 1 constructor, 2 methodes, 1 override methode, 2 getters en 2 setters bevatten
public class GrassPokemon extends Pokemon {
    // subclass-specific private variables
    private int solarBeam;
    private int leafStorm;

    public GrassPokemon(String name, int level, int hp, int xp) {
        super(name, Type.GRASS, level, hp, xp);

        //initial values at startup
        this.solarBeam = 1;
        this.leafStorm = 1;
    }

    //methods that can be called from Pokemon
    public void executeSolarBeam(int solarBeamValue) {
        this.solarBeam += solarBeamValue;
    }

    public void executeLeafStorm(int leafStormValue) {
        this.leafStorm += leafStormValue;
    }

    //getters
    public int getSolarBeam() {
        return solarBeam;
    }

    public double getLeafStorm() {
        return leafStorm;
    }

    //setters
    public void setSolarBeam(int solarBeam) {
        this.solarBeam = solarBeam;
    }

    public void setLeafStorm(int leafStorm) {
        this.leafStorm = leafStorm;
    }

    //override toString called from the superclass Pokemon)
    @Override
    public String toString() {
        return super.toString() +
                " [Fire subclass: SolarBeam=" + solarBeam +
                ", LeafStorm=" + leafStorm + "]";
    }
}
