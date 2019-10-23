package spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

public class SampleExceptionResolver extends AbstractHandlerExceptionResolver {

	private String defaultErrorView;

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {

		if (ex instanceof SpringMVCException) {
			request.setAttribute("exception", ex);
			return new ModelAndView(getDefaultErrorView());
		}

		return null;
	}

	public String getDefaultErrorView() {
		return defaultErrorView;
	}

	public void setDefaultErrorView(String defaultErrorView) {
		this.defaultErrorView = defaultErrorView;
	}

}
