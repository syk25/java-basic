package classes;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2","학생3"};
        int[] studentAges = {15, 18, 13};
        int[] studentGrades = {90, 60, 50};
        for (int i = 0; i < 3; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
