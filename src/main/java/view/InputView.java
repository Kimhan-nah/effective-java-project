package view;

import model.Record;

import java.time.LocalDate;
import java.util.Scanner;

public class InputView {
  private static final Scanner scanner = new Scanner(System.in);
  private InputView() {}

  // TODO 입력에 대한 예외처리 필요!!!!!!!!!
  public static String inputMenu() {
    System.out.print("\t\t\t\t\t\t\t▷ 입력(1/2/3/4/5): ");
    return scanner.nextLine();
  }
  public static String inputNickname() {
    System.out.print("\t\t\t\t\t\t\t▷ 입력: ");
    return scanner.nextLine();
  }

  public static LocalDate inputDate() {
    // yyyy/MM/dd
    System.out.print("\t\t\t\t\t\t\t▷ 입력(yyyy/mm/dd): ");
    String str = scanner.nextLine();
    String[] split = str.split("/");
    return LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
  }

  public static Record.Type inputType() {
//    EXERCISE, WAKEUP
    System.out.print("\t\t\t\t\t\t\t▷ 입력(1/2): ");
    String str = scanner.nextLine();
    return Record.Type.values()[Integer.parseInt(str) - 1];
  }

}
