import java.util.Scanner;
class Person{
    public String FIO;
    public String phone;
    private int Age;

    Person(String fio, String phone, int age){
        this.FIO = fio;
        this.Age = age;
        this.phone = phone;
    }

    public int getAge() {
        return Age;
    }
}

class Student extends Person{
    public int Kurs;
    public String Faculty;
    private int DataPost;

    Student(String fio, String phone, int age, int kurs, String faculty, int data){
        super(fio, phone, age);
        this.DataPost = data;
        this.Kurs = kurs;
        this.Faculty = faculty;
    }

    public int getDataPost() {
        return DataPost;
    }

    public String Display(){
        return "Студент: " + FIO + "; Возраст: " + getAge() + "; Телефон: " + phone + "; Курс: " + Kurs + "; Факультет: " + Faculty + "; Дата поступления: " + getDataPost();
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Попов А.И.", "79840000000", 22, 4, "ЭФ", 2019);
        students[1] = new Student("Гоголь П.К.", "77640000000", 20, 2, "ЭФ", 2022);
        students[2] = new Student("Виров О.Н.", "75430000000", 19, 1, "ЮФ", 2023);

        for (Student student: students){
            System.out.println("Студенты университета: " + student.Display());
        }

        Scanner in = new Scanner(System.in);

        System.out.println("Введите факультет для поиска: ");
        String fak = in.nextLine();
        System.out.println("Студенты данного факультета: " + fak);
        for (Student student: students) {
            if (student.Faculty.equals(fak)) {
                System.out.println(student.FIO);
            }
        }

        System.out.println("Введите год поступления: ");
        int year = in.nextInt();
        System.out.println("Студенты, поступившие после " + year + " года");
        for (Student student: students) {
            if (student.getDataPost() > year) {
                System.out.println(student.FIO);
            }
        }
    }
}