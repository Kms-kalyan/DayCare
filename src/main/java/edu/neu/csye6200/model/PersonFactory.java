
package edu.neu.csye6200.model;

import java.util.Date;


public class PersonFactory {

    
    public Person create(String type, String data) {
        if ("Student".equalsIgnoreCase(type)) {
            return new Student(data);
        }
        
        else if ("Teacher".equalsIgnoreCase(type)){
            return new Teacher(data);
        }
        return null;
    }
    
    public Person create(String firstName, String lastName, int age,
                         double gpa, String fatherName, String motherName,
                         String address, String phoneNumber, Date walkInDate) {
        
        return new Student(firstName, lastName, age, gpa, fatherName,
                            motherName, address, phoneNumber, walkInDate);
            
    }
    
    public Person create(String firstName, String lastName, int age,
                         int credits, Date reviewDate) {
        
        return new Teacher(firstName, lastName, age, credits, reviewDate);
            
    }
    
    
    

   
    
    
}
