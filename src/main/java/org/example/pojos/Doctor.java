package org.example.pojos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{
  private String name;
  @Autowired
  public Nurse nurse;
  public void assist(){
    System.out.println("Doctor assisting");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("dname");
    this.name = name;
  }
  @Override
  public String toString(){
    return String.format("Doctor name is: %s and Nurse name is %s",name,nurse);
  }

  @Bean
  public Nurse getNurse() {
    return nurse;
  }

  public void setNurse(Nurse nurse) {
    System.out.println("d nurse");
    this.nurse = nurse;
  }
}
