package day2;
public class PokemonOnlyBox<T extends Pokemon> {
    private T value;

    public PokemonOnlyBox(T value){
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T newVal) {
        value = newVal;
    }

    public String getType() {
        return value.getType();
    }
}