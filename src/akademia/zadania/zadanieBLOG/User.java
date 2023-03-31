package akademia.zadania.zadanieBLOG;

public class User {
    private static int COUNTER_ID=0;

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String nickname;

    public User(String firstName, String lastName, String nickname) {
        this.id = ++COUNTER_ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
