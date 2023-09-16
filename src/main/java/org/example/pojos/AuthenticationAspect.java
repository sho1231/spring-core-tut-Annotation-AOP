package org.example.pojos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
//  @Pointcut("within(org.example.pojos.ShoppingCart)")
//  public void auth(){
//
//  }
//  @Before("auth()")
//  public void go(){
//    System.out.println(1231);
//  }
}
/*
The auth() method is like a rule that says, "Look for methods inside the org.example.pojos.ShoppingCart package." It doesn't run by itself; it's just a rule.

The go() method is like an action that says, "Before running any method inside the org.example.pojos.ShoppingCart package, do this action." In this case, the action is printing 1231.

So, the auth() method sets the rule, and the go() method performs the action when the rule matches.
 */
