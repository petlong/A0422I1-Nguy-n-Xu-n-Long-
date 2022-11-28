package controller;

import model.ThanhToan;
import model.Thue;
import service.IThanhToanService;
import service.IThueService;
import service.impl.ThanhToanServiceImpl;
import service.impl.ThueServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private IThueService thueService = new ThueServiceImpl();
    private IThanhToanService thanhToanService = new ThanhToanServiceImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "save":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                search(request, response);
                break;
//            case "sort":
//                sort(request, response);
            default:
                showProductList(request, response);
                break;


        }


    }

    private void showProductList(HttpServletRequest request, HttpServletResponse response) {
        List<Thue> thueList = thueService.findAll();
        List<ThanhToan> thanhToanList = thanhToanService.findAll();

        request.setAttribute("thueList", thueList);
        request.setAttribute("thanhToanList", thanhToanList);

        try {
            request.getRequestDispatcher("view/product/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String searchId = request.getParameter("searchId");
        String searchName = request.getParameter("searchName");
        String searchPhone = request.getParameter("searchPhone");

        List<Thue> thueList = thueService.search(searchId,searchName,searchPhone);
        request.setAttribute("thueList", thueList);

        List<ThanhToan> thanhToanList = thanhToanService.findAll();
        request.setAttribute("thanhToanList", thanhToanList);

        try {
            request.getRequestDispatcher("view/product/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
        thueService.delete(deleteId);
        request.setAttribute("mess", "xóa thành công");
        showProductList(request, response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // lấy list qua
//        List<ThanhToan> thanhToanList = thanhToanService.findAll();
//
//        request.setAttribute("categoryModelList", thanhToanList);
//
//        // \\lấy list qua
//
//        int id = Integer.parseInt(request.getParameter("id"));
//        Thue existingProduct = thueService.getProduct(id);
//        request.setAttribute("product", existingProduct);
//        request.getRequestDispatcher("view/product/edit.jsp").forward(request, response);
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ThanhToan> thanhToanList = thanhToanService.findAll();
        request.setAttribute("thanhToanList", thanhToanList);
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
                save(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            default:
                showProductList(request, response);
                break;


        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {

//        int id = Integer.parseInt(request.getParameter("id"));
//
//
//        String nameProduct = request.getParameter("name");
//        double price = Double.parseDouble(request.getParameter("price"));
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//        String color = request.getParameter("color");
//        String description = request.getParameter("description");
//        int idCategory = Integer.parseInt(request.getParameter("categoryId"));
//        Thue thue = new Thue(id, nameProduct, price, quantity, color, description, idCategory);
//
//        boolean check = thueService.edit(thue);
//        String mess = "Sửa không thành công";
//        if (check) {
//            mess = "Sửa thành công";
//        }
//        request.setAttribute("mess", mess);
//        try {
//            // để get lại dữ liệu cho selection
//            List<ThanhToan> thanhToanList = thanhToanService.findAll();
//
//            request.setAttribute("categoryModelList", thanhToanList);
//
//            // \\để get lại dữ liệu cho selection
//
//            request.getRequestDispatcher("view/product/edit.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
//                int id = Integer.parseInt(request.getParameter("id"));

        String nameThue = request.getParameter("nameThue");
        String phoneThue = request.getParameter("phoneThue");
        String ngayThue = request.getParameter("ngayThue");
        int idThanhToan = Integer.parseInt(request.getParameter("idThanhToan"));
        String noteThue = request.getParameter("noteThue");
        Thue thue = new Thue(nameThue, phoneThue, ngayThue, idThanhToan, noteThue);

        boolean check = thueService.save(thue);
        String messCreate = "them moi khong thanh cong";
        if (check) {
            messCreate = "Them moi thanh cong";
        }
        request.setAttribute("messCreate", messCreate);
        try {
            List<Thue> thueList = thueService.findAll();
            List<ThanhToan> thanhToanList = thanhToanService.findAll();

            request.setAttribute("thueList", thueList);
            request.setAttribute("thanhToanList", thanhToanList);

            request.getRequestDispatcher("view/product/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
