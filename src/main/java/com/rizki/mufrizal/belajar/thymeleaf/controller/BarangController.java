package com.rizki.mufrizal.belajar.thymeleaf.controller;

import com.rizki.mufrizal.belajar.thymeleaf.model.Barang;
import com.rizki.mufrizal.belajar.thymeleaf.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Jan 31, 2016
 * @Time 12:50:15 PM
 * @Encoding UTF-8
 * @Project Belajar-Thymeleaf
 * @Package com.rizki.mufrizal.belajar.thymeleaf.controller
 *
 */
@Controller
public class BarangController {

    @Autowired
    private BarangService barangService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("dataBarang", barangService.getBarangs());
        return "index";
    }

    @RequestMapping(value = "/tambah", method = RequestMethod.GET)
    public String tambah(Model model) {
        model.addAttribute("barang", new Barang());
        return "tambah";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("barang") Barang barang) {
        barangService.save(barang);
        return "redirect:/";
    }

    @RequestMapping(value = "/edit/{idBarang}", method = RequestMethod.GET)
    public String edit(Model model, @PathVariable("idBarang") String idBarang) {
        model.addAttribute("barang", barangService.getBarang(idBarang));
        return "edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("barang") Barang barang) {
        barangService.update(barang);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{idBarang}", method = RequestMethod.GET)
    public String update(@PathVariable("idBarang") String idBarang) {
        barangService.delete(barangService.getBarang(idBarang));
        return "redirect:/";
    }

}
