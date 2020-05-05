package java.for.beginner

public class SwitchCase{

    public static void main(){
        int floor = 1;
        switch (floor) {
            case '1' : // หากเป็นเลข 1
                System.out.println("Number = 1");
                break;
            case '2' : // หากเป็นเลข 2
                System.out.println("Number = 2");
                break;
            default: // เหมือนคำสั่ง else
                System.out.println("Not Found");
        }
    }
    
}
