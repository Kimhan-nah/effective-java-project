package controller;

import view.InputView;
import view.OutputView;

public class Controller {

  public static void run() {
    label:
    while (true) {
      OutputView.printMain();
      String input = InputView.inputMenu();
      switch (input) {
        case "1":
          OutputView.printMessage("데이터 추가");
          break;
        case "2":
          OutputView.printMessage("데이터 수정");
          break;
        case "3":
          OutputView.printMessage("데이터 삭제");
          break;
        case "4":
          OutputView.printMessage("데이터 조회");
          break;
        case "5":
          OutputView.printMessage("프로그램 종료");
          break label;
        default:
          OutputView.printMessage("잘못된 입력입니다.");
          break;
      }

      }
  }
}
