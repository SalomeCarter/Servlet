package by.tms.servlet;
import by.tms.authentication.User;
import by.tms.service.CalculatorOperation;
import by.tms.service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/calc/history")
public class CalcHistoryServlet extends HttpServlet {
    private final CalculatorService calculatorService = CalculatorService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        List<CalculatorOperation> operationList = calculatorService.findAllByUsername(user.getUsername());
        req.setAttribute("operationList", operationList);

        req.getRequestDispatcher("/pages/history.jsp").forward(req, resp);
    }
}
