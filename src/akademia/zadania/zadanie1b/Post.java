package akademia.zadania.zadanie1b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Post {
    private String title;
    private String author;
    private String content;
    private List<Tag> tags;

    public Post() {
    }

    public Post(String title, String author, String content, String ... strings) {
        this.title = title;
        this.author = author;
        this.content = content;
        List<Tag> tagi = new ArrayList<>();
        for(String s:strings){
            tagi.add(new Tag(s));
        }
        this.tags = tagi;
        //this.tags=Arrays.asList(strings).stream().map(Tag::new).collect(Collectors.toList());
        this.tags= Arrays.stream(strings).map(Tag::new).collect(Collectors.toList());
    }

    public Post(String title, String author, String content, Tag ... tags) {
        this.title = title;
        this.author = author;
        this.content = content;
        List<Tag> tagi = new ArrayList<>();
        for(Tag t:tags){
            tagi.add(t);
        }
        this.tags = tagi;
        //this.tags=Arrays.asList(tags);
    }

    public Post(String title, String author, String content, List<Tag> tags) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Post{" +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                '}';
    }
}
