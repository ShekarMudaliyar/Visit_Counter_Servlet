import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class visitCounter extends HttpServlet {
   int i;
   public void init(){
       i=1;
   }
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
        PrintWriter out = res.getWriter();
        out.println(i);
        i++;
    
    }
}
