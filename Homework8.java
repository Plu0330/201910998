import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Map<String, String> login = new HashMap<>();

        login.put("myId", "myPass");
        login.put("myId2", "myPass2");
        login.put("myId3", "myPass3");

        System.out.println("id와 password를 입력해주세요");
        System.out.printf("id : ");

        Scanner sc1 = new Scanner(System.in);

        String id = sc1.next();
        id = id.trim();

        if (login.containsKey(id)) {
            System.out.printf("password : ");

            Scanner sc2 = new Scanner(System.in);
            String password = sc2.next();
            password = password.trim();

            if (login.get(id).contentEquals(password)) {System.out.println("id와 비밀번호가 일치합니다.");}
            else {System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");}
        }

        else {System.out.println("입력하신 id는 존재하지 않습니다.");}
    }
}