package demo.exceptionhandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easyframework.web.mvc.ExceptionResolver;
import org.easyframework.web.mvc.annotation.ExceptionHandler;

@ExceptionHandler(Exception.class)
public class ExceptionResolverTest implements ExceptionResolver {

	public Object resolve(HttpServletRequest request, HttpServletResponse response, Throwable t, boolean isAjax) {
		return "exception caught";
	}

}
