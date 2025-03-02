package com.jtp.test_payment_str.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Tag(name = "Home controller")
public class HomeController {

    @Operation(summary = "Shows available products with their price and characteristics.")
    @GetMapping
    public String index(){
        return "index";
    }

    @Operation(summary = "Redirect to index page.")
    @GetMapping("/cancel")
    public String returnIndex(){
        return "redirect:/";
    }

    @Operation(summary = "Shows the result when the payment has been completed successfully.")
    @GetMapping("/success")
    public String success(){
        return "success";
    }

}
