package org.Reynard_de_Bosnie.tasque24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/*Connection connection = tasque24.DatabaseConnection.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");
preparedStatement.execute();
ResultSet resultSet = preparedStatement.getResultSet();
while (resultSet.next()) {
    System.out.println(resultSet.getString("name"));
}
preparedStatement.close();*/

public class UserDAOImpl implements UserDAO {

    private final Connection connection;

    public UserDAOImpl() {
        try {
            this.connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(User user) throws SQLException {
        String query = "INSERT INTO users (name, email) " +
                "VALUES (\'" + user.getName() + "\', \'"+ user.getEmail() + "\')";
        System.out.println(query);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.execute();
        preparedStatement.close();
    }
    @Override
    public User findById(int id) throws SQLException {
        PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM users");
        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getResultSet();
        String name;
        String email;
        for (int i = 0; i < id; i++) {
            resultSet.next();
        }
        name = resultSet.getString("name");
        email = resultSet.getString("email");
        resultSet.close();
        preparedStatement.close();
        return new User(id, name, email);
    }
    @Override
    public List<User> findAll() throws SQLException {
        PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM users");
        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getResultSet();
        int id = 0;
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") +
                    ": " + resultSet.getString("name") + ", "
                    + resultSet.getString("email"));
            users.add(new User(id, resultSet.getString("name"), resultSet.getString("email")));
            id++;
        }
        resultSet.close();
        preparedStatement.close();
        return users;
    }
    @Override
    public void update(User user) throws SQLException {
        String query = "UPDATE users SET name = \'" + user.getName() + "\', " +
                "email = \'" + user.getEmail() +
                "\' WHERE id = " + user.getId();
        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.execute();
        System.out.println("User updated!");
        preparedStatement.close();
    }
    @Override
    public void delete(int id) throws SQLException {
        PreparedStatement preparedStatement;
        try {
            preparedStatement = this.connection.prepareStatement("DELETE FROM users WHERE id = ?");
            preparedStatement.setInt(1, id);
            int i = preparedStatement.executeUpdate();
            if (i == 0) {
                throw new NullPointerException();
            }
            System.out.println("User deleted!");
            preparedStatement.close();
        }
        catch (NullPointerException e) {
            System.out.println("Invalid index!");
        }
    }
    @Override
    public boolean emailExists(String email) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");
        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getResultSet();
        while (resultSet.next()) {
            if (resultSet.getString("email").equals(email)) {
                return true;
            }
        }
        resultSet.close();
        preparedStatement.close();
        return false;
    }
}
