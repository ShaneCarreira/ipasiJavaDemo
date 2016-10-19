/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iapsidemo2016.model;

import java.util.ArrayList;

/**
 *
 * @author romeu
 */
public class ApplicationData {
    
    private static final ApplicationData instance = new ApplicationData();

    public static ApplicationData getInstance() {
        return instance;
    }
    private ArrayList<Student> students;

    public ApplicationData(){      
        this.students = new ArrayList<>();
        
         this.students.add(new Student("pedro ferreira", "2121212")); 
        this.students.add(new Student("Vicente Severino", "2160452"));
        this.students.add(new Student("joao porelo", "2160453"));
        this.students.add(new Student("diogo dias","2160440"));
        this.students.add(new Student("ricardo cruz","2160472"));
        this.students.add(new Student("catarina rodrigues", "2160445"));
        this.students.add(new Student("André Rodrigues", "2160463"));
        this.students.add(new Student("João Rodrigues", "2160466"));
        this.students.add(new Student("Fábio Baptista", "2160434"));
        this.students.add(new Student("Nelson Romão", "2160467"));
    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) students.clone();
    }
    
}
