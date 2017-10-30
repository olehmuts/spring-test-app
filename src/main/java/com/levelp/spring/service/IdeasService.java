package com.levelp.spring.service;

import com.levelp.spring.model.Idea;

import java.util.List;

public interface IdeasService {
    int add(Idea idea);

    int update(Idea idea);

    int delete(int id);

    Idea get(int id);

    List<Idea> list();
}
