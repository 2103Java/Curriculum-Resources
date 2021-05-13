package com.example.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {

/*
 * This method returns a boolean on whether a filter should be implented or not. 
 * 
 * We can put logic in here looking for the original domain and all that jazz
 */
		
		boolean shouldFilter = true;
		return shouldFilter;
	}

	@Override
	public Object run() throws ZuulException {


		/*
		 * This is our actual filter logic!
		 */
		
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest myRequest = context.getRequest();
		
		System.out.println("The method of the request: " + myRequest.getMethod());
		System.out.println("Here's the URI: " + myRequest.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {

		/*
		 * Zuul will parse the string to figure out what type of filter this class represents
		 * 
		 * filter by route
		 * 
		 * pre filters 
		 * 
		 * post filters 
		 * 
		 * error filters 
		 */
		return "pre";
	}

	@Override
	public int filterOrder() {

/*
 * If you have many filters, of the same type. They you can set a precedence order. 
 * 
 * Numeric order will be the order of the filter trigger. 
 */
		return 0;
	}

}
