import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pro22_1")
public class pro22_1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        if (session != null) {
            String userName = (String) session.getAttribute("userName");

            out.println("<h1>Welcome Back</h1>");
            out.println("<p>Your session ID is still active.</p>");
            out.println("<p>User Name: " + userName + "</p>");
        } else {
            out.println("<h1>Session Expired or Not Found</h1>");
            out.println("<p>Please start a new session <a href=\"StartSessionServlet\">here</a>.</p>");
        }

        out.println("</body></html>");

        out.close();
    }
    
    
}
