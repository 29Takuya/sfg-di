package takuya.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import takuya.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
