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
	    }
	 
	    @Override
	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView model)
	            throws Exception {
	    }
	 
	    @Override
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
	    	hitCounter.setHits(hitCounter.getHits()+1);
	    	System.out.println("Hits : "+ hitCounter.getHits());
	        return true;
	    }

	
	
	
	
}
