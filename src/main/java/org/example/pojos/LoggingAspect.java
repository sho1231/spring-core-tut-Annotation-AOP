package org.example.pojos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

  @Before("execution(* org.example.pojos.ShoppingCart.*(..))")
//  here * means for any return type
  public void beforelog(JoinPoint jp)
  {
    if(jp.getArgs().length==0)
      System.out.println("beforeLogging");
    else
      System.out.println("beforeLogging:"+jp.getArgs()[0]);
  }

  @After("execution(* org.example.pojos.ShoppingCart.*(..))")
  public void afterlog(){
    System.out.println("afterLogging");
  }

}
