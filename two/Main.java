package two;

public class Main {
    public static void main(String[] args) {
        Customer student = new Customer("Cyriljosh", "Student", 500.00);
        Customer senior = new Customer("Roberto", "Senior Citizen", 500.00);
        Customer regular = new Customer("Juan", "Regular", 500.00);
    
        System.out.println("Student's Final Price: " + student.getFinalPrice());
        System.out.println("Senior Citizen's Final Price: " + senior.getFinalPrice());
        System.out.println("Regular Customer's Final Price: " + regular.getFinalPrice());
    }
}
