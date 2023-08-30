import java.io.BufferedReader;
import java.io.IOException;

import static operation.Ui.*;


public class PaymentMethod {

    public static void extracted(BufferedReader br, int select) throws IOException {
        Drink drink = new Drink();


        Price price = new Price();


        if (select == 1) {
            String itemName = drink.setMenu("콜라");
            price.setMenuPrice(1200);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }if (select == 2) {
            String itemName = drink.setMenu("사이다");
            price.setMenuPrice(800);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }if (select == 3) {
            String itemName = drink.setMenu("실론티");
            price.setMenuPrice(500);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }if (select == 4) {
            String itemName = drink.setMenu("삼다수");
            price.setMenuPrice(500);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }if (select == 5) {
            String itemName = drink.setMenu("레쓰비");
            price.setMenuPrice(700);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }if (select == 6) {
            String itemName = drink.setMenu("이프로");
            price.setMenuPrice(700);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }if (select == 7) {
            String itemName = drink.setMenu("오로나민씨");
            price.setMenuPrice(1000);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }if (select == 8) {
            String itemName = drink.setMenu("환타");
            price.setMenuPrice(1000);
            putMoney();
            int put = putCash(br);
            if (put < price.getMenuPrice()) {
                notEnoughMoney();
            } else if (put > price.getMenuPrice()) {
                paymentComment(price.getMenuPrice());
                comment(itemName);
                int left = put - price.getMenuPrice();
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(price.getMenuPrice());
            }
        }

    }
}
