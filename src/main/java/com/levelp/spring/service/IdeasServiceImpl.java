package com.levelp.spring.service;

import com.levelp.spring.dao.IdeasDAO;
import com.levelp.spring.model.Idea;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IdeasServiceImpl implements IdeasService {
    @Autowired
    IdeasDAO dao;

    @Override
    public int add(Idea idea) {
        return dao.add(idea);
    }

    @Override
    public int update(Idea idea) {
        return dao.update(idea);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public Idea get(int id) {
        return dao.get(id);
    }

    @Override
    public List<Idea> list() {
        return dao.list();
    }
}
