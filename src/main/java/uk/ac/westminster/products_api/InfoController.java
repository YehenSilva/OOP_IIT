//Newly Created class Controller and newly added /info GET with small description on the program

package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/info")
    public String info(){return "Returns data when we call them";}

}
