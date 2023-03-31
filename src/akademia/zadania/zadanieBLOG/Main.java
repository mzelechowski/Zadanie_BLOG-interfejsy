package akademia.zadania.zadanieBLOG;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.addUsers(new User("Jan", "Kowalski",  "janek003"));
        blog.addUsers(new User("Katarzyna", "Kowalska",  "kasiulekSłit"));
        blog.addUsers(new User("Miachl", "Zajac",  "zajaczek01"));
        blog.getUsers().forEach(System.out::println);
        blog.publishPost(1, "uwielbiam Jave, bo da sie zrobic fajna apke");
        blog.publishPost(2, "Mylilem sie, Java jest do bani, wole C++");

        System.out.println("");

        blog.commentPost(1,2,"Mówiłem ci, że C++ lepszy!");
        blog.commentPost(1,2,"Dzięki, tak też myślę.");
        blog.commentPost(4,2,"Ale lipa");
        System.out.println("");
        blog.displayUserEntries(1);

    }
}
