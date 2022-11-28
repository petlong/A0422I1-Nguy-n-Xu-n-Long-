package repository.impl;

//import model.CategoryModel;
import model.Sach;
import repository.BaseRepository;
import repository.ISachRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SachRepositoryImpl implements ISachRepository {
    private final String SELECT_ALL = "select * from sach;";

    @Override
    public List<Sach> findAll() {
        List<Sach> sachList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String maSach = resultSet.getString("ma_sach"); // theo database
                String tenSach = resultSet.getString("ten_sach");
                String tacGia = resultSet.getString("tac_gia");
                String moTa = resultSet.getString("mo_ta");
                int soLuong = resultSet.getInt("so_luong");
                Sach sach = new Sach(maSach,tenSach,tacGia,moTa,soLuong);
                sachList.add(sach);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sachList;
    }
}
