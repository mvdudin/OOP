package notebook.repository.impl;

import java.util.*;

import notebook.model.User;
import notebook.mapper.impl.UserMapper;
import notebook.repository.GBRepository;

public class UserRepository implements GBRepository<User> {
    private Long id = 0L;
    private Map<Long, User> dataSet;
    private final UserMapper mapper;
    private final FileOperation storage;


    public UserRepository(FileOperation storage, UserMapper mapper) {
        User user;
        this.mapper = mapper;
        this.storage = storage;
        dataSet = new HashMap<>();
        List<String> lines = storage.read();
        for (String line : lines) {
            user = mapper.toOutput(line);
            if (id < user.getId()) id = user.getId();
            dataSet.put(user.getId(), user);
        }
    }
    public void saveAll(){
        List<String> lines = new ArrayList<>();
        for (User user:dataSet.values()) {
            lines.add(mapper.toInput(user));
        }
      storage.write(lines);
    }

    @Override
    public List<User> list() {
        return new ArrayList<User>(dataSet.values());
    }
    @Override
    public User add(User user) {
        user.setId(++id);
        dataSet.put(user.getId(), user);
        return user;
    }
    @Override
    public User get(User user) {
        return dataSet.get(user.getId());
    }

    @Override
    public User update(User user) {
        if (dataSet.containsKey(user.getId())) {
            dataSet.remove(user.getId());
            dataSet.put(user.getId(), user);
            return user;
        }
        else {
            return null;
        }
    }
    @Override
    public User remove(User user) {
        if (dataSet.containsKey(user.getId())) {
            return dataSet.remove(user.getId());
        }
        return null;
    }


}
