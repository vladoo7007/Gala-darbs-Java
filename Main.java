import java.util.Scanner;

class Person {
    String firstName, lastName, country;
    int age;
    double height, weight, income;
    boolean likesToProgram;

    public Person(String firstName, String lastName, int age, double height, double weight, String country, double income, boolean likesToProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.country = country;
        this.income = income;
        this.likesToProgram = likesToProgram;
    }

    public void printInfo() {
        System.out.println("--- Person Information ---");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " years (" + (age * 365) + " days)");
        System.out.println("Height: " + height + " m (" + (height * 100) + " cm)");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Country: " + country);
        System.out.println("Monthly Income: " + income + " EUR");
        System.out.println("Yearly Income: " + (income * 12) + " EUR");
        System.out.println("Likes to Program: " + (likesToProgram ? "Yes" : "No"));
        calculateBMI();
        checkIncome();
    }

    private void calculateBMI() {
        if (height <= 0 || weight <= 0) {
            System.out.println("Invalid height or weight for BMI calculation.");
            return;
        }
        
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f - ", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
    

    private void checkIncome() {
        if (income < 1000) {
            System.out.println("Your income is below average.");
        }
        if (country.equalsIgnoreCase("Latvia")) {
            System.out.println("You live in Latvia. The average income here is around 1500 EUR.");
        }
    }
}

class Student extends Person {
    String studyProgram;

    public Student(String firstName, String lastName, int age, double height, double weight, String country, double income, boolean likesToProgram, String studyProgram) {
        super(firstName, lastName, age, height, weight, country, income, likesToProgram);
        this.studyProgram = studyProgram;
    }

    public void studyInfo() {
        System.out.println("Study Program: " + studyProgram);
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String firstName, lastName, country, studyProgram;
            int age;
            double height, weight, income;
            boolean likesToProgram;
            
            while (true) {
                System.out.println("Enter your first name:");
                firstName = scanner.nextLine().trim();
                System.out.println("Enter your last name:");
                lastName = scanner.nextLine().trim();

                while (true) {
                    System.out.println("Enter your age:");
                    if (scanner.hasNextInt()) {
                        age = scanner.nextInt();
                        if (age > 0) break;
                    }
                    scanner.nextLine();
                    System.out.println("Invalid input. Age must be a positive integer.");
                }
                
                while (true) {
                    System.out.println("Enter your height in meters:");
                    if (scanner.hasNextDouble()) {
                        height = scanner.nextDouble();
                        if (height > 0) break;
                    }
                    scanner.nextLine();
                    System.out.println("Invalid input. Height must be a positive number.");
                }
                
                while (true) {
                    System.out.println("Enter your weight in kg:");
                    if (scanner.hasNextDouble()) {
                        weight = scanner.nextDouble();
                        if (weight > 0) break;
                    }
                    scanner.nextLine();
                    System.out.println("Invalid input. Weight must be a positive number.");
                }
                scanner.nextLine();

                System.out.println("Enter your country:");
                country = scanner.nextLine().trim();
                
                while (true) {
                    System.out.println("Enter your monthly income in EUR:");
                    if (scanner.hasNextDouble()) {
                        income = scanner.nextDouble();
                        if (income >= 0) break;
                    }
                    scanner.nextLine();
                    System.out.println("Invalid input. Income must be a non-negative number.");
                }
                scanner.nextLine();
                
                System.out.println("Do you like programming? (yes/no):");
                likesToProgram = scanner.nextLine().trim().equalsIgnoreCase("yes");
                
                System.out.println("Enter your study program:");
                studyProgram = scanner.nextLine().trim();
                
                Student student = new Student(firstName, lastName, age, height, weight, country, income, likesToProgram, studyProgram);
                student.printInfo();
                student.studyInfo();
                
                System.out.println("Do you want to enter another person? (yes/no)");
                if (!scanner.nextLine().trim().equalsIgnoreCase("yes")) break;
            }
        } // Scanner will be closed automatically
    }
}
