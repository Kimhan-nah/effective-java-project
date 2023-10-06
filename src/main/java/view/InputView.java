package view;

import java.util.Scanner;

public class InputView {
  private static final Scanner scanner = new Scanner(System.in);
  private InputView() {}
  public static String inputMenu() {
    System.out.println("## 메뉴를 입력하세요.");
    System.out.print("\t\t\t\t\t\t\t▷ 입력: ");
    return scanner.nextLine();
  }
}
