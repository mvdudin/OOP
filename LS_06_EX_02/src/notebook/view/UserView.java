package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        User user;
        Commands com;

        while (true) {
            String command = prompt("Input command: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) break;
            switch (com) {
                case CREATE:
                    user = new User(prompt("Name: "), prompt("Last name: "), prompt("Phone: "));
                    userController.save(user);
                    System.out.println("New user Id ".concat(user.getId().toString()));
                    break;
                case READ:
                    try {
                        System.out.println(userController.read(Long.parseLong(prompt("User Id: "))));
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    try {
                        user = userController.read(Long.parseLong(prompt("User Id: ")));
                        user.setFirstName(prompt("Name: "));
                        user.setLastName(prompt("Last name: "));
                        user.setPhone(prompt("Phone: "));
                        userController.update(user);
                        System.out.println();
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case DELETE:
                    try {
                    user = new User(Long.parseLong(prompt("User Id: ")));
                    user = userController.delete(user);
                    System.out.println("Delete ".concat(user.getLastName()));
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        System.out.println(userController.readAll());
                        System.out.println();
                    } 
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }

        }
        userController.saveAll();
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
