package java.for.beginner

public class Method {
    public static void main (String[] args) {
        System.out.println("Hello World!");
    }
    
    public static String Test () { //การ return ค่าเป็น String
        String a = "test";
        return a;
    }
    
    public static String Test (int a, String[] b) { //การ return ค่าเป็น String แต่เพิ่มค่าที่ต้องการนำเข้าลงไป
        String c = b[1];
        return c;
    }
    
    //Java สามารถสร้าง Method ซ้ำกันได้แต่ตัวแปรต้องต่างกันเช่นมีการเพิ่ม int เข้ามาเป็นต้น
}
