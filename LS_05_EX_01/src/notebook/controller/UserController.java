package notebook.controller;

import notebook.model.User;
import notebook.repository.GBRepository;

import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository<User> repository;

    public UserController(GBRepository<User> repository) {
        this.repository = repository;
    }

    public void save(User user) {
        repository.add(user);
    }

    public void saveAll() {
        repository.saveAll();
    }
    public User read(Long userId) throws Exception {
        User user = repository.get(new User(userId));
        if (user != null )
            return user;
        else
            throw new RuntimeException("User not found");
    }
    public User update(User user){
        return repository.update(user);
    }
    public User delete(User user){
        return repository.remove(user);
    }

    public List<User> readAll(){
        return repository.list();
    }
    
}
