package akademia.zadania.zadanieBLOG;

public interface BlogAction {

    void publishPost(int userId, String content);

    void commentPost(int userId, int postId, String content);

    Post findPost(int postId);

    User findUser(int userId);

    void displayUserEntries(int userId);
}
