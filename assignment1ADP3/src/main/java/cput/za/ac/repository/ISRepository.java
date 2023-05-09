package cput.za.ac.repository;

/*ISRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
public interface ISRepository <T ,ID>{
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
