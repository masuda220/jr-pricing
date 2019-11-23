package example.presentatoin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("トップ")
@RequestMapping("/")
public class Top {
    @GetMapping
    String redirectToSwaggerUi() {
        return "redirect:/swagger-ui.html";
    }
}
