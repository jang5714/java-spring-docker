package shop.Jarvis.app.demo;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss").format(new Date());
    }
}
