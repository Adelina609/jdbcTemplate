package ru.kpfu.itis.springControllers.dao;

import org.springframework.data.repository.CrudRepository;
import ru.kpfu.itis.springControllers.model.Source;

import java.util.List;

public interface SourceRepo extends CrudRepository<Source, Long> {

    List<Source> findAll();
}
