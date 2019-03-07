package cookiesample

import org.grails.web.json.JSONObject

import javax.servlet.http.Cookie

class CookieController {

    def index() {
        def map = [ firstName: 'name', age: 10 ]
        Cookie c = new Cookie("test", new JSONObject(map).toString() )
        response.addCookie(c);  // throws exception
        render view:'index'
    }
}
