package by.tms.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc", loadOnStartup = 1) //GET localhost:8080/calc?num1=2&num2=2&type=sum
public class CalcServlet extends HttpServlet {

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
//    System.out.println("Calc Service");
//    doGet(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Calc Destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sNum1 = req.getParameter("num1");
        String sNum2 = req.getParameter("num2");
        String type = req.getParameter("type");

        double num1 = Double.parseDouble(sNum1);
        double num2 = Double.parseDouble(sNum2);

        double result = 0;

        switch (type){
            case "sum":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;
            default:
                resp.getWriter().println("Operation not found!");
//                System.out.println("Operation not found!");
                break;
        }

        resp.getWriter().print("Result = " + result);
    }
}

