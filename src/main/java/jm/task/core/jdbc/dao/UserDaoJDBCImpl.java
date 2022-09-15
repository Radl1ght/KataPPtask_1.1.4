package jm.task.core.jdbc.dao;
import jm.task.core.jdbc.model.User;
//import jm.task.core.jdbc.util.Util;
//import java.sql.*;
//import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
//    private final Connection connection = Util.getConnection();


    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            connection.setAutoCommit(false);
//            try {
//                statement.executeUpdate(
//                        """
//                                CREATE TABLE IF NOT EXISTS `user`.`users` (
//                                  `id` INT NOT NULL AUTO_INCREMENT,
//                                  `name` VARCHAR(45) NOT NULL,
//                                  `lastName` VARCHAR(45) NULL,
//                                  `age` INT(3) NULL,
//                                  PRIMARY KEY (`id`))
//                                ENGINE = InnoDB
//                                DEFAULT CHARACTER SET = utf8;"""
//                );
//                connection.commit();
//            } catch (SQLException e) {
//                connection.rollback();
//                throw new RuntimeException(e);
//            } finally {
//                connection.setAutoCommit(true);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Ошибка при создании таблицы");
//        }
    }

    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            connection.setAutoCommit(false);
//            try {
//                statement.executeUpdate("DROP TABLE IF EXISTS `user`.`users`;");
//                connection.commit();
//            } catch (SQLException e) {
//                connection.rollback();
//                throw new RuntimeException(e);
//            } finally {
//                connection.setAutoCommit(true);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Ошибка при удалении таблицы");
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        try {
//            connection.setAutoCommit(false);
//            try {
//                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user.users(name, lastname, age) VALUES (?, ?, ?)");
//                preparedStatement.setString(1, name);
//                preparedStatement.setString(2, lastName);
//                preparedStatement.setByte(3, age);
//                preparedStatement.executeUpdate();
//                connection.commit();
//
//            } catch (SQLException e) {
//                connection.rollback();
//                throw new RuntimeException(e);
//            } finally {
//                connection.setAutoCommit(true);
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка при сохранении пользователя");
//        }
    }

    public void removeUserById(long id) {
//        try {
//            connection.setAutoCommit(false);
//            try {
//                PreparedStatement preparedStatement = connection.prepareStatement("delete from user.users where id = ?");
//                preparedStatement.setLong(1, id);
//                preparedStatement.executeUpdate();
//                connection.commit();
//
//            } catch (SQLException e) {
//                connection.rollback();
//                throw new RuntimeException(e);
//            } finally {
//                connection.setAutoCommit(true);
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка при удалении по id");
//        }
    }

    public List<User> getAllUsers() {
//        List<User> userList = new ArrayList<>();
//        try (Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from `user`.`users`;");
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка при удалении по id");
//        }
//        return userList;
        return null;
    }

    public void cleanUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            connection.setAutoCommit(false);
//            try {
//                statement.executeUpdate("TRUNCATE TABLE `user`.`users`;");
//                connection.commit();
//
//            } catch (SQLException e) {
//                connection.rollback();
//                throw new RuntimeException(e);
//            } finally {
//                connection.setAutoCommit(true);
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка при очистке таблицы");
//        }
    }
}
