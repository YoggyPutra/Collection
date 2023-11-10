/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ASUS
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> studentNames= new ArrayList<>();
        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }
    static void addStudents(ArrayList<String> studentName ){
        studentName.add("Mark");
        studentName.add("Andrew");
        studentName.add("Beth");
    }
    static void displayStudents(ArrayList<String> studentName){
        for(String student: studentName){
            System.out.println("Student name : "+student);
        }
    }
    
}
