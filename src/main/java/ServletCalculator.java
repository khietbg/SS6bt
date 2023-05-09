import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculator", value = "/ServletCalculator")
public class ServletCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float ListPrice = Float.parseFloat(request.getParameter("price"));
        float DiscountPercent = Float.parseFloat(request.getParameter("Discount"));
        float DiscountAmount = (float) (ListPrice * DiscountPercent * 0.01);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>price: "+ ListPrice+"</h1>");
        writer.println("<h1>Discount: "+ DiscountPercent+"</h1>");
        writer.println("<h1>DiscountAmount: "+ DiscountAmount+"</h1>");
    }
}
