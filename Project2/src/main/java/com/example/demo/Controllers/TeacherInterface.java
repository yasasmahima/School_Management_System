package com.example.demo.Controllers;

import org.springframework.ui.ModelMap;

import java.lang.ref.SoftReference;

public interface TeacherInterface {

    public String getForm();

    public String saveTeacher(String name, String subjectName, int teacherContact, int levels, String batchs, String batchId, ModelMap modelMap);

}
