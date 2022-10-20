package NewoneInJava.src.ElGato;

import java.util.ArrayList;
import java.util.List;


public class Practice {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        Cat cat1 = new Cat("Mickey", Color.BLACK, 4240, true, 5);
        Cat cat2 = new Cat("Cookie", Color.BROWN, 5850, true, 6);
        Cat cat3 = new Cat("Red", Color.RED, 3790, true, 3);
        Cat cat4 = new Cat("Suzy", Color.WHITE, 4320, true, 8);
        Cat cat5 = new Cat("Santa", Color.SPOTTED, 4930, true, 7);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        CatService.printHowManyCats(cats);
        CatService.printWeightOfCats(cats);
        CatService.feedCat(cats, "Franky", 150);
        CatService.feedCat(cats, "Cookie", 1500);
        CatService.meowCat(cats, "Santa");
        CatService.poopCat(cats, "Red");
        CatService.printHowManyCats(cats);
        System.out.println(cat1);

    }




}

