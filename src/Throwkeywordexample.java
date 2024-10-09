public class  Throwkeywordexample {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18){
            System.out.println("Access Denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old Enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(21);
    }
}




















