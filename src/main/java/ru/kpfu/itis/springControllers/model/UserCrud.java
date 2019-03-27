package ru.kpfu.itis.springControllers.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Objects;

public class UserCrud implements Serializable {


    private final String PATTERN = "^(?:[a-zA-Z0-9_'^&/+-])+(?:\\.(?:[a-zA-Z0-9_'^&/+-])+)" +
            "*@(?:(?:\\[?(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))\\.)" +
            "{3}(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\]?)|(?:[a-zA-Z0-9-]+\\.)" +
            "+(?:[a-zA-Z]){2,}\\.?)$";

    public UserCrud(@NotNull(message = "Введите email") @Pattern(regexp = PATTERN ,
            message = "Введите корректный email") String email) {
        this.email = email;
    }

    @NotNull(message = "Введите email")
    @Pattern(regexp = PATTERN,
            message = "Введите корректный email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserCrud{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserCrud)) return false;
        UserCrud userCrud = (UserCrud) o;
        return Objects.equals(email, userCrud.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
