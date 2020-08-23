package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingService;    
    
public class ConstructorInjectedControllerTest {
    public ConstructorInjectedController controller;

    @BeforeEach
    public void setup(){
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }
        
    @Test
    public void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
    