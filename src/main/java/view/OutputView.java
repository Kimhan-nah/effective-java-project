package view;

/**
 * <Item 4 : 인스턴스화를 막으려거든 private 생성자를 사용하라>
 * static method, static field만을 담은 class
 * instance 없이 사용
 * private constructor를 만들어서 컴파일러가 자동으로 default constructor 생성하지 않도록 하자!
 * abstract class와 달리 상속도 안 되므로 인스턴스화 완전히 막을 수 있다
 */
public class OutputView {
  private static final String red = "\u001B[31m";
  private static final String reset = "\u001B[0m";
  private OutputView() {}   // instance 생성 방지

  public static void printMain() {
    System.out.println();
    System.out.println("\t\t\t\t\t\t\t==============================================");
    System.out.println("\t\t\t\t\t\t\t ▒▒▒    SIST TODAY LUNCH [관리자 모드]   ▒▒▒ ");
    System.out.println("\t\t\t\t\t\t\t==============================================");
    System.out.println();
    System.out.print("\t\t\t\t\t\t\t┌");
    for(int i = 0; i < 43; i++) System.out.print("─");
    System.out.print("┐\n");
    System.out.println("\t\t\t\t\t\t\t│\t\t\t\t1. 데이터  추가\t\t\t\t│");
    System.out.println("\t\t\t\t\t\t\t│\t\t\t\t2. 데이터  수정\t\t\t\t│");
    System.out.println("\t\t\t\t\t\t\t│\t\t\t\t3. 데이터  삭제\t\t\t\t│");
    System.out.println("\t\t\t\t\t\t\t│\t\t\t\t4. 데이터  조회\t\t\t\t│");
    System.out.println("\t\t\t\t\t\t\t│\t\t\t\t5. 프로그램 종료\t\t\t\t│");

    System.out.print("\t\t\t\t\t\t\t└");
    for(int i = 0; i < 43; i++) System.out.print("─");
    System.out.print("┘\n");
  }

  public static void printlnMessage(String message) {
    System.out.println("\t\t\t\t\t\t\t" + message);
  }

  public static void printMessage(String message) {
    System.out.print("\t\t\t\t\t\t\t" + message);
  }

  public static void printErrorMessage(String message) {
    System.out.println("\t\t\t\t\t\t\t" + red + message + reset);
  }
}
