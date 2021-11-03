package com.dio.ansi.controller;

import com.dio.ansi.model.UserCategory;
import com.dio.ansi.service.UserCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class UserCategoryController {

    @Autowired
    UserCategoryService userCategoryService;

    @PostMapping
    public UserCategory createCategory(@RequestBody UserCategory userCategory) {
        return userCategoryService.createCategory(userCategory);
    }

    @DeleteMapping("/{idCategory}")
    public void deleteByIdCategory(@PathVariable("IdCategory") Long idCategory) {
        userCategoryService.deleteCategory(idCategory);
    }

    @GetMapping
    public List<UserCategory> findAll() {
        return userCategoryService.findAll();
    }

    @GetMapping("/{idCategory}")
    public UserCategory findById(@PathVariable("idCategory") Long idCategory) {
        return userCategoryService.findById(idCategory);
    }

    @PutMapping
    public UserCategory updateCreate(@RequestBody UserCategory userCategory) {
        return userCategoryService.updateCategory(userCategory);
    }
}
