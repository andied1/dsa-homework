package day2;

public class BattlePokemon extends Pokemon {
    private int hp;
    
    public BattlePokemon(String name, String type, int hp) {
        super(name, type);
        this.hp = hp;
    }

    public int getHP() {
        return hp;
    }

    @Override
    public String toString() {
        return super.toString() + " HP: " + hp;
    }
}
