package week6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;

    class Pirate {
	String name;
	String role;
	int bounty;

	Pirate(String name, String role, int bounty) {
		this.name = name;
		this.role = role;
		this.bounty = bounty;
	}
}

public class Main {

    public static void main(String[] args) {
        
        // 1. Create a list of pirates with their names, roles, and bounties
        List<Pirate> strawHat = new ArrayList<>(
            List.of(
                new Pirate("Luffy", "Captain", 150),
                new Pirate ("Zoro", "Swordsman", 120),
                new Pirate("Nami", "Navigator", 66),
                new Pirate("Sanji", "Cook", 130),
                new Pirate("Chopper", "Doctor", 50),
                new Pirate("Andy", "Apprentice", 10)
            )
        );
        
        // 2. Use a stream to filter out pirates with a bounty of 100 or more
        // whats a stream? its a way to process collections of data in a functional style
        //what is Predicate? its a functional interface that represents a boolean-valued function of 
        Predicate<Pirate> highBounty = pirate -> pirate.bounty >= 100;
        Predicate<Pirate> lowBounty = pirate -> pirate.bounty < 100;

        List<Pirate> bigShots = strawHat.stream().filter(highBounty).toList();
        List<Pirate> lowShots = strawHat.stream().filter(lowBounty).toList();
        
        // 3. Print the names and bounties of the filtered pirates
        System.out.println("BIG SHOTS");
        bigShots.forEach(pirate -> System.out.println(pirate.name + ": " + pirate.bounty));
        System.out.println("LOW SHOTS");
        lowShots.forEach(pirate -> System.out.println(pirate.name + ": " + pirate.bounty));
        System.out.println("");


        // 4. Use an iterator to remove pirates with the role of "Apprentice"
        Iterator<Pirate> it = strawHat.iterator();
        while(it.hasNext()) {
            Pirate pirate = it.next();
            if(pirate.role.equalsIgnoreCase("Apprentice")) { it.remove(); }
        }
        

        // 5. Print the remaining pirates in the crew
        strawHat.forEach(pirate -> System.out.println(pirate.name + ": " + pirate.bounty));

        //C1.
        List<Pirate> sortByBounty = bigShots.stream().sorted(Comparator.comparingInt((Pirate p ) -> p.bounty).reversed()).toList();
        System.out.println("\nBig shots sorted by bounty: ");
        sortByBounty.forEach(p -> System.out.println(p.name + " - " + p.bounty));
        

        //C2. Group by role
        Map<String, List<Pirate>> byRole = strawHat.stream().collect(Collectors.groupingBy(p -> p.role));

        //}

        //C3. Method Reference
        strawHat.stream().map(p -> p.name).forEach(System.out::println);

        //C4
        List<String> names = strawHat.stream().map(p -> p.name).toList();

        //C5
        int sum = 0;
        Iterator<Pirate> addi = strawHat.iterator();
        while(addi.hasNext()) {
            sum+= addi.next().bounty;
        }
        System.out.println("\n " + sum);

        //C6.
        boolean overB = strawHat.stream().anyMatch(pirate -> pirate.bounty > 200);
        System.out.println("\n " + overB);
    }
    
}
