public class Superheroroster {

    public static void main(String[] args) {

        // hero names, abilities, and power levels
        String[] heroNames = {"Spider-Man", "Iron Man", "Blade", "The Hulk", "Silver Surfer"};
        String[] abilities = {"Web Slinger", "Pulse Cannon", "Vampire Barber", "He gets mad sometimes", "Silver Surfboard"};
        int[] powerLevels = {66, 70, 74, 110, 9001};

        // printing using a loop
        System.out.println("Superhero Roster:");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
        }

        // call the searchHero
        System.out.println("\nSearch Result:");
        searchHero(heroNames, abilities, powerLevels, "Thor");

        // calculate and display power level
        double average = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + average);

        // creating an array of the superhero objects
        Superhero[] heroes = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++) {
            heroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        }

        // display heroes
        System.out.println("\nDisplaying Superhero Objects:");
        for (Superhero hero : heroes) {
            hero.displayHero();
        }

        // sorting by descending power level
        System.out.println("\nSorted Heroes by Power Level (Descending):");
        sortAndDisplayByPower(heroes);
    }

    // method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found");
        }
    }

    // method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }

    // method: sort and display by power level
    public static void sortAndDisplayByPower(Superhero[] heroes) {
        for (int i = 0; i < heroes.length - 1; i++) {
            for (int j = i + 1; j < heroes.length; j++) {
                if (heroes[j].getPowerLevel() > heroes[i].getPowerLevel()) {
                    Superhero temp = heroes[i];
                    heroes[i] = heroes[j];
                    heroes[j] = temp;
                }
            }
        }
        for (Superhero hero : heroes) {
            hero.displayHero();
        }
    }
}

// Superhero class
class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    // constructor
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    // getter
    public int getPowerLevel() {
        return powerLevel;
    }

    // method: displayHero
    public void displayHero() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("-------------------------");
    }
}