package roomescape.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String readAdmin() {
        return "admin/index";
    }

    @GetMapping("/admin/reservation")
    public String readReservation() {
        return "admin/reservation-legacy";
    }
}
