package ellime.pokemonevcounter.pokemon;

public class PokemonG3 { // TODO: Implement EVMods when the time is right

    private String generation;

    // Stat types
    protected int hp;
    protected int atk;
    protected int def;
    protected int spAtk;
    protected int spDef;
    protected int spd;

    private String name;

    public PokemonG3(String name) {
        setGeneration();
        this.name = name;

        this.hp = 0;
        this.atk = 0;
        this.def = 0;
        this.spAtk = 0;
        this.spDef = 0;
        this.spd = 0;
    }

    // GETTERS


    public String getGeneration() {
        return generation;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public int getSpd() {
        return spd;
    }

    public String getName() {
        return name;
    }


    // SETTERS


    public void setGeneration() {
        this.generation = "Generation 3";
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public void setName(String name) {
        this.name = name;
    }
}
