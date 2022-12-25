public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("test/", "test8", "test");
        if (success) {
            System.out.println("Домашка 1!");
            System.out.println("Данные корректные!");
            } else {
            System.out.println("Данные не корректные!");
        }
    }
}