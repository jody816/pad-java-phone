package model;

import view.Phone;

public class Apple implements Phone {

  private final static String PURCHASE_COMMENT = "이/가 애플폰을 구매했습니다.";
  private final static String TURN_ON = "이/가 애플폰을 켰습니다.";
  private final static String LOADING = "@@@ 폰 켜지는 중 @@@\n";

  private String userName;

  public Apple(String userName) {
    this.userName = userName;
    purchasePhone();
  }

  @Override
  public void purchasePhone() {
    System.out.println(userName + PURCHASE_COMMENT);
  }

  @Override
  public void turnOn() {
    System.out.println(userName + TURN_ON);
  }

  @Override
  public void loading() {
    System.out.println(LOADING);
  }
}
