package by.tms.servlet;


import by.tms.entity.Operation;
import by.tms.entity.OperationType;
import by.tms.service.CalculatorService;
import by.tms.validator.CalculatorValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc", loadOnStartup = 1) //GET localhost:8080/calc?num1=25&num2=34&type=sum
public class CalcServlet extends HttpServlet {
    private final CalculatorService calculatorService = new CalculatorService();
    private final CalculatorValidator calculatorValidator = new CalculatorValidator();

    //1.init
    //2.service
    //3.destroy

    @Override
    public void init() throws ServletException {
        System.out.println("Calc Init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Calc Destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double sNum1 = Double.parseDouble(req.getParameter("num1"));
        if (!calculatorValidator.isValidDigits(String.valueOf(sNum1))) {
            resp.getWriter().print("num1 is not valid!");
        }
        double sNum2 = Double.parseDouble(req.getParameter("num2"));
        if (!calculatorValidator.isValidDigits(String.valueOf(sNum2))) {
            resp.getWriter().print("num2 is not valid!");
        }
        OperationType opType = OperationType.valueOf(req.getParameter("type").toUpperCase());

        Operation operation = new Operation(sNum1, sNum2, opType);

        Operation result = calculatorService.calculate(operation);

        resp.getWriter().print("Result = " + result.getResult());
    }
}

