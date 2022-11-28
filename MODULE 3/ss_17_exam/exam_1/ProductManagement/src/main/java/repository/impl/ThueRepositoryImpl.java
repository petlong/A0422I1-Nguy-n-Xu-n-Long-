package repository.impl;

import model.Thue;
import repository.BaseRepository;
import repository.IThueRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThueRepositoryImpl implements IThueRepository {
    private final String SELECT_ALL = "select * from thue;";
    private final String INSERT = "insert into thue (thue_name, thue_phone, thue_date," +
            "thanhtoan_id, thue_note)" +
            "values (?,?,?,?,?)";

    private final String DELETE_BY_ID = "delete from thue where thue_id = ?;\n";
    private final String SEARCH ="select * from thue where thue_id like ? and thue_name like ? and thue_phone like ?;";
//    private final String SELECT_PRODUCT_BY_ID_STORE = "call get_product_by_id(?);";



    @Override
    public List<Thue> findAll() {
        List<Thue> thueList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int idThue = resultSet.getInt("thue_id");
                String nameThue = resultSet.getString("thue_name");
                String phoneThue = resultSet.getString("thue_phone");
                String dateThue = resultSet.getString("thue_date");
                int idThanhToan = resultSet.getInt("thanhtoan_id");
                String noteThue = resultSet.getString("thue_note");
                Thue thue = new Thue(idThue,nameThue,phoneThue,dateThue,idThanhToan,noteThue);
                thueList.add(thue);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return thueList;
    }

    @Override
    public boolean save(Thue thue) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT); // dùng preparestatement để excute câu query
            ps.setString(1, thue.getNameThue());
            ps.setString(2, thue.getPhoneThue());
            ps.setDate(3, Date.valueOf(thue.getDateThue()));
            ps.setInt(4, thue.getIdThanhToan());
            ps.setString(5, thue.getNoteThue());

            return ps.executeUpdate() > 0; // Thêm sửa xóa dùng excuteUpdate (trả lại số hàng bị thay đổi)
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }


    @Override
    public boolean delete(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(DELETE_BY_ID);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Thue> search(String searchId, String searchName, String searchPhone) {
        List<Thue> thueList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareStatement(SEARCH);
            pr.setString(1,"%"+ searchId +"%");
            pr.setString(2,"%"+ searchName+ "%");
            pr.setString(3, "%"+searchPhone+"%");
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {

                int idThue = resultSet.getInt("thue_id");
                String nameThue = resultSet.getString("thue_name");
                String phoneThue = resultSet.getString("thue_phone");
                String dateThue = resultSet.getString("thue_date");
                int idThanhToan = resultSet.getInt("thanhtoan_id");
                String noteThue = resultSet.getString("thue_note");
                Thue thue = new Thue(idThue,nameThue,phoneThue,dateThue,idThanhToan,noteThue);
                thueList.add(thue);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return thueList;
    }
}
