/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab07;

/**
 *
 * @author rodri
 */
public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user01 = new User("Rodrigo", "Chicago", "Joe");
        user01.tweet("Hello everyone! This is my first tweet!").display();
        
        
        User user02 = new User("Joe");
        user02.tweet("Hi this is Joe!").display(); 
      
        User user03 = new User("Emily", "NYC");
        user03.tweet("Such a beautiful day in New York City today!").display(); 
        
        user02.tweet("I wish I could get some pizza right now!").display(); 
    }
    
}
