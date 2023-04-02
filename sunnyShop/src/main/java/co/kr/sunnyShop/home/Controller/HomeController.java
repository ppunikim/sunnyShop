package co.kr.sunnyShop.home.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/index.sgn")
    public String main() {
        return "/home/index.jsp";
    }

}
