package view;

import model.Record;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * <Item 4 : 인스턴스화를 막으려거든 private 생성자를 사용하라>
 * static method, static field만을 담은 class
 * instance 없이 사용
 * private constructor를 만들어서 컴파일러가 자동으로 default constructor 생성하지 않도록 하자!
 * abstract class와 달리 상속도 안 되므로 인스턴스화 완전히 막을 수 있다
 */
public class InputView {
  private static final Scanner scanner = new Scanner(System.in);
  private InputView() {}    // instance 생성 방지

  public static int inputMenu() throws IllegalArgumentException {
    OutputView.printMessage("▷ 입력(1/2/3/4/5): ");
    String str = scanner.nextLine().trim();
    int menu = Integer.parseInt(str);   // throws NumberFormatException

    if (menu < 1 || menu > 5) {
      throw new IllegalArgumentException("메뉴 입력이 잘못되었습니다.");
    }
    return menu;
  }
  public static String inputNickname() {
    OutputView.printMessage("▷ 입력: ");
    return scanner.nextLine().trim();
  }

  public static LocalDate inputDate() throws IllegalArgumentException {
    // yyyy/MM/dd
    OutputView.printMessage("▷ 입력(yyyy/mm/dd): ");
    String str = scanner.nextLine().trim();
    String[] split = str.split("/");

    if (split.length != 3) {
      throw new IllegalArgumentException("날짜 입력이 잘못되었습니다.");
    }
    return LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
  }

  public static Record.Type inputType() throws IllegalArgumentException {
//    EXERCISE, WAKEUP
    OutputView.printMessage("▷ 입력(1/2): ");
    int type = Integer.parseInt(scanner.nextLine().trim());   // throws NumberFormatException

    if (type < 0 || type > Record.Type.values().length) {
      throw new IllegalArgumentException("타입 입력이 잘못되었습니다.");
    }
    return Record.Type.values()[type - 1];
  }

}
