package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Walter", "White", (byte) 50);
        userService.saveUser("Dolores", "Abernathy", (byte) 25);
        userService.saveUser("Peter", "Dinklage", (byte) 45);
        userService.saveUser("Elvis", "Presley ", (byte) 87);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
