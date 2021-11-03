package com.dio.ansi.service;


import com.dio.ansi.exception.UserCategoryNotFoundException;
import com.dio.ansi.model.UserCategory;
import com.dio.ansi.repository.UserCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserCategoryService {

    UserCategoryRepository userCategoryRepository;

    @Autowired
    public UserCategoryService(UserCategoryRepository userCategoryRepository){
        this.userCategoryRepository = userCategoryRepository;
    }

    public UserCategory createCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public void deleteCategory(Long idCategory) {
        userCategoryRepository.deleteById(idCategory);
    }

    public List<UserCategory> findAll() {
        return userCategoryRepository.findAll();
    }

    public UserCategory findById(Long idCategory) {
        return userCategoryRepository.findById(idCategory).orElseThrow(() -> new UserCategoryNotFoundException(idCategory));
    }

    public UserCategory updateCategory(UserCategory userCategory) {
        return userCategoryRepository.save(userCategory);
    }
}

