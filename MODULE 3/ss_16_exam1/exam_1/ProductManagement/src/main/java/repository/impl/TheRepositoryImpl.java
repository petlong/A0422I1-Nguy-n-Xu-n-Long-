package repository.impl;

import model.The;
import repository.BaseRepository;
import repository.ITheRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TheRepositoryImpl implements ITheRepository {
    private final String SELECT_ALL = "select * from the;";
//    private final String INSERT_PRODUCT = "insert into product (product_name, product_price, product_quantity," +
//            "product_color, product_description, category_id)" +
//            "values (?,?,?,?,?,?)";
//    private final String EDIT_PRODUCT = "update product set product_name = ?, product_price = ?, product_quantity = ?," +
//            "product_color = ?, category_id = ?" +
//            " where product_id = ?";
//    private final String DELETE_BY_ID = "delete from product where product_id = ?;\n";
//    private final String SELECT_PRODUCT_BY_ID_STORE = "call get_product_by_id(?);";
//    private final String SEARCH_PRODUCT = "select * from product where product_name like ?;";

//    private static final String SORT_BY_NAME = "select * from employee order by employee_name asc;";
//    private static final String SORT_BY_USERNAME = "select * from employee order by username asc;";
//    private static final String SORT_BY_SALARY = "select * from employee order by employee_salary asc;";


    @Override
    public List<The> findAll() {
        List<The> productModelList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String maMuon = resultSet.getString("ma_muon");
                String maSach = resultSet.getString("ma_sach");
                String maHocSinh = resultSet.getString("ma_hoc_sinh");
                boolean trangThai = resultSet.getBoolean("trang_thai");
                Date ngayMuon = resultSet.getDate("ngay_muon");
                Date ngayTra = resultSet.getDate("ngay_tra");
                The the = new The(maMuon, maSach, maHocSinh, trangThai, ngayMuon, ngayTra);
                productModelList.add(the);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productModelList;
    }

//    @Override
//    public boolean save(ProductModel product) {
//        // Ket noi database
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement ps = connection.prepareStatement(INSERT_PRODUCT); // dùng preparestatement để excute câu query
//            ps.setString(1, product.getNameProduct());
//            ps.setDouble(2, product.getPrice());
//            ps.setInt(3, product.getQuantity());
//            ps.setString(4, product.getColor());
//            ps.setString(5, product.getDescription());
//            ps.setInt(6, product.getIdCategory());
//
//            return ps.executeUpdate() > 0; // Thêm sửa xóa dùng excuteUpdate (trả lại số hàng bị thay đổi)
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public boolean edit(ProductModel product) {
//        // Ket noi database
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement ps = connection.prepareStatement(EDIT_PRODUCT); // dùng preparestatement để excute câu query
//            ps.setString(1, product.getNameProduct());
//            ps.setDouble(2, product.getPrice());
//            ps.setInt(3, product.getQuantity());
//            ps.setString(4, product.getColor());
//            ps.setInt(5, product.getIdCategory());
//            ps.setInt(6, product.getIdProduct()); // sửa thì thêm cái này để where
//
//
////            ps.setString(11, employee.getUserName());
//
//            return ps.executeUpdate() > 0; // Thêm sửa xóa dùng excuteUpdate (trả lại số hàng bị thay đổi)
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public boolean delete(int id) {
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement ps = connection.prepareStatement(DELETE_BY_ID);
//            ps.setInt(1, id);
//            return ps.executeUpdate() > 0;
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return false;
//    }
//
//    public ProductModel getProduct(int id) {
//        ProductModel productModel = null;
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            CallableStatement callableStatement = connection.prepareCall(SELECT_PRODUCT_BY_ID_STORE);
//            callableStatement.setInt(1, id);
//            ResultSet resultSet = callableStatement.executeQuery();
//            while (resultSet.next()) {
////CHỖ NÀY LẤY TỪ FINDALL XUỐNG
//                int idProduct = resultSet.getInt("product_id");
//                String nameProduct = resultSet.getString("product_name");
//                double price = resultSet.getDouble("product_price");
//                int quantity = resultSet.getInt("product_quantity");
//                String color = resultSet.getString("product_color");
//                String description = resultSet.getString("product_description");
//                int idCategory = resultSet.getInt("category_id");
//                productModel = new ProductModel(idProduct, nameProduct, price, quantity, color, description, idCategory);
//// //CHỖ NÀY LẤY TỪ FINDALL XUỐNG %
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return productModel;
//    }

//    @Override
//    public List<ProductModel> search(String searchName) {
//        List<ProductModel> productModelList = new ArrayList<>();
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement pr = connection.prepareStatement(SEARCH_PRODUCT);
//            pr.setString(1, "%" + searchName + "%");
////            pr.setString(2, "%" + searchUser + "%");
////            pr.setString(3, "%" + searchPositionId + "%");
////            pr.setString(4, "%" + searchEducationDegreeId + "%");
//            ResultSet rs = pr.executeQuery();
//            while (rs.next()) {
//
//                // 1phan nay giống y findAll
//
//                int idProduct = rs.getInt("product_id");
//                String nameProduct = rs.getString("product_name");
//                double price = rs.getDouble("product_price");
//                int quantity = rs.getInt("product_quantity");
//                String color = rs.getString("product_color");
//                String description = rs.getString("product_description");
//                int idCategory = rs.getInt("category_id");
//                ProductModel productModel = new ProductModel(idProduct, nameProduct, price, quantity, color, description, idCategory);
//                productModelList.add(productModel);
//                // 2phan nay giống y findAll
//
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return productModelList;
//    }

//    @Override
//    public List<EmployeeModel> sort(String typeSort) {
//        EmployeeModel employeeModel = null;
//        List<EmployeeModel> employeeModelList = new ArrayList<>();
//        Connection connection = BaseRepository.getConnectDB();
//        PreparedStatement pr = null;
//        try {
//            switch (typeSort) {
//                case "id":
//                    pr = connection.prepareStatement(SELECT_ALL); // mặc định xếp từ trên xuống dưới
//                    break;
//                case "name":
//                    pr = connection.prepareStatement(SORT_BY_NAME);
//                    break;
//                case "salary":
//                    pr = connection.prepareStatement(SORT_BY_SALARY);
//                    break;
//                case "userName":
//                    pr = connection.prepareStatement(SORT_BY_USERNAME);
//                    break;
//                default:
//                    pr = connection.prepareStatement(SELECT_ALL);
//                    break;
//            }
//            ResultSet resultSet = pr.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("employee_id");
//                String name = resultSet.getString("employee_name");
//                Date birthday = resultSet.getDate("employee_birthday");
//                String idCard = resultSet.getString("employee_id_card");
//                double salary = resultSet.getDouble("employee_salary");
//                String phone = resultSet.getString("employee_phone");
//                String email = resultSet.getString("employee_email");
//                String address = resultSet.getString("employee_address");
//                int positionId = resultSet.getInt("position_id");
//                int educationDegreeId = resultSet.getInt("education_degree_id");
//                int divisionId = resultSet.getInt("division_id");
//                String userName = resultSet.getString("username");
//                EmployeeModel employee = new EmployeeModel(id, name, birthday, idCard, phone, email, address, salary, positionId, educationDegreeId, divisionId, userName);
//                employeeModelList.add(employee);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return employeeModelList;
//    }

}
