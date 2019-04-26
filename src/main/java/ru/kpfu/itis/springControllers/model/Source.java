//package ru.kpfu.itis.springControllers.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.util.Objects;
//
//@Entity
//@Table(name = "source")
//public class Source {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private Long id;
//
//    @NotNull(message = "Введите имя")
//    @Size(min = 2, max = 40, message = "Заголовок должен быть не менее 2 символов")
//    private String name;
//
//    @NotNull(message = "Введите текст")
//    private String description;
//
//    @NotNull
//    private String link;
//
//    public Source(@NotNull(message = "Введите имя") @Size(min = 2, max = 40, message = "Заголовок должен быть не менее 2 символов") String name, @NotNull(message = "Введите текст") String description, @NotNull String link) {
//        this.name = name;
//        this.description = description;
//        this.link = link;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Source)) return false;
//        Source source = (Source) o;
//        return Objects.equals(id, source.id) &&
//                Objects.equals(name, source.name) &&
//                Objects.equals(description, source.description) &&
//                Objects.equals(link, source.link);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, description, link);
//    }
//}
