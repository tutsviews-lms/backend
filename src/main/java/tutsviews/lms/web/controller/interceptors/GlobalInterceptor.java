package tutsviews.lms.web.controller.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import tutsviews.lms.web.controller.data.HitCounter;

@Component
public class GlobalInterceptor extends HandlerInterceptorAdapter {

@Autowired 
Logger logger;

@Autowired
HitCounter hitCounter;

	   @Override
	    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception arg3)
	            throws Exception {
		   logger.info("Request Completed!" );
	    }
	 
	    @Override
	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView model)
	            throws Exception {
	    	logger.info("Method executed");
	    }
	 
	    @Override
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
	    	logger.info("Before process request");
	    	hitCounter.setHits(hitCounter.getHits()+1);
	    	System.out.println("Hits : "+ hitCounter.getHits());
	    	request.setAttribute("item", null);
	        return true;
	    }

	
	
	
	
}
