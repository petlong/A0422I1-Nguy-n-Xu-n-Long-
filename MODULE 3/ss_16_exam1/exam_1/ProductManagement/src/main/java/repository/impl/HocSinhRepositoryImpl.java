package repository.impl;

//import model.CategoryModel;
import model.HocSinh;
import model.Sach;
import repository.BaseRepository;
import repository.IHocSinhRepository;
import repository.ISachRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocSinhRepositoryImpl implements IHocSinhRepository {
    private final String SELECT_ALL = "select * from hoc_sinh;";

    @Override
    public List<HocSinh> findAll() {
        List<HocSinh> sachList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String maHocSinh = resultSet.getString("ma_hoc_sinh"); // theo database
                String hoTen = resultSet.getString("ho_ten");
                String lop = resultSet.getString("lop");
                HocSinh hocSinh = new HocSinh(maHocSinh,hoTen,lop);
                sachList.add(hocSinh);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sachList;
    }
}
