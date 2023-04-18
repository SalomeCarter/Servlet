package by.tms.servlet;

import by.tms.entity.OperationType;
import by.tms.factory.OperationFactory;
import by.tms.service.CalculatorOperation;
import by.tms.service.CalculatorService;
import by.tms.validator.CalculatorValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc") //GET localhost:8080/calc?num1=25&num2=34&type=sum
public class CalcServlet extends HttpServlet {
    private final CalculatorService calculatorService = new CalculatorService();
    private final CalculatorValidator calculatorValidator = new CalculatorValidator();
    private final OperationFactory operationFactory = new OperationFactory();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        if (!calculatorValidator.isValidDigits(num1)) {
            resp.getWriter().println("Invalid num1!");
            return;
        }

        double sNum1 = Double.parseDouble(num1);

        String num2 = req.getParameter("num2");
        if (!calculatorValidator.isValidDigits(num2)) {
            resp.getWriter().println("Invalid num2!");
            return;
        }

        double sNum2 = Double.parseDouble(num2);


        OperationType opType = OperationType.valueOf(req.getParameter("type").toUpperCase());

        CalculatorOperation instance = operationFactory.getInstance(sNum1, sNum2, opType);

        double result = calculatorService.calculate(instance);

        req.setAttribute("result", result);
        req.getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }
}

