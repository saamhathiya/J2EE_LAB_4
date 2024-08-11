import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro21")
public class pro21 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>404 - Page Not Found</title></head><body>");
        out.println("<h1>404 - Page Not Found</h1>");
        out.println("<p>Sorry, the page you are looking for does not exist.</p>");
        out.println("<p>Please check the URL or return to the <a href=\"pro21.html\">home page</a>.</p>");
        out.println("</body></html>");

        out.close();
    }

    
}
