package Assignment.TodoApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
     @RequestMapping(value = "localhost:8080/")
     public String index() {
         return "index";
     }
}

