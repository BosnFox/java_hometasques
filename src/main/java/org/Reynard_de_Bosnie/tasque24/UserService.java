package org.Reynard_de_Bosnie.tasque24;

import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserService {
    private final UserDAOImpl userDAO;

    public UserService(UserDAOImpl userDAO)
    {
        this.userDAO = userDAO;
    }

    public void registerUser(String name, String email) throws SQLException {
        // TODO perezapichatj w userdaoimpl
        int isPossible = 1;
        if (this.userDAO.emailExists(email)) {
            isPossible = 0;
            System.out.println("User w/ either same mail already exists");
        }
        switch (isPossible) {
            case 1:
                this.userDAO.create(new User(1, name, email));
                System.out.println("User created!");
                break;
            case 0:
                System.out.println("User not created!");
        }
    }
    public void listAllUsers() throws SQLException, NamingException {
        this.userDAO.findAll();
    }
    public void deleteUser(int id) throws SQLException {
        this.userDAO.delete(id);
    }
    public void updateUser(String id, String newName, String newEmail) throws SQLException {
        int isPossible = 1;
        if (this.userDAO.emailExists(newEmail)) {
            isPossible = 0;
            System.out.println("User w/ either same mail already exists");
        }
        if (isPossible == 1) {
            this.userDAO.update(new User(Integer.parseInt(id), newName, newEmail));
            /*PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();
            System.out.println("User updated!");
            preparedStatement.close();*/
        }
    }
}
