//package repository.impl;
//
//import model.User;
//import repository.IPositionRepository;
//import repository.IUserRepository;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserRepository implements IUserRepository {
//    @Override
//    public List<User> findAll() {
//        List<User> positionList = new ArrayList<>();
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement ps = connection.prepareStatement("select * from user;");
//            ResultSet resultSet = ps.executeQuery();
//            while (resultSet.next()){
//                String userName = resultSet.getString("position_name");
//                String pass = resultSet.getString("position_name");
//                User user = new User(id,name);
//                positionList.add(user);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return positionList;
//    }
//
//    @Override
//    public boolean add(User user) {
//        return false;
//    }
//}
