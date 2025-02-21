package ca.sheridancollege.robaszel.midtermexamlucas.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ca.sheridancollege.robaszel.midtermexamlucas.database.InventoryDB;


@Controller
public class PageController {
    @Autowired
    private InventoryDB inventoryDB;

    @GetMapping("/addProduct")
    public String addProduct(Model model) {
        model.addAttribute("storeList", inventoryDB.findAll());
        model.addAttribute("productList", inventoryDB.findById(1L).get().getProducts());
        return "addProduct";
    }
}
