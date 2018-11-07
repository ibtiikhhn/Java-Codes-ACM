import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class MainClass {

    int a = 0;
    double doublee = 8.0;

    public static void main(String[] args) {

        /*Student student = Student.getInstance();
        Student newStudent = Student.getInstance();*/

/*
        int result = sum(4, 6);

        double resultDouble = sum(4.45, 6.45);

        System.out.println("The sum of ints is : " + result);
        System.out.println("The sum of doubles is : " + resultDouble);

    }

    public static int sum(int a, int b) {
        int c = a + b;
//        return a + b;
        return c;
    }



    public static double sum(double a, double b) {
        return a + b;
    }*/

/*
        int[] array = {2, 6, 74, 3, 2};

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("ALi"));
        list.add(new Student("AMMIER"));

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {

            Student student = iterator.next();
            student.getDepartment();
            System.out.println(iterator.next().getName()
                    + " : " + iterator.next().getDepartment());
        }*/
/*
        for (Student student:list) {
            System.out.println(student.getName());
        }*/

        int myValue = Integer.parseInt(new Scanner(System.in).next());

        switch (myValue) {
            case 4:
                System.out.println("The value is 4");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 5:
                System.out.println("The value is 5");
                break;
            default:
                System.out.println("No such value exists");
                break;
        }





    }
}
