package com.levelp.spring.dao;

import com.levelp.spring.model.Idea;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

public class IdeasDAOImpl implements IdeasDAO {

    @Autowired
    SessionFactory factory;

    @Transactional
    @Override
    public int add(Idea idea) {
        Session session = factory.openSession();
        Serializable identifier = session.save(idea);
        session.close();
        return (Integer) identifier;
    }

    @Transactional
    @Override
    public int update(Idea idea) {
        Session session = factory.openSession();
        session.update(idea);
        Serializable identifier = session.getIdentifier(idea);
        session.close();
        return (Integer) identifier;
    }

    @Transactional
    @Override
    public int delete(int id) {
        Session session = factory.openSession();
        Idea idea = (Idea) session.load(Idea.class, id);
        session.delete(idea);
        Serializable identifier = session.getIdentifier(idea);
        session.close();
        return (Integer) identifier;
    }

    @Override
    public Idea get(int id) {
        Session session = factory.openSession();
        Idea idea = (Idea) session.load(Idea.class, id);
        session.close();
        return idea;
    }

    @Override
    public List<Idea> list() {
        Session session = factory.openSession();
        @SuppressWarnings("uncheked")
        List<Idea> list = session.createQuery("from Idea").list();
        session.close();
        return list;
    }
}
