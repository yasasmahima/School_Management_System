package com.example.demo.Controllers;

import com.example.demo.models.Batch;
import com.example.demo.models.ClassRoom;
import com.example.demo.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class ClassController {

    @Autowired
    Teacher teacher;

    @Autowired
    Batch batch;

    @Autowired
    TeacherController teacherController;

   @Autowired
    ClassRoom classRoom;

   @Autowired
           StudentController studentController;

   ArrayList<ClassRoom> classRoomArrayList=new ArrayList<>();

    @GetMapping("classes")
    public String getForm(){
        return "class";
    }

    @PostMapping("/classes")
    public String saveTeacher(@RequestParam("class")String className,
                              @RequestParam("incharge")String incharge,
                              @RequestParam("batch")String batchs,
                              @RequestParam("batchId")String batchId,
                                 ModelMap modelMap) {

        batch = new Batch(batchs, batchId);

        boolean teacherAvailable=false;
        for (Teacher teacher : teacherController.teacherArrayList) {
            if (incharge.equals(teacher.getName())) {
                this.teacher = teacher;
                teacherAvailable=true;

            }
        }

        if (teacherAvailable) {

            if(className.equals("Class 1")){
                classRoom = new ClassRoom(className, teacher, batch,studentController.class1);
            }

            if(className.equals("Class 2")){
                classRoom = new ClassRoom(className, teacher, batch,studentController.class2);
            }

            if(className.equals("Class 3")){
                classRoom = new ClassRoom(className, teacher, batch,studentController.class3);
            }

            System.out.println(classRoom);
            modelMap.put("message","Successfully Changed");

        }
        else{
            modelMap.put("error","This In-Charge Teacher is Not Available..Try Again...");
        }

        return "class";

    }
}