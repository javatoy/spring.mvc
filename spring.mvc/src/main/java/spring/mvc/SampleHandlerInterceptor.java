package spring.mvc;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SampleHandlerInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private HttpSession session;

	private static final Logger logger = LoggerFactory.getLogger(SampleHandlerInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String info = String.format("[%s-%s]", Integer.toHexString(session.getId().hashCode()), Integer.toHexString(UUID.randomUUID().hashCode()));
		logger.info(info);
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
