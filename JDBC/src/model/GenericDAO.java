
package model;

import java.util.List;

public interface GenericDAO<T> {
    void guardar(T e);
    List<T> findAll();
}
