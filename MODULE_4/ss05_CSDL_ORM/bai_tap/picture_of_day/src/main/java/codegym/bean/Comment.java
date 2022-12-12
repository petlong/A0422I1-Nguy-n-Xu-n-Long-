package codegym.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author;
    private String feedback;
    private int liker;

    public Comment() {
    }

    public Comment(int id, String author, String feedback, int liker) {
        this.id = id;
        this.author = author;
        this.feedback = feedback;
        this.liker = liker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getLiker() {
        return liker;
    }

    public void setLiker(int like) {
        this.liker = like;
    }
}
