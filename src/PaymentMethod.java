import java.io.BufferedReader;
import java.io.IOException;

import static operation.Ui.*;

public class PaymentMethod {

    public static void extracted(BufferedReader br, int select) throws IOException {
        Drink drink = new Drink("콜라",
                "환타",
                "핫식스",
                "물",
                "레쓰비",
                "오로나민씨",
                "이프로",
                "실론티");

        Price price = new Price(1200,
                1200,
                800,
                500,
                500,
                700,
                1000,
                700);
        int goods;

        if (select == 1) {
            String itemName = drink.menuOne;
            goods = price.menuOnePrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuOnePrice) {
                notEnoughMoney();
            } else if (put > price.menuOnePrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }if (select == 2) {
            String itemName = drink.menuTwo;
            goods = price.menuTwoPrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuTwoPrice) {
                notEnoughMoney();
            } else if (put > price.menuTwoPrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }if (select == 3) {
            String itemName = drink.menuThree;
            goods = price.menuThreePrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuThreePrice) {
                notEnoughMoney();
            } else if (put > price.menuThreePrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }if (select == 4) {
            String itemName = drink.menuFour;
            goods = price.menuFourPrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuFourPrice) {
                notEnoughMoney();
            } else if (put > price.menuFourPrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }if (select == 5) {
            String itemName = drink.menuFive;
            goods = price.menuFivePrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuFivePrice) {
                notEnoughMoney();
            } else if (put > price.menuFivePrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }if (select == 6) {
            String itemName = drink.menuSix;
            goods = price.menuSixPrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuSixPrice) {
                notEnoughMoney();
            } else if (put > price.menuSixPrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }if (select == 7) {
            String itemName = drink.menuSeven;
            goods = price.menuSevenPrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuSevenPrice) {
                notEnoughMoney();
            } else if (put > price.menuSevenPrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }if (select == 8) {
            String itemName = drink.menuEight;
            goods = price.menuEightPrice;
            putMoney();
            int put = putCash(br);
            if (put < price.menuEightPrice) {
                notEnoughMoney();
            } else if (put > price.menuEightPrice) {
                paymentComment(goods);
                comment(itemName);
                int left = put - goods;
                changeNotice(left);
            } else {
                comment(itemName);
                paymentComment(goods);
            }
        }

    }
}
