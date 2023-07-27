package notebook.repository.impl;

import java.io.*;
import java.util.*;

import notebook.model.User;
import notebook.mapper.impl.UserMapper;
import notebook.repository.GBRepository;

public class UserRepository implements GBRepository<User> {
    private Long id = 0L;
    private String fileName;
    private Map<Long, User> dataSet;
    private final UserMapper mapper;
    //private final FileOperation storage;


    public UserRepository(String fileName) {
        User user;
        this.fileName = fileName;
        dataSet = new HashMap<>();
        mapper = new UserMapper();

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        List<String> lines = read();
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
      write(lines);
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
    @Override
    public List<String> read() {
        List<String> data = new ArrayList<>();
        try {
            FileReader fr = new FileReader(new File(fileName));
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                data.add(line);
                line = reader.readLine();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    @Override
    public void write(List<String> data) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : data) {
                writer.write(line.concat("\n"));
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
