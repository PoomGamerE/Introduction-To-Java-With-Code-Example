package java.for.beginner

import java.util.Scanner;

public class InputOutput {

    public static void Output {
        System.out.print("Test") //System.out.print() จะไม่ขึ้นบรรทัดใหม่
        System.out.println("Exam") //System.out.println() จะขึ้นบรรทัดใหม่ด้วย
        System.out.println("ple") 
        
        /* Output:
          Test Exam
          ple
        */
        
    }
    
    public static void EscapeCharacters {
        System.out.println("Test\tJava") //Output: Test   Java
        /*
          \t แท็บ
          \b เว้นวรรค
          \n บรรทัดใหม่
          \r ตัวอักขระอื่นๆภายหลังถูกเขียนทับโดยอักขระใดๆก่อนหน้านั้น
          \f ย้ายตำแหน่ง cursor ไปทางขวา 1 ระยะแล้วหยุด
          \' แสดงผล '
          \" แสดงผล "
          \\ แสดงผล \
        */
    }
    
    public static void InputFromKeyboard() {
        Scanner sn = new Scanner(System.in);
        String name;
        
        System.out.println(name); //Output: สิ่งที่ป้อนลงไปในที่นี้เป็นชื่อ
    }
    
}
