package org.example;

import org.example.pojos.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages ="org.example.pojos")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {
//  @Bean
//  public ShoppingCart getShoppingCart(){
//    return new ShoppingCart();
//  }
}
