/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gescom.spring.mvc.tiles.springmvc;

/**
 *
 * @author gescom
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ApplicationController {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }

    @RequestMapping(value = {"/apachetiles"}, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "apachetiles";
    }

    @RequestMapping(value = {"/springmvc"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "springmvc";
    }
}
