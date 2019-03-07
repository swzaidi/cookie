package cookiesample

import javax.servlet.http.Cookie

class CookieController {

    def index() {
        String value = "[{\"firstName\":\"Test\",\"max\":\"10\"}]"
        Cookie cookie = new Cookie("test", value)
        println "++++++++++ cookie value= " + cookie.getValue()
        cookie.path = '/'
        cookie.maxAge = 60 * 60 * 24 * 365
        //TODO: VRN: we seem to be setting the hostname, which wouldn't work for Akamai proxy
        //cookie.domain = domain
        cookie.secure = true
        cookie.httpOnly = true
        // set cookie
        response.addCookie(cookie)
        render view:'index'
    }
}
