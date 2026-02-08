package day2;
public class Pokebox {
    private int val;

    public Pokebox(int val) {
        this.val = val;
    }

    public int pokeGet() {
        return val;
    } 

    public void set(Pokemon newVal) {
        this.val = newVal;
    }
}