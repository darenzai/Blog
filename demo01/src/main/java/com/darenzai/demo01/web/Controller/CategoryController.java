package com.darenzai.demo01.web.Controller;


import com.darenzai.demo01.web.beans.Category;
import com.darenzai.demo01.web.dao.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryDAO categoryDAO;

    @RequestMapping("list")
    public String listCategory(Model m) throws  Exception{

        List<Category>  list=categoryDAO.findAll();

        m.addAttribute("cs",list);

        return "list";

    }

}
