
public class AccessModifierExample {

    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;        // default access
    private int privateVar = 40;

    public void display() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
    }

    public static void main(String[] args) {

        AccessModifierExample obj = new AccessModifierExample();
        obj.display();
    }
}
