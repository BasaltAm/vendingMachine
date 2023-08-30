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

  public static void selectMenu() {
   System.out.println("음료를 선택해주세요.");
   System.out.println("1.콜라");
   System.out.println("2.환타");
   System.out.println("3.핫식스");
   System.out.println("4.물");
   System.out.println("5.레쓰비");
   System.out.println("6.오로나민씨");
   System.out.println("7.이프로");
   System.out.println("8.실론티");
  }

  public static void notEnoughMoney() {
   System.out.println("잔액이 부족합니다.");
   System.out.println("잔액이 반환되었습니다.");
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

