import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pro26")
public class pro26 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        if (session.isNew() || session.getAttribute("visitedBefore") == null) {
            session.setAttribute("visitedBefore", true);
            out.println("<h1>Welcome to our website!</h1>");
        } else {
            out.println("<h1>Welcome back to our website!</h1>");
        }

        out.close();
    }
}
