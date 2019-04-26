package ru.kpfu.itis.springControllers.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Введите имя")
    @Size(min = 2, max = 40, message = "Заголовок должен быть не менее 2 символов")
    private String title;

    @NotNull(message = "Введите текст")
    private String text;

    @NotNull
    private String username;

    public Article(){}

    public Article(@NotNull(message = "Введите имя") @Size(min = 2, max = 40, message = "Заголовок должен быть не менее 2 символов") String title, @NotNull(message = "Введите текст") String text, @NotNull String username) {
        this.title = title;
        this.text = text;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Objects.equals(id, article.id) &&
                Objects.equals(title, article.title) &&
                Objects.equals(text, article.text) &&
                Objects.equals(username, article.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, username);
    }
}
