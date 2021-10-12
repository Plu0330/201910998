import java.util.Scanner;


class Str_input {
    public static void main(String[] args) {
        int count;
        int[] NumSet;
        int MaxNum = 0;
        int MinNum = 2147483647;

        System.out.println("몇 개의 수를 입력할 예정인가요?");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        NumSet = new int[count];

        System.out.println("수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {NumSet[i] = sc.nextInt();}

        for (int i = 0; i < count; i++) {
            if (MaxNum < NumSet[i]) {
                MaxNum = NumSet[i];
            }
        }
        for (int i = 0; i < count; i++) {
            if (MinNum > NumSet[i]) {
                MinNum = NumSet[i];
            }
        }

        NumSet[0] = MaxNum;
        System.out.println("최대값: " + NumSet[0]);
        NumSet[0] = MinNum;
        System.out.println("최소값: " + NumSet[0]);
    }
}