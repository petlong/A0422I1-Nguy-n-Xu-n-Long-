package repository.impl;

import model.ThanhToan;
import repository.BaseRepository;
import repository.IThanhToanRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThanhToanRepositoryImpl implements IThanhToanRepository {
    private final String SELECT_ALL = "select * from thanhtoan;";

    @Override
    public List<ThanhToan> findAll() {
        List<ThanhToan> thanhToanList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("thanhtoan_id"); // theo database
                String name = resultSet.getString("thanhtoan_name");
                ThanhToan thanhToan = new ThanhToan(id, name);
                thanhToanList.add(thanhToan);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return thanhToanList;
    }
}
