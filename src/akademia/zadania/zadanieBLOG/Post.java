package akademia.zadania.zadanieBLOG;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post extends Entry{
    private List<Comment> comments;

    public Post(Date postedDate, User author, String content) {
        super(postedDate, author, content);
        this.comments=new ArrayList<>();
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "comments=" + comments +
                "} " + super.toString();
    }
}
