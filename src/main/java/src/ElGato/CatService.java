package src.ElGato;

import java.util.List;
import java.util.Optional;

public class CatService {

    public static void printHowManyCats(List<Cat> cats) {
        int countOfCats = 0;
        for (Cat cat : cats) {
            if (cat.getStatus()) {
                countOfCats++;
            }
        }
        System.out.println("You've got " + countOfCats + " cats");

    }

    public static void printWeightOfCats(List<Cat> cats) {
        for (Cat cat : cats) {
            System.out.print(cat.getWeight() + " ");
        }
        System.out.println();
    }

    public static void feedCat(List<Cat> cats, String name, double catFood) {
        int count = 0;
        for (Cat cat : cats) {
            if (name.equals(cat.getName())) {
                cat.setWeight(cat.getWeight() + catFood);
                System.out.println("Weight of " + cat.getName() + " now is: " + cat.getWeight());
                if (cat.getWeight() > 7000) {
                    cat.setStatus(false);
                    System.out.println("The " + cat.getName() + " exploded!!!");
                }
            } else {
                count++;
                if (count == cats.size()) {
                    System.out.println("There's no cat with this name!");
                }
            }
        }
    }

    public static void meowCat(List<Cat> cats, String name) {
        int count = 0;
        for (Cat cat : cats) {
            if (name.equals(cat.getName())) {
                while (cat.getStatus()) {
                    cat.setHappy(cat.getHappy() + 1);
                    if (cat.getHappy() < 13) {
                        System.out.println(cat.getName() + ": 'meow'");
                    } else {
                        cat.setStatus(false);
                        System.out.println(cat.getName() + " is Dead!");
                    }
                }
            } else {
                count++;
                if (count == cats.size()) {
                    System.out.println("There's no cat with this name!");
                }
            }
        }
    }

    private static Optional<Cat> findCat(List<Cat> cats, String name) {
        for (Cat cat : cats) {
            if (name.equals(cat.getName())) {
                return Optional.of(cat);
            }
        }
        return Optional.empty();
    }

    public static void poopCat(List<Cat> cats, String name) {
        Optional<Cat> foundCat = CatService.findCat(cats, name);
        if (foundCat.isPresent()) {
            Cat cat = foundCat.get();
            cat.setWeight(cat.getWeight() - 150);
            System.out.println(cat.getName() + " pooped");
        } else {
            System.out.println("There's no cat with this name!");
        }
    }
}


