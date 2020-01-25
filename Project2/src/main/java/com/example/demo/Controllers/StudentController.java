package com.example.demo.Controllers;

import com.example.demo.models.ClassRoom;
import com.example.demo.models.Parent;
import com.example.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import sun.dc.path.PathError;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

@Controller
public class StudentController implements StudentInterface {

    @Autowired
    Student student;

    @Autowired
    Parent parent;

    @Autowired
    ClassController classController;


    public ArrayList<Student> studentArrayList=new ArrayList<>();
    public HashMap<String, Parent> studentAllDetails=new HashMap<>();

    public  static  ArrayList<Student> class1=new ArrayList<>();
    public  static ArrayList<Student> class2=new ArrayList<>();
    public  static ArrayList<Student>class3=new ArrayList<>();

    public static ArrayList<ArrayList<Student>> classRooms=new ArrayList<>();


//    @GetMapping(value = "/home")
//    public String home(HttpServletRequest request){
//
////        Using Path Variables
////        System.out.println("Home \t"+name);
//        String myName=request.getParameter("myName");
//        HttpSession session=request.getSession();
//        session.setAttribute("myName",myName);
//        return "home";
//    }



    @Override
    @GetMapping("/students")
    public String getForm() {
        return "student";
    }

//    @PostMapping("/student")
//    public String greetingSubmit(@ModelAttribute Student student) {
//        System.out.println(student);
//        return "result";
//    }

    @Override
    @PostMapping("/students")                     // it only support port method
    public String saveDetails(@RequestParam("name") String name,
                              @RequestParam("age") int age,
                              @RequestParam("email")String email,
                              @RequestParam("parentName") String parentName ,
                              @RequestParam("contactNo")int contactNo,
                              @RequestParam("job") String job, ModelMap modelMap) {



        student=new Student(name,age,email);
        parent=new Parent(parentName,contactNo,job);
        System.out.println(parent);
        studentAllDetails.put(name,parent);
        System.out.println(student);
        studentArrayList.add(student);
        // write your code to save details
        modelMap.put("name", name);
        modelMap.put("age", age);
        modelMap.put("email",email);
        modelMap.put("parentName",parentName);
        modelMap.put("contactNo",contactNo);
        modelMap.put("job",job);

      Random random=new Random();

        int classNo=random.nextInt(3);
        System.out.println(classNo);

        classRooms.add(class1);
        classRooms.add(class2);
        classRooms.add(class3);

        classRooms.get(classNo).add(student);

        String className="Class "+(classNo+1);

        modelMap.put("className",className);

        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);


        return "result";           // welcome is view name. It will call welcome.jsp
    }

    @Override
    @GetMapping("/searchStudents")
    public String getSearch(){
        return "stusearch";
    }


    @Override
    @PostMapping("/searchStudents")
    public String searchStudent(@RequestParam("name")String name,ModelMap map) {

        Student searchStudent = null;
        for (Student student : studentArrayList) {
            if (student.getName().equals(name)) {
                searchStudent = student;
            }
        }

        if(searchStudent==null){
            map.put("alert","This Student is not Exist");
        }else {

            if (studentAllDetails.containsKey(searchStudent.getName())) {
                Parent parent = studentAllDetails.get(searchStudent.getName());
                System.out.println(parent);
                map.put("parentName", "Students Parent Name : "+parent.getName());
                map.put("parentContact","Students Parent Contact No : "+ parent.getContactNo());
                map.put("job", "Students Parent Job : "  +parent.getContactNo());
            }

            map.put("stu","Student Details");
            map.put("prt","Parent Details");
            map.put("name","Students Name : "+searchStudent.getName());
            map.put("age", "Students Age : "+searchStudent.getAge());
            map.put("email","Students Email : "+ searchStudent.getEmail());

        }

        return "stusearch";
    }


    @Override
    @GetMapping("/updateStudents")
    public String getUpdate(){
        return "updateStu";
    }

    @Override
    @PostMapping("/updateStudents")
    public String updateStudent(@RequestParam("name") String name,
                                @RequestParam("age") int age,
                                @RequestParam("email")String email,
                                @RequestParam("parentName") String parentName ,
                                @RequestParam("contactNo")int contactNo,
                                @RequestParam("job") String job, ModelMap modelMap){

        Student searchStudent = null;
        for (Student student : studentArrayList) {
            if (student.getName().equals(name)) {
                searchStudent = student;
            }
        }

        if(searchStudent==null){
            modelMap.put("message","This Student is not Exist");
        }else {
                student=new Student(name,age,email);
                parent=new Parent(parentName,contactNo,job);

                studentArrayList.remove(searchStudent);
                studentAllDetails.remove(searchStudent);

                studentAllDetails.put(student.getName(),parent);
                studentArrayList.add(student);


            System.out.println(studentArrayList);
            modelMap.put("message","Successfully Updated the records");
        }
        return "updateStu";

    }


}





