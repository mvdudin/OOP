package notebook.repository.impl;

import java.io.*;
import java.util.List;
import notebook.model.User;
import java.util.ArrayList;
import notebook.repository.GBRepository;

public class FileRepository implements GBRepository<User, Long> {
    private final String fileName;
    public FileRepository(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
     @Override
     public void saveAll(List<String> data) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : data) {
                writer.write(line.concat('\n'));
            }
            writer.flush();
        }
        catch (IOException e) {
                System.out.println(e.getMessage());
        }
     }
}

