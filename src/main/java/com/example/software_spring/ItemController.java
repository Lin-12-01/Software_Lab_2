package com.example.software_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/")
    public String getItems(Model model) {
        List<Item> itemsList = new ArrayList<>();
        itemsList.add(new Item(1L, "Apple iPhone 14", "128Gb black", 318997.00));
        itemsList.add(new Item(2L, "Apple iPhone 14 Pro", "128Gb violet", 498945.00));
        itemsList.add(new Item(3L, "Apple iPhone 15", "128Gb green", 353539.00));
        itemsList.add(new Item(4L, "Apple iPhone 15 Pro", "128Gb blue", 570814.00));
        itemsList.add(new Item(5L, "Apple iPhone 16", "128Gb white", 436622.00));
        itemsList.add(new Item(6L, "Apple iPhone 16 Pro", "128Gb yellow", 598590.00));

        model.addAttribute("items", itemsList);
        return "index";
    }
}
