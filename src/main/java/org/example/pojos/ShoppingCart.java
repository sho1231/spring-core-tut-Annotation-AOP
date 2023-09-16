package org.example.pojos;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
  public void checkout(String status){
    System.out.println("Checkout:"+status);
  }
  public void test(){
    System.out.println("Also working");
  }
}
