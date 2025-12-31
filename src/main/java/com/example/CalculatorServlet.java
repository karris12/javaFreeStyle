package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    
    private Calculator calculator = new Calculator();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String operation = request.getParameter("op");
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calculator Result</title>");
        out.println("<style>");
        out.println("body { font-family: Arial; padding: 50px; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); }");
        out.println(".container { background: white; padding: 30px; border-radius: 10px; max-width: 500px; margin: 0 auto; }");
        out.println("h1 { color: #667eea; }");
        out.println(".result { font-size: 24px; color: #28a745; margin: 20px 0; }");
        out.println("a { color: #667eea; text-decoration: none; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Calculator Result</h1>");
        
        try {
            if (num1Str != null && num2Str != null && operation != null) {
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);
                double result = 0;
                
                switch (operation) {
                    case "add":
                        result = calculator.add(num1, num2);
                        out.println("<p class='result'>" + num1 + " + " + num2 + " = " + result + "</p>");
                        break;
                    case "subtract":
                        result = calculator.subtract(num1, num2);
                        out.println("<p class='result'>" + num1 + " - " + num2 + " = " + result + "</p>");
                        break;
                    case "multiply":
                        result = calculator.multiply(num1, num2);
                        out.println("<p class='result'>" + num1 + " × " + num2 + " = " + result + "</p>");
                        break;
                    case "divide":
                        result = calculator.divide(num1, num2);
                        out.println("<p class='result'>" + num1 + " ÷ " + num2 + " = " + result + "</p>");
                        break;
                    default:
                        out.println("<p style='color: red;'>Invalid operation</p>");
                }
            } else {
                out.println("<p style='color: red;'>Please provide all parameters</p>");
            }
        } catch (Exception e) {
            out.println("<p style='color: red;'>Error: " + e.getMessage() + "</p>");
        }
        
        out.println("<p><a href='index.jsp'>← Back to Calculator</a></p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
