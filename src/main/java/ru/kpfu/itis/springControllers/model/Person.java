package ru.kpfu.itis.springControllers.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Person implements Serializable {

    private String name;
    private List<Episode> episodes;

    public Person(String name, List<Episode> episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(episodes, person.episodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, episodes);
    }
}
