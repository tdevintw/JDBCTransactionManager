package dev.yassiraitelghari.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database instance ;
    private Connection connection ;
    private String url = "jdbc:postgresql://localhost:5433/JDBCTransactionManager";
    private String owner = "postgres";
    private String password=  "ysrysr";

    private Database() throws SQLException {
        try{
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url,owner,password);
        }catch (ClassNotFoundException | SQLException e){
            throw  new SQLException(e);
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public static  Database getInstance() throws SQLException {
        if(instance ==null){
            instance = new Database();
        }else if(instance.connection.isClosed()){
            instance = new Database();
        }
        return instance;
    }
}
