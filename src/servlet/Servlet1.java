package servlet;

import javax.servlet.ServletException;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet{
  public static void main(String args[]){
    new Usejdbc().Jdbc(741);


  }
  public void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
    String url = request.getRequestURI();
    if(url.equals("/zen"))
    {  Usejdbc jdbc=new Usejdbc();
      System.out.println("增");
    String id=request.getParameter("id");
      System.out.println(Integer.parseInt(id));
    jdbc.Jdbc(Integer.parseInt(id));
    }
    if(url.equals("/shan"))
      System.out.println("删");
  }
  public void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String url = request.getRequestURI();
    System.out.println(url);
  }
}
