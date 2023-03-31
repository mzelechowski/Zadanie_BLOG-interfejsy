package akademia.zadania.zadanie1b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Post post1 = new Post();
        post1.setTitle("Programowanie jest kozackie");
        post1.setAuthor("Zbyszek ze Spychowa");
        Tag tag1 = new Tag();
        Tag tag2= new Tag();
        tag1.setTitle("zostań w domu");
        tag2.setTitle("gotuj pierogi");
        List<Tag> tags = new ArrayList<>();
        tags.add(tag1);
        tags.add(tag2);
        post1.setTags(tags);
        System.out.println(post1);

        Post post2 = new Post("Programuje w Java"
                , "Zelek"
                ,""
                , Arrays.asList(
                        new Tag("wczoraj")
                        ,new Tag("dzisiaj")));
        System.out.println(post2);

        Post post3 = new Post("C++", "Ania",""
                ,"szminka","pomatka","szmatka");
        System.out.println(post3);
    }
    private static String add(int ... a) {
        int suma = 0;
        for (int s : a) {
            suma += s;
        }
        return String.valueOf(suma);
    }
}
