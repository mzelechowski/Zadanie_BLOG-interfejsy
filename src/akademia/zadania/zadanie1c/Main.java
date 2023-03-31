package akademia.zadania.zadanie1c;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        Post.Tag tag1 = new Post().new Tag();
        Post.Tag tag2 = post.new Tag();

        //tworzenie obiektu tag3 przez metodę w klasie Post zwaracjąca konstruktor klasy wewenrzenej Tag
        Post.Tag tag3 = post.getTagInstance();

        Post post1 = new Post("Java jest super", "Maciek"
                , "Programowanie obiekotowe", "Dziedziczneie", "Polimorfizm", "Enkapsulacja");
        System.out.println(post1);

        System.out.println(new Post("Nauka C++",
                "Ania",
                Arrays.asList(
                        new Post().new Tag("zostan w domu"),
                        new Post().new Tag("gotuj pierogi")
                )));

        System.out.println(new Post("Nauka C++",
                "Ania",
                Arrays.asList(
                        new Post().getTagInstance("zostan w domu"),
                        new Post().getTagInstance("gotuj pierogi")
                )));

        System.out.println(new Post("Nauka C++",
                "Ania",
                new Post().getTagInstance("zostan w domu"),
                new Post().getTagInstance("gotuj pierogi")
        ));
        System.out.println(new Post("Nauka C++",
                "Ania",
                "zostan w domu", "gotuj pierogi"
        ));

    }
}
