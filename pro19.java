import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro19")
public class pro19 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userAgent = request.getHeader("User-Agent");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        
        if (userAgent != null && (userAgent.contains("MSIE") || userAgent.contains("Trident"))) {
            out.println("<h1>You are using Internet Explorer</h1>");
        } else {
            out.println("<h1>You are using another browser</h1>");
        }
        
        out.println("</body></html>");
        out.close();
    }
}
