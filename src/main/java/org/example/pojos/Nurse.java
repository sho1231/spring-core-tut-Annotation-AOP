package org.example.pojos;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff{
  private String name;
  public void assist(){
    System.out.println("Nurse assisting");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String toString(){
    return String.format("Nurse name is %s",name);
  }
}
