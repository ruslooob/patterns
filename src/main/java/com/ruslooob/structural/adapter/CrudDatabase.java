package com.ruslooob.structural.adapter;

public interface CrudDatabase<T, ID> {
    T getById(Long ID);
    T save(T entity);
    boolean update(T entity);
    boolean delete(ID id);
}
