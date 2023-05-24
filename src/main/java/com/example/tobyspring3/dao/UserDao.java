package com.example.tobyspring3.dao;

import com.example.tobyspring3.domain.User;

import java.sql.*;

public class UserDao {
    SimpleConnectionMaker connectionMaker = new SimpleConnectionMaker();
    ConnectionMaker connectionMaker;

    public UserDao() {
        this.connectionMaker = new DConnectionMaker();
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection conn = connectionMaker.makeNewConnection();
        Connection conn = connectionMaker.makeConnection();
        PreparedStatement pstmt = conn.prepareStatement("insert into users(id, name, password) values(?, ?, ?)");
        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getName());
        public void add (User user) throws ClassNotFoundException, SQLException {


            public User get (String id) throws SQLException, ClassNotFoundException {
                Connection conn = connectionMaker.makeNewConnection();
                Connection conn = connectionMaker.makeConnection();

                PreparedStatement psmt = conn.prepareStatement("select id, name, password from users where id = ?");
                psmt.setString(1, id);
                ResultSet rs = psmt.executeQuery();
                rs.next();// same as ctrl + enter
                User user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                rs.close();
                psmt.close();
                conn.close();
                return user;
            }
            public static void main (String[]args) throws SQLException, ClassNotFoundException {
                UserDao userDao = new UserDao();
        /*
        User 추가 예시:
        User user = new User();
        user.setId("2");
        user.setName("moon");
        user.setPassword("1234");
        */
        /*
        User select 예시:
         */
                User user = userDao.get("1");
                System.out.println(user.getId());
                System.out.println(user.getName());
                System.out.println(user.getPassword());
            }
        }
    }
}