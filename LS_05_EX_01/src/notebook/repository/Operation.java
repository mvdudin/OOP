package notebook.repository;

import java.util.List;

public interface Operation<V> {
    List<V> read();

    void write(List<V> data);
}