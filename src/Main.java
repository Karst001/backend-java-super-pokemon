//Requirements
//In de main-methode worden vier verschillende Pokèmon-objecten van verschillende klassen geïnstantieerd- en gedeclareerd.
//Met behulp van deze objectnamen kunnen de methodes van de verschillende klassen worden uitgevoerd;
//Deze methodes mogen void teruggeven en een system.out.println uitvoeren.

import Pokemons.ElectricPokemon;
import Pokemons.FirePokemon;
import Pokemons.GrassPokemon;
import Pokemons.WaterPokemon;

//main class that is executable
public class Main {

    public static void main(String[] args) {
        //create pokemon
        FirePokemon fire = new FirePokemon("Jack",0,0,0);
        //print the baseline
        System.out.println(fire.toString());

        //change some values;
        fire.setLevel(2);
        fire.setHp(5);
        fire.setXp(10);
        fire.executeThunderPunch(3);
        fire.executeFlameThrower(1);
        //
        System.out.println("After Thunder & Flame & : " + fire.toString());

        //create pokemon
        ElectricPokemon electric = new ElectricPokemon("Tom",3,50,99);
        //print the baseline
        System.out.println(electric.toString());

        //create pokemon
        GrassPokemon grass = new GrassPokemon("Sally",50,10,2);
        //print the baseline
        System.out.println(grass.toString());

        //create pokemon
        WaterPokemon water = new WaterPokemon("Nemo",24,7,3);
        //print the baseline
        System.out.println(water.toString());
    }
}
