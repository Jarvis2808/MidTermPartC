/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author jaini
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
       
        System.out.print("Enter your favorite actor: ");
        String favoriteActor = scanner.nextLine();

        /** Made the changes in the TestUserProfile**/
       
        UserProfile userProfile = new UserProfile(name, favoriteActor);
        
        
        System.out.println("User profile created successfully for " + name);
    }
    
}
