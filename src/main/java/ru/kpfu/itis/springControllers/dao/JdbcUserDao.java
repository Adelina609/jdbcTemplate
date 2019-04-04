package ru.kpfu.itis.springControllers.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.User;

import javax.sql.DataSource;
import java.sql.ResultSet;

@Repository
@Primary
public class JdbcUserDao implements UserDao {

  private JdbcTemplate jdbcTemplate;

  @Autowired
  @Qualifier("dataSource")
  public void setDataSource(DataSource dataSource) {
    jdbcTemplate = new JdbcTemplate(dataSource);
  }

  private String c = "C:\\Users\\user\\Desktop\\Extension for Chrome\\right.PNG";
    public User getUser(String email) {
        return jdbcTemplate.queryForObject(
                "select * from \"user\" where email = ?",
                new Object[]{email},
                (ResultSet rs, int rowNum) ->
                        new User(rs.getString("username"), rs.getString("password"),
                        rs.getString("email"))
        );
    }

    public int createUser(User user){
      return jdbcTemplate.update("INSERT INTO \"user\" (email, password, username) VALUES (?, ?, ?)",
              user.getEmail(), user.getPassword(), user.getName());
    }

    public int updateUser(User user){
        return jdbcTemplate.update("UPDATE \"user\" SET username=?, password=? WHERE email=?",
                new Object[]{user.getName(), user.getPassword(), user.getEmail()} );
    }

    public int deleteUser(User user){
      return jdbcTemplate.update("DELETE FROM \"user\" WHERE email = ?", user.getEmail());
    }
}
