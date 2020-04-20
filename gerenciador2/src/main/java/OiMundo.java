import java.io.IOException;
import java.io.PrintWriter;

public class OiMundo extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("oi mundo, parabens vc escreveu a primeira servlet.");
        out.println("</body>");
        out.println("</html>");

        System.out.println("a servlet OiMundoServlet foi chamado");
    }
}


}
