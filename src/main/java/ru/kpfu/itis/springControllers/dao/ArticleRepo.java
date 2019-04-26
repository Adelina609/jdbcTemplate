package ru.kpfu.itis.springControllers.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.springControllers.model.Article;

@Repository
public interface ArticleRepo extends CrudRepository<Article, Long> {
}
