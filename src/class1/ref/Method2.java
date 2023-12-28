package class1.ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1",15, 90); // 변수에 참조값 대입
        Student student2 = createStudent("학생2",16, 80);

        printStudent(student1);
        printStudent(student2);

    }
    static void printStudent(Student student){
        System.out.printf("학생이름: %s, 나이: %d, 성적: %d\n", student.name, student.age, student.grade);
    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // 객체 생성 + 필드 초기화 후 그 객체의 참조값을 반환
    }
}
