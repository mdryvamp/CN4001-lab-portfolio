public class Week2Lab1_1 {
    public static void main(String[] args) {
        String name = "Sara";
        int age = 19;
        int year = 2;
        double gpa = 3.75;
        char section = 'B';
        boolean enrolled = true;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("GPA: " + gpa);
        System.out.println("Section: " + section);
        System.out.println("Enrolled: " + enrolled);
        System.out.println(); 

        String profile = "Name: " + name + " | " + "Age: " + age + " | " + "Year: " + year + " | " + "GPA: " + gpa + " | " + "Section: " + section + " | " + "Enrolled: " + enrolled;
        System.out.println(profile);

        System.out.println();

        System.out.println("Age: " + age + 1);

        System.out.println("Age: " + (age + 1));
    }
}