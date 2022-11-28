package controller;

//import model.CategoryModel;
//import model.ProductModel;
import model.Sach;
import model.The;
import service.ISachService;
//import service.IProductService;
import service.ITheService;
import service.impl.SachServiceImpl;
import service.impl.TheServiceImpl;
//import service.impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
//    private IProductService productService = new ProductServiceImpl();
    private ISachService sachService = new SachServiceImpl();
    private ITheService theService = new TheServiceImpl();



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "add":
                showFormCreate(request, response);
                break;
            case "edit":
//                showFormEdit(request, response);
                break;
            case "delete":
//                deleteProduct(request, response);
                break;
            case "search":
//                search(request, response);
                break;
//            case "sort":
//                sort(request, response);
            default:
                showSachList(request, response);
                break;


        }


    }

    private void showSachList(HttpServletRequest request, HttpServletResponse response) {
//        List<ProductModel> productModelList = productService.findAll();
        List<Sach> sachList = sachService.findAll();

//        request.setAttribute("productModelList", productModelList);
        request.setAttribute("sachList", sachList);

//        Test thử phân trang
//        String pageString = request.getParameter("page");
//        int page = 0;
//        if (!(pageString == null)){
//            page = Integer.parseInt(request.getParameter("page"));
//        }
//        request.setAttribute("page", page);

//        Test thử phân trang
        try {
            request.getRequestDispatcher("view/product/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    private void search(HttpServletRequest request, HttpServletResponse response) {
//        String searchName = request.getParameter("searchName");
////        String searchUser = request.getParameter("searchUser");
////        String searchPositionId = request.getParameter("searchPositionId");
////        String searchEducationDegreeId = request.getParameter("searchEducationDegreeId");
//
////        List<ProductModel> productModelList = productService.search(searchName);
////        request.setAttribute("productModelList", productModelList);
//        List<Sach> sachList = sachService.findAll();
//        request.setAttribute("categoryModelList", sachList);
////        List<PositionModel> positionModelList = positionService.findAll();
////        request.setAttribute("positionList", positionModelList);
////
////
////        List<EducationDegreeModel> educationDegreeModelList = educationDegreeService.findAll();
////        List<DivisionModel> divisionModelList = divisionService.findAll();
////
////        request.setAttribute("educationDegreeModelList", educationDegreeModelList);
////        request.setAttribute("divisionModelList", divisionModelList);
//
//        request.setAttribute("searchName", searchName);
////        request.setAttribute("searchUser", searchUser);
////        request.setAttribute("searchPositionId", searchPositionId);
////        request.setAttribute("searchEducationDegreeId", searchEducationDegreeId);
//
//        try {
//            request.getRequestDispatcher("view/product/list.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
//        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
//        productService.delete(deleteId);
//        request.setAttribute("mess", "xóa thành công");
//        showProductList(request, response);
//    }

//    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // lấy list qua
//        List<Sach> sachList = sachService.findAll();
//
//        request.setAttribute("sachList", sachList);
//
//        // \\lấy list qua
//
//        int maSach = Integer.parseInt(request.getParameter("ma_sach"));
//        Sach existingProduct = sachService.(id);
//        request.setAttribute("product", existingProduct);
//        request.getRequestDispatcher("view/product/edit.jsp").forward(request, response);
//    }
//
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<The> theList = theService.findAll();
        request.setAttribute("theList", theList);
        request.getRequestDispatcher("view/product/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "save":
//                save(request, response);
                break;
            case "edit":
//                editProduct(request, response);
                break;
//            case "delete":
//                deleteUser(request, response);
//                break;
//            case "search":
//                showUserByCoutry(request, response);
//                break;
            default:
                showSachList(request, response);
                break;


        }
    }

//    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
//
//        int id = Integer.parseInt(request.getParameter("id"));
//
//
//        String nameProduct = request.getParameter("name");
//        double price = Double.parseDouble(request.getParameter("price"));
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//        String color = request.getParameter("color");
//        String description = request.getParameter("description");
//        int idCategory = Integer.parseInt(request.getParameter("categoryId"));
//        ProductModel productModel = new ProductModel(id, nameProduct, price, quantity, color, description, idCategory);
//
//        boolean check = productService.edit(productModel);
//        String mess = "Sửa không thành công";
//        if (check) {
//            mess = "Sửa thành công";
//        }
//        request.setAttribute("mess", mess);
//        try {
//            // để get lại dữ liệu cho selection
//            List<CategoryModel> categoryModelList = sachService.findAll();
//
//            request.setAttribute("categoryModelList", categoryModelList);
//
//            // \\để get lại dữ liệu cho selection
//
//            request.getRequestDispatcher("view/product/edit.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private void save(HttpServletRequest request, HttpServletResponse response) {
//        //        int id = Integer.parseInt(request.getParameter("id"));
//
//        String nameProduct = request.getParameter("name");
//        double price = Double.parseDouble(request.getParameter("price"));
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//        String color = request.getParameter("color");
//        String description = request.getParameter("description");
//        int idCategory = Integer.parseInt(request.getParameter("categoryId"));
//        ProductModel productModel = new ProductModel(nameProduct, price, quantity, color, description, idCategory);
//
//
//
//
//        boolean check = productService.save(productModel);
//        String messCreate = "them moi khong thanh cong";
//        if (check) {
//            messCreate = "Them moi thanh cong";
//        }
//        request.setAttribute("messCreate", messCreate);
//        try {
//            List<ProductModel> productModelList = productService.findAll();
//            List<CategoryModel> categoryModelList = sachService.findAll();
//
//            request.setAttribute("productModelList", productModelList);
//            request.setAttribute("categoryModelList", categoryModelList);
//
//            request.getRequestDispatcher("view/product/list.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
