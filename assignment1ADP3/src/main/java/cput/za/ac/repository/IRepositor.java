package cput.za.ac.repository;

/*IRepository.java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
public interface IRepositor<T,ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
