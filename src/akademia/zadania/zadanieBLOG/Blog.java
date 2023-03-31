package akademia.zadania.zadanieBLOG;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog implements BlogAction {
    private List<User> users;
    private List<Post> posts;

    public Blog() {
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public Blog(List<User> users, List<Post> posts) {
        this.users = users;
        this.posts = posts;
    }

    @Override
    public void publishPost(int userId, String content) {
        User user = findUser(userId);
        if (user == null) {
            System.out.println("Cannot publish post, user no found");
            return;
        } else {
            System.out.println(user.getNickname() + " posted just now: " + content);
            posts.add(new Post(new Date(), user, content));
        }
    }

    @Override
    public void commentPost(int userId, int postId, String content) {
        User user = findUser(userId);
        Post post = findPost(userId);
        if (user == null) {
            System.out.println("Cannot publish comment, user no found");
            return;
        }
        if (post == null) {
            System.out.println("Cannot publish comment, post no found");
            return;
        }
        System.out.println(user.getNickname() + " commented " + post.getAuthor().getNickname() + "'s post: " + content);
        post.getComments().add(new Comment(new Date(), user, content));
    }

    @Override
    public Post findPost(int postId) {
//        for (Post p : posts) {
//            if (p.getId() == postId)
//            return p;
//        }
//        return null;
        return posts.stream().filter(p->p.getId()==postId).findFirst().orElse(null);
    }

    @Override
    public User findUser(int userId) {
        for (User u : users) {
            if (u.getId() == userId)
            return u;
        }
        return null;
    }

    @Override
    public void displayUserEntries(int userId) {
        User user = findUser(userId);
        if (user == null) {
            System.out.println("Cannot display entries, user no found");
            return;
        }
        System.out.println(user.getNickname() + "'s " + " entries: ");
        for (Post p : posts) {
            if (p.getAuthor().getId() == userId) {
                System.out.println("(POST) " + p.getContent());
            }
            for (Comment c : p.getComments()) {
                if (c.getAuthor().getId() == userId)
                    System.out.println("(COMMENT)" + c.getContent());
            }
        }
    }

    public void addUsers(User user) {
        this.users.add(user);
    }

    public void addPosts(Post post) {
        this.posts.add(post);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
