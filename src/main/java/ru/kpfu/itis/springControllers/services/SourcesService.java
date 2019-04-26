package ru.kpfu.itis.springControllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.springControllers.repository.SourceRepo;
import ru.kpfu.itis.springControllers.model.Source;

import java.util.List;

@ComponentScan("ru.kpfu.itis.springControllers.repository")
@ComponentScan("ru.kpfu.itis.springControllers.model")
@Service
public class SourcesService {

    @Autowired
    private SourceRepo sourceRepo;

    public void save(List<Source> list){
        for(Source source : list) {
            sourceRepo.save(source);
        }
    }

    public List<Source> get(){
        return sourceRepo.findAll();
    }

    public void delete(Source source){
        sourceRepo.delete(source);
    }
}