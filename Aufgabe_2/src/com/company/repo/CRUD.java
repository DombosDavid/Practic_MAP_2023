package com.company.repo;

public interface CRUD<E>
{
    E findOne(int id);
    Iterable<E> findAll();
    //save returns entity if exists
    //returns null if added to the list
    E save(E entity);
    E delete(int id);
    E update(E entity);
}
