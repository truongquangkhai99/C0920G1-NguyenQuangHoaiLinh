import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
        float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);

        PrintWriter display = response.getWriter();
        display.println("<html>");
        display.println("<h1>Result :</h1>");
        try {
            float result = Calculator.calculate(firstOperand, secondOperand, operator);
            display.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
        }catch (Exception ex){
            display.println("Error: " + ex.getMessage());
        }
        display.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
