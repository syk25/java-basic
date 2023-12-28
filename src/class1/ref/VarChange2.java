package class1.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        // 1
        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // 2. dataA 변경
        dataA.value = 20;
        System.out.println();
        System.out.println("dataA.value = 20 >>>");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // 3. dataB 변경
        dataB.value = 30;
        System.out.println();
        System.out.println("dataB.value = 30 >>>");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
