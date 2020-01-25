package com.example.demo.Controllers;

import org.springframework.ui.ModelMap;

public interface StudentInterface {

    public String getForm();

    public String saveDetails(String name, int age, String email, String parentName, int contactNo, String job, ModelMap modelMap);

    public String getSearch();

    public String searchStudent(String name,ModelMap modelMap);

    public String getUpdate();

    public String updateStudent(String name, int age, String email, String parentName, int contactNo, String job, ModelMap modelMap);
}
