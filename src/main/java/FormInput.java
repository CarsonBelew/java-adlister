import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormInput", urlPatterns = "/form-input")

public class FormInput extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        int age =  Integer.parseInt(req.getParameter("age"));
        out.println("Your new username is: " + username +
                    "\nYour new password is: " + password+
                    "\nYour age is: " + age);


    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");

        out.println("<form method='POST'>" +
                "<input type='text' name='username' placeholder='enter username'>"+
                "\n<input type='password' name='password' placeholder='enter password'>"+
                "\n<input type='text' name='age' placeholder='enter age'>"+
                "\n<button>Submit</button>" +
                "</form>");

    }
}

