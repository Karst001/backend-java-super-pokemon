package Pokemons;

//this common helper determines how effective the Pokemon can be against attacks
public class DefenseHelper {

    //example if Pokemon Fire shoots a flamethrower attack against Water the defense is high
    public static double effectiveAgainstFlameAttacks(Type defenderPokemon){
        switch (defenderPokemon){
            case WATER:
                return 10.0;
            case FIRE:
                return 0;
            case ELECTRIC:
                return 0;
            case GRASS:
                return 5.0;
            default:
                return 0;
        }
    }

    //example if Pokemon Water shoots hydroPump against ELECTRIC defense is low, while grass has a defense value
    public static double effectiveAgainstElectricityAttacks(Type defenderPokemon){
        switch (defenderPokemon){
            case WATER:
                return 25;
            case FIRE:
                return 0;
            case ELECTRIC:
                return 5.0;
            case GRASS:
                return 10.0;
            default:
                return 0;
        }
    }

    // extend with more methods for various scenarios
}
