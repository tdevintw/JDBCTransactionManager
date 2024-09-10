package dev.yassiraitelghari.repositories;

import dev.yassiraitelghari.config.Database;
import dev.yassiraitelghari.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    public boolean add(User user){
        String query = "INSERT INTO users (name , age , salary , department) VALUES(?,?,?,?)";
        try{
            Connection connection = Database.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setInt(2 , user.getAge());
            preparedStatement.setFloat(3,user.getSalary());
            preparedStatement.setObject(4, user.getDepartement() , Other);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
