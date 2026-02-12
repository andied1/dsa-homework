package day2;
public class Main {
    public static void main(String[] args) {
        /*
        Pokemon pikachu = new Pokemon("Pikachu", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");

        System.out.println(pikachu);
        System.out.println(charmander);

        Pair<Pokemon, String> heldItem = new Pair<>(pikachu, "Oran Berry");
        System.out.println(heldItem);

        Box<Pokemon> pokemonBox = new Box<>(pikachu);
        Box<String> itemBox = new Box<>("Oran Berry");
        Box<Integer> levelBox = new Box<>(25);
        
        BattlePokemon squirtle = new BattlePokemon("Squirtle", "Water", 60);
        PokemonOnlyBox<BattlePokemon> battleBox = new PokemonOnlyBox<>(squirtle);
        System.out.println(battleBox.get());
        */

        Box<String> a = new Box<>("Potion");
        Box<String> b = new Box<>("Rare Candy");
        System.out.println("Before: a=" + a.get() + ", b=" + b.get());
        swap(a, b);
        System.out.println("After:  a=" + a.get() + ", b=" + b.get());
    }
    public static <T> void swap(Box<T> a, Box<T> b) {
        T temp = a.get();
        a.set(b.get());
        b.set(temp);
    }

    public static void printTeam(java.util.List<? extends Pokemon> team) {
        
    }
}