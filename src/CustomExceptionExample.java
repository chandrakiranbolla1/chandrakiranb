public class CustomExceptionExample {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age<0){
            throw  new InvalidAgeException("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-15);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}