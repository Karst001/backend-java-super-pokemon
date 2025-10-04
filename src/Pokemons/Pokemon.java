package Pokemons;

//Required:
//Een Super klasse waarvan minimaal 2 private variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;

//superclass that applies to all classes
public class Pokemon {
    //variables
    private final String species;
    private final Type type;
    private int level;
    private int hp;
    private int xp;

    //constructor
    public Pokemon(String species, Type type, int level, int hp, int xp) {
        //validate input
        if (species == null || species.isBlank()) {
            throw new IllegalArgumentException("Species is required");
        }
        if (type == null) {
            throw new IllegalArgumentException("Type is required");
        }
        if (hp < 0) {
            throw new IllegalArgumentException("Health Points cannot be negative");
        }
        if (level < 0) {
            throw new IllegalArgumentException("Level cannot be negative");
        }
        if (xp < 0) {
            throw new IllegalArgumentException("Experience points cannot be negative");
        }
        //

        //set the initial values
        this.species = species;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }


    //getters for all variables
    public String getSpecies() {
        return species;
    }

    public Type getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    //setters for variables that can be changed
    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    //

    @Override
    public String toString() {
        return ("[Pokemon superclass: Species: " + species + ", Type: " + type + ", Level: " + level + ", HP: " + hp + ", XP: " + xp + "]");
    }
}