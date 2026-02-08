package day2;
public class PokemonOnlyBox<T extends Pokemon> {
    private T val;

    public PokemonOnlyBox<T val>{
        this.val = val;
    }

    public T get() {
        return val;
    }

    public void set(T newVal) {
        val = newVal;
    }

    public String toString() {
        return val;
    }
    }
}