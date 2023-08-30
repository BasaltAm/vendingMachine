package operation;

import java.io.BufferedReader;
import java.io.IOException;

public class Ui {

  public static void intro() {
   System.out.println("(주) 부산외대 컴공과 자판기 입니다.");
  }

  public static void putMoney() {
   System.out.println("금액을 넣어주세요.");
  }



  public static void notEnoughMoney() {
   System.out.println("잔액이 부족합니다.");
   System.out.println("잔액이 반환되었습니다.");
  }
public static void menuList(String menu1,
                            String menu2,
                            String menu3,
                            String menu4,
                            String menu5,
                            String menu6,
                            String menu7,
                            String menu8){
    System.out.println("1. "+menu1);
    System.out.println("2. "+menu2);
    System.out.println("3. "+menu3);
    System.out.println("4. "+menu4);
    System.out.println("5. "+menu5);
    System.out.println("6. "+menu6);
    System.out.println("7. "+menu7);
    System.out.println("8. "+menu8);
}
  public static void comment(String itemName) {
   System.out.println("음료("+itemName+")가 나옵니다.");
  }

  public static void paymentComment(int goods){
   System.out.println("결제 금액은 " + goods + "원 입니다.");
  }
  public static void changeNotice(int left){
      System.out.println("거스름돈은 "+left+"원 입니다.");
      System.out.println("거스름돈이 반환 됩니다.");
      System.out.println("거스름돈이 반환 되었습니다.");
  }
 public static int putCash(BufferedReader br) throws IOException {
     return Integer.parseInt(br.readLine());
     }

}

