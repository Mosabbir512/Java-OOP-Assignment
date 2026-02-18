

class Bank {
    int getRateOfInterest() {
        return 5;
    }
}

class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Bank obj = new SBI();
        System.out.println("Rate of Interest: " + obj.getRateOfInterest());
    }
}
