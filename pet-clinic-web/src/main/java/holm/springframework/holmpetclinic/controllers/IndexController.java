package holm.springframework.holmpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 *
 * @author Denis_Kholmogorov
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){

        return "index";
    }
}
