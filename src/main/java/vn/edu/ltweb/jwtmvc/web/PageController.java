package vn.edu.ltweb.jwtmvc.web; import org.springframework.stereotype.Controller; import org.springframework.web.bind.annotation.GetMapping;
@Controller public class PageController{@GetMapping("/login")String login(){return "auth/login";}@GetMapping("/profile")String profile(){return "user/profile";}}
