package com.example.demo.Controllers;

import com.example.demo.models.Batch;
import com.example.demo.models.Level;
import com.example.demo.models.Subject;
import com.example.demo.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class TeacherController implements TeacherInterface {

    @Autowired
    Subject subject;

    @Autowired
    Batch batch;

    @Autowired
    Level level;

    @Autowired
    Teacher teacher;

    public ArrayList<Subject> subjectArrayList=new ArrayList<>();
    public ArrayList<Teacher> teacherArrayList=new ArrayList<>();
    public HashMap<Subject,String>teachersAndSubjects=new HashMap<>();

    @Override
    @GetMapping("/teachers")
    public String getForm() {
        return "Teacher";
    }


    @Override
    @PostMapping("/teachers")
    public String saveTeacher(@RequestParam("name")String name,
                              @RequestParam("subject")String subjectName,
                              @RequestParam("teacherContact")int teacherContact,
                              @RequestParam("level")int levels,
                              @RequestParam("batch")String batchs,
                              @RequestParam("batchId")String batchId, ModelMap modelMap){

       batch=new Batch(batchs,batchId);
       level=new Level(levels);

       subject=new Subject(subjectName,level,batch);

       teacher=new Teacher(name,subject,teacherContact);

       subjectArrayList.add(subject);
       teacherArrayList.add(teacher);
       teachersAndSubjects.put(subject,teacher.getName());

        System.out.println(teacher);

        modelMap.put("name",name);
        modelMap.put("subject",subjectName);
        modelMap.put("contact",teacherContact);
        modelMap.put("level",levels);
        modelMap.put("batch",batchs);
        modelMap.put("batchId",batchId);

        return "addedTeacher";
    }
}
