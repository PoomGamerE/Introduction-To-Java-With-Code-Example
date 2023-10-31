package work01;
public final class Tool {
    private Tool() { }
    public static double median(double d0, double d1, double d2) {
        if (d0 < d1 && d0 > d2 || d0 > d1 && d0 < d2)
            return d0;
        if (d0 < d1 && d1 < d2 || d0 > d1 && d1 > d2)
            return d1;
        return d2;
    }
    public static double compute(double d0, double d1, String operation) {
         return switch (operation) {
            case "sum", "add", "plus" -> d0+d1;
            case "multiply", "times", "product" -> d0*d1;
            default -> throw new RuntimeException("Invalid Operation");
        };
    }
    public static int digitProduct(int value) {
        if (value < 0) return -1; // guard
        int product = 1;
        while (value > 0) {
            int rem = value % 10;
            if (rem != 0) product *= rem;
            value /= 10;
        }
        return product;
    }
}


//*********************************************
package work02;
public class FriendList {
    private final String name;
    private FriendList next;
    private FriendList(String name) { this.name = name; }
    public static FriendList newList() { return new FriendList(""); }
    public boolean addFriend(String name) {
        /*
        It returns "false" if "name" is null or a blank string or 
        this "name" has already existed in its "name" field of itself, 
        its "next", or its "next" of "next" ...
        Otherwise, it will create a new "FriendList" object with that "name" 
        and put it in the "next" field of the last "FriendList".
        */
        if (name == null || name.isBlank()) return false; // guard
        var current = this;
        while (current.next != null) {
            current = current.next;
            if (current.name.equals(name)) return false;
        }
        current.next = new FriendList(name);
        return true;
    }
    
    @Override
    public String toString() {
        /* this method returns a "String" containing "name" of 
        all "FriendList" object in all the "next" fields */
        var sb = new StringBuilder();
        var current = this.next;
        while (current != null) {
            sb.append(current.name).append(":");
            current = current.next;
        }
        return sb.toString();
    }
}
