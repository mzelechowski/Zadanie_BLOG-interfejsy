package akademia.zadania.zadanie1c;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String author;
    private List<Tag> tags;

    public Tag getTagInstance(){
        return new Tag();
    }
    public Tag getTagInstance(String title){
        return new Tag(title);
    }

    public Post() {
    }

    public Post(String title, String author, Tag ... tags){
        this.title=title;
        this.author=author;
        List<Tag> tags1=new ArrayList<>();
        for(Tag t:tags){
            tags1.add(t);
        }
        this.tags=tags1;
    }

    public Post(String title, String author, String ... tags){
        this.title=title;
        this.author=author;
        List<Tag> tags1=new ArrayList<>();
        for(String s:tags){
            tags1.add(getTagInstance(s));
        }
        this.tags=tags1;
    }
    public Post(String title, String author, List<Tag> tags){
        this.title=title;
        this.author=author;
        this.tags=tags;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + tags +
                '}';
    }

    public class Tag{
        private String title;

        public Tag() {
        }

        public Tag(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Tag{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }

}
