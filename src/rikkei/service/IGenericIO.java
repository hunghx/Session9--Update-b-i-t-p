package rikkei.service;

import java.util.List;
import java.util.Scanner;

public interface IGenericIO<E,T> {
    List<E> getAll();
    E findById(T t);
    boolean save(E e);
    boolean delete(T t);
}
