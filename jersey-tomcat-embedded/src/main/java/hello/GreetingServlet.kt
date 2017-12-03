package hello

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/greeting")
class GreetingServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.writer.write("""
 <body>
 <h1>
 Hello
 </h1>
 </body>
		""")
    }
}