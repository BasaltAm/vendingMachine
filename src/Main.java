import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static operation.Ui.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Drink drink = new Drink();
        String menu1 = drink.setMenu("콜라");
        String menu2 = drink.setMenu("사이다");
        String menu3 = drink.setMenu("실론티");
        String menu4 = drink.setMenu("삼다수");
        String menu5 = drink.setMenu("레쓰비");
        String menu6 = drink.setMenu("이프로");
        String menu7 = drink.setMenu("오로나민씨");
        String menu8 = drink.setMenu("환타");
        while (true) {
            intro();
            menuList(menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8);
            int select = Integer.parseInt(br.readLine());
            PaymentMethod.extracted(br, select);
        }
    }
}