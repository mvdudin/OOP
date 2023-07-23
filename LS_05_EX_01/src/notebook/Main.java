package notebook;

import notebook.model.User;
import notebook.view.UserView;
import notebook.mapper.impl.UserMapper;
import notebook.repository.GBRepository;
import notebook.controller.UserController;
import notebook.repository.impl.FileOperation;
import notebook.repository.impl.UserRepository;
import static notebook.util.DBConnector.DB_PATH;
import static notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository<User> repository = new UserRepository(new FileOperation(DB_PATH), new UserMapper());
        UserView view = new UserView(new UserController(repository));
        view.run();
    }
}
