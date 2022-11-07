package com.example.walmartAssessment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/*This Controller class is the link from the POJO files to the JSP files.
It maps the JSP in a way that when you enter /home, it maps the function to that extension
and returns the respective JSP file.
*  */
@Controller
public class ServiceController {
    //This page is to display the home page.
    @GetMapping("/home")
    public String hello(Model model, String name) {
        model.addAttribute("name", name);
        return "home";
    }
    //This page is to display the results page.
    @GetMapping("/findsyn")
    public String findprod(Model model, String word) {
        model.addAttribute("name", word);
        String lookup = word;

        //Creating an instance of the model
        WalmartAssessmentModel synnn = new WalmartAssessmentModel();

        //Creating an array of each parameter to return.
        //This will later be iterated through in the JSP to retrieve specific products.
        int[] id = synnn.findid(lookup);
        String[] description = synnn.finddescription(lookup);
        String[] img = synnn.findimg(lookup);
        String[] brand = synnn.findbrand(lookup);
        String[] price = synnn.findprice(lookup);
        int totalrows = synnn.totalrows(lookup);
        int[] idr = synnn.findidr(lookup);
        String[] brandr = synnn.findbrandr(lookup);
        String[] pricer = synnn.findpricer(lookup);
        String[] descriptionr = synnn.finddescriptionr(lookup);
        String[] imgr = synnn.findimgr(lookup);

        //Here, we are mapping the jsp attribute to variables.
        model.addAttribute("word", lookup);
        model.addAttribute("id", id);
        model.addAttribute("description", description);
        model.addAttribute("img", img);
        model.addAttribute("brand", brand);
        model.addAttribute("price", price);
        model.addAttribute("idr", idr);
        model.addAttribute("descriptionr", descriptionr);
        model.addAttribute("imgr", imgr);
        model.addAttribute("brandr", brandr);
        model.addAttribute("pricer", pricer);
        model.addAttribute("totalrows", totalrows);

        //3 Products are defined: If the search word is not these 3 products then return no result page.
        if(!(lookup.equals("bag") || (lookup.equals("lipstick") || (lookup.equals("perfume")))))
            return "noresult";
        return "result";
    }
}

