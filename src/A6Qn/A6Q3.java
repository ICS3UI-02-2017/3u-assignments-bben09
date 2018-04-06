/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A6Qn;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two integers");
        
        int blank = 0;
        
        int[] nums = new int[2];
        
        nums[0] = input.nextInt();
        nums[1] = input.nextInt();
        
        if(nums[0] > nums[1]){
           blank = nums[0];
           nums[0] = nums[1];
           nums[1] = blank;
        }
            System.out.println("The integers in ascending order are " + nums[0] + ", " + nums[1] + ".");
        }
    
}
