package java.for.beginner

public class Operator {
    public static void Connect() { 
      String FirstName = "Example";
      String LastName = "CodeJava";
      
      String Name = FirstName + " " + LastName; //เชื่อมต่อด้วยเครื่องหมาย +
      System.out.println(Name); //Output = Example CodeJava
    }
    
    public static void Assignment() {
      String Item = "Tools"; //กำหนดค่าด้วยเครื่องหมาย =
    }
    
    public static void Arithmetic() {
      final int a = 10;
      final int b = 20;
      int c = 0;
      
      c = a + b; //การบวกด้วยเลขเครื่องหมาย + (Output = 30)
      c = a - b; //การลบด้วยเลขเครื่องหมาย - (Output = -10)
      c = a * b; //การคูณด้วยเลขเครื่องหมาย * (Output = 20)
      c = b / a; //การหารด้วยเลขเครื่องหมาย / (Output = 2)
      c = a % b; //การหารเอาเศษด้วยเลขเครื่องหมาย % (Output = 10)
    }
    
    public static void Compound() {
        a += 2; //เทียบเท่ากับ a = a + 2
      	a -= 2; //เทียบเท่ากับ a = a - 2
        a *= 2; //เทียบเท่ากับ a = a * 2
        a /= 2; //เทียบเท่ากับ a= a / 2
        a %= 2; //เทียบเท่ากับ a = a % 2
        a >>= 2; //เทียบเท่ากับ a = a >> 2
        a <<= 2; //เทียบเท่ากับ a = a << 2
        a & = 2; //เทียบเท่ากับ a = a & 2
        a ^= 2; //เทียบเท่ากับ a= a ^ 2
        a |= 2; //เทียบเท่ากับ a = a | 2
    }
    
    public static void IncrementAndDecrement() {
      ++a; //เทียบเท่ากับ a = a + 1
      a++; //เทียบเท่ากับ a = a + 1
      --a; //เทียบเท่ากับ a = a - 1
      a--; //เทียบเท่ากับ a = a - 1
      
      int d = 10; int f = 10;
      System.out.println(++d); //Output 11 (เพิ่มค่าก่อนแสดงผล)
      System.out.println(f++); //Output 10 (เพิ่มค่าหลังแสดงผล)
    }
    
    public static void RelationalAndComparison() {
      a = 10;
      b = 20;
      if(a == b){ //เป็นจริงหาก a เท่ากับ b
         System.out.println(a == b); //Output: false
      }
      else if (a != b){ //เป็นจริงหาก a ไม่เท่ากับ b
        System.out.println(a != b); //Output: true
      }
      else if (a < b){ //เป็นจริงหาก a น้อยกว่า b
        System.out.println(a < b); //Output: true
      }
      else if (a > b){ //เป็นจริงหาก a มากกว่า b
        System.out.println(a > b); //Output: false
      }
      else if (a <= b){ //เป็นจริงหาก a น้อยกว่าหรือเท่ากับ b
        System.out.println(a <= b); //Output: true
      }
      else if (a >= b){ //เป็นจริงหาก a มากกว่าหรือเท่ากับ b
        System.out.println(a >= b); //Output: false
      }
    }
    
    public static void Logical() {
    a = 10;
    b = 20;
        if(a == 10 && b == 20){ //และ
          System.out.println("เป็นจริงคู่");
        }
        else if(a == 0 || b == 0){ //หรือ
          System.out.println("อันใดอันหนึ่ง");
        }
        //Output: เป็นจริงคู่
    }
    
    public static void TernaryOperator(){
    a = 10;
        System.out.println( a < 20 ? "valueForTrue" : "valueForFalse"); //เงื่อนไขขนาดเล็กแต่ไม่ต้องใช้ if else
        //Output: valueForTrue
    }
}
