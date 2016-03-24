package demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easyframework.web.mvc.HandlerInterceptorAdapter;
import org.easyframework.web.mvc.annotation.Interceptor;

@Interceptor(value = { "/test" }, order = 1)
public class InterceptorTest extends HandlerInterceptorAdapter {

	@Override
	public boolean before(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("i am interceptor ... ");
		return true;
	}

}
