/**
 * 
 */
package com.pudong.advice;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;


public class Advisor implements MethodBeforeAdvice{

	@Override
	/前置环绕
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg1.getClass().getName() + " want to try >>>>>>");
	}

	
}
