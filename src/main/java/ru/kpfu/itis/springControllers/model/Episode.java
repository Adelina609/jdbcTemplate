package ru.kpfu.itis.springControllers.model;

import java.io.Serializable;
import java.util.Objects;

public class Episode implements Serializable {

    private String name;
    private String description;

    public Episode(){}
    public Episode(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Episode)) return false;
        Episode episode = (Episode) o;
        return Objects.equals(name, episode.name) &&
                Objects.equals(description, episode.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
