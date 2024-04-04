package pl.stationersShop.ProjectShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "home page";
    }
}
