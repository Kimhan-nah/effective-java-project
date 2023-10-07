package view;

public class OutputView {
  private OutputView() {}

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

  public static void printMessage(String message) {
    System.out.println("\t\t\t\t\t\t\t" + message);
  }
}
