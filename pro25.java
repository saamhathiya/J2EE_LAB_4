import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro25")
public class pro25 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        boolean isNewVisitor = true;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    isNewVisitor = false;
                    break;
                }
            }
        }

        if (isNewVisitor) {
            Cookie newUserCookie = new Cookie("user", "visited");
            newUserCookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(newUserCookie);
            out.println("<h1>Welcome to our website!</h1>");
        } else {
            out.println("<h1>Welcome back to our website!</h1>");
        }

        out.close();
    }
}
