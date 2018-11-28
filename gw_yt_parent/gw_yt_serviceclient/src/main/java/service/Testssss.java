package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testssss {
    @Value("${qx.hello}")
    public String namea;
   @RequestMapping("/ttshow")
    public  String  testss(){
        System.out.println(namea);
        return   namea;
    }
}