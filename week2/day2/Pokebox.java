package day2;
public class PokeBox {
    private Pokemon val;

    public PokeBox(Pokemon val) {
        this.val = val;
    }

    public Pokemon pokeGet() {
        return val;
    } 

    public void set(Pokemon newVal) {
        this.val = newVal;
    }
}