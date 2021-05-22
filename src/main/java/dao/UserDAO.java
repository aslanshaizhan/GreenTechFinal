package dao;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public User login(String email, String password) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE email = ? and password = ?");
        statement.setString(1, email);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();

        User user = null;

        if (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setEmail(resultSet.getString("email"));
            user.setRole(resultSet.getString("role"));
            user.setPassword(resultSet.getString("password"));
        }

        resultSet.close();
        statement.close();
        connection.close();

        return user;
    }

    public User getById(int id) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getConnection();
        User user = new User();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        resultSet.next();

        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setRole(resultSet.getString("role"));

        resultSet.close();
        statement.close();
        connection.close();

        return user;
    }

    public int register(User user) throws SQLException, ClassNotFoundException {
        int res = 0;
        Connection connection = DBConnection.getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name,email,role,password) values(?,?,?,?)");

        statement.setString(1, user.getName());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getRole());
        statement.setString(4, user.getPassword());

        res = statement.executeUpdate();

        statement.close();
        connection.close();

        return res;
    }

    public List<User> findAll() throws SQLException,ClassNotFoundException{
        List<User> users = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String role = resultSet.getString("role");
            String password = resultSet.getString("password");
            User user = new User(id,name,email,role,password);
            users.add(user);
        }
        return users;
    }

    public boolean update(User user) throws SQLException,ClassNotFoundException{
        boolean updated = false;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, email = ?, role = ?, password = ? WHERE id = ?");
        statement.setString(1,user.getName());
        statement.setString(2,user.getEmail());
        statement.setString(3, user.getRole());
        statement.setString(4, user.getPassword());
        statement.setInt(5,user.getId());
        updated = statement.executeUpdate() > 0;

        return updated;
    }

    public boolean delete(User user) throws SQLException,ClassNotFoundException{
        boolean deleted = false;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
        statement.setInt(1,user.getId());
        deleted = statement.executeUpdate() > 0;
        return deleted;
    }


}
