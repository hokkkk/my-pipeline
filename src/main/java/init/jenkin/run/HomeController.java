package init.jenkin.run;


import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/api/v1/index")
    public String index () {
        return "development Response";
    }
}
