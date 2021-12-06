import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;


public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> Login = new HashMap<>();

        try {
            Scanner sc = new Scanner(new File("db.txt"));
            while (sc.hasNext()) {
                String UserID = sc.next();
                String UserPassWord = sc.next();
                Login.put(UserID, UserPassWord);
            }
            sc.close();
        }
        catch (Exception e) {e.printStackTrace();}

        System.out.println("id와 password 를 입력해주세요.");
        System.out.println("id : ");

        Scanner sc1 = new Scanner(System.in);
        String ID = sc1.next();
        ID = ID.trim();

        if (Login.containsKey(ID)) {
            System.out.println("password : ");

            sc1 = new Scanner(System.in);
            String PassWord = sc1.next();
            PassWord = PassWord.trim();

            if (Login.get(ID).contentEquals(PassWord)) {System.out.println("id와 비밀번호가 일치합니다.");}
            else {System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");}

        }
        else {System.out.println("입력하신 id는 존재하지 않습니다.");}
    }
}
