package day2;
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");

        System.out.println(pikachu);
        System.out.println(charmander);

        Pair<Pokemon, String> heldItem = new Pair<>(pikachu, "Oran Berry");
        System.out.println(heldItem);
    }
}