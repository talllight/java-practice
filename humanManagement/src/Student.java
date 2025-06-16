import  java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> courses;

    public Student()
    {
//        this.id = "";
//        this.name = "";
//        this.status = "";
//        this.birthDate = "";
//        this.contact = "";
        super();
        this.courses = new ArrayList<>();
    }

    public Student(String id, String name, String status, String birthDate, String contact)
    {
        super(id, name, status,  birthDate, contact);
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course)
    {
        courses.add(course);
    }

    public void printInfo()
    {
        super.printInfo();
        printCourse();
    }

    public void printCourse()
    {
        super.printInfo();
        System.out.println("수강 교과목 목록");
        if(courses.isEmpty())
            System.out.println("없음");
        else
            for(String course : courses)
                System.out.println(course);
    }
//    private String id;
//    private String name;
//    private String status;
//    private String birthDate;
//    private String contact;
//    private ArrayList<String> courses;
//
//    public Student()
//    {
//        id = "";
//        name = "";
//        status = "";
//        birthDate = "";
//        contact = "";
//        courses = new ArrayList<>();
//    }
//
//    public Student(String id, String name, String status, String birthDate, String contact)
//    {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthDate = birthDate;
//        this.contact = contact;
//        courses = new ArrayList<>();
//    }
//
//    public void setStudent(String id, String name, String status, String birthDate, String contact)
//    {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthDate = birthDate;
//        this.contact = contact;
//    }
//
//    public void addCourse(String courseName)
//    {
//        this.courses.add(courseName);
//    }
//
//    public void printInfo()
//    {
//        System.out.println("ID: " + id);
//        System.out.println("Name: " + name);
//        System.out.println("Status: " + status);
//        System.out.println("Birth Date: " + birthDate);
//        System.out.println("Contact: " + contact);
//
//
//    }
//
//    public void  printCourses()
//    {
//        if(courses.isEmpty())
//            System.out.println("없음");
//        else
//            for(String  course : courses)
//                System.out.println(course);
//    }
}