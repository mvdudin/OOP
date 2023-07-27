package notebook.repository;

import java.util.List;

public interface GBRepository<E> {
    E add(E e);
    E get(E e);
    E update(E e);
    E remove(E e);
    List<E> list();
    List<String> read();
    void saveAll();
    void write(List<String> data);
}
