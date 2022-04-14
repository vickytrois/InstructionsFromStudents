/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Students;
/**
 *
 * @author v3gc
 */
public class StudentsController {

    private Students student;
      
    public double calculateAverage () {
        return (student.getStudentsGrade1() + student.getStudentsGrade2() + student.getStudentsGrade3())/3;
    }
    
    public void showConcept(){
        if (calculateAverage() < 7){
            System.out.println("Your average is " + calculateAverage() + " and I'm afraid you FAILED.");
        }else{        
            System.out.println("Your average is " + calculateAverage() + " and you PASSED. Congrats!");
        }
        //tem que add o resultado do operador em uma variável calculateAverage() < 7 ? System.out.println("Your average is " + calculateAverage() + " and I'm afraid you FAILED.") : System.out.println("Your average is " + calculateAverage() + " and you PASSED. Congrats!");
    } 
    
    
}
