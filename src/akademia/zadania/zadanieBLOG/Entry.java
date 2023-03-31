package akademia.zadania.zadanieBLOG;

import java.util.Date;

public abstract class Entry {

    private static int COUNTER_ID=0;
    private final int id;
    private final Date postedDate;
    private final User author;
    private final String content;

    public Entry( Date postedDate, User author, String content) {
        this.id = ++COUNTER_ID;
        this.postedDate = postedDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", postedDate=" + postedDate +
                ", author=" + author +
                ", content='" + content + '\'' +
                '}';
    }
}
