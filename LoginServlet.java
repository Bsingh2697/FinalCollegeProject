    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession;  
    public class LoginServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                        throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            String name=request.getParameter("textfield");  
            String password=request.getParameter("textfield2");  
              
            if(password.equals("admin123")){ 
             request.getRequestDispatcher("product.html").forward(request, response); 
            out.print("Welcome, "+name);  
            HttpSession session=request.getSession();  
            session.setAttribute("name",name);  
            }  
            else{  
                out.print("Sorry, username or password error!");  
                request.getRequestDispatcher("admin login.html").include(request, response);  
            }  
            out.close();  
        }  
    }  
