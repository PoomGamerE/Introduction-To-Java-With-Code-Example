package java.for.beginner

import java.util.Scanner;

public class WhileLoop {

    public static void whilecheck() {
    int a = 0;
        while (a <= 10) { // ทำไปจนกว่า a จะครบ 10
            ++a;
        }
    }
   
    public static void docheck() {
    
        Scanner reader  = new Scanner(System.in);
        int number = 0;
        
        do {
          number = reader.nextInt();
        } 
        while (number % 2 == 0); //หากกรอกเลขคู่เรื่อยๆจะไม่ออก loop
          System.out.println("Exited loop.");
        }
    }
    
    public static void forloop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Loop " + i); //ทำงานไปเรื่อยๆจนกว่าจะครบ 10
            
            if (i == 5) {
                continue; //ข้ามการทำงานของเลข 5
            }
            
            if (i == 7) { //ถ้าครบ 7 แล้วให้ออกลูปโดยไม่ต้องทำงานต่อ
                break;
            }
        }
    }
}
