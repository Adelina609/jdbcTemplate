package ru.kpfu.itis.springControllers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.Article;

@Repository
public interface ArticleRepo extends CrudRepository<Article, Long> {
}
