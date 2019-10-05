package coderslab;

import java.util.ArrayList;

public class Quote {
    private String autor;
    private String content;
    public static ArrayList<Quote> quotes = new ArrayList<>();

    public Quote(String autor, String content) {
        this.autor = autor;
        this.content = content;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "autor='" + autor + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
