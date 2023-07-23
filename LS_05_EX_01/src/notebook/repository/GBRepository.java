package notebook.repository;

import java.util.List;
import java.util.Optional;

public interface GBRepository<E> {
    E add(E e);
    E get(E e);
    E update(E e);
    E remove(E e);
    List<E> list();
    void saveAll();
}
