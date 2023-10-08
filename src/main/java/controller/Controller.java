package controller;

import model.Manager;
import view.InputView;
import view.OutputView;

public class Controller {
  private final Manager manager;

  // 싱글톤 패턴
  private Controller(Manager manager) {
    this.manager = manager;
  }
  // static factory method
  public static Controller of(Manager manager) {
    return new Controller(manager);
  }


  public void run() {
    label:
    while (true) {
      OutputView.printMain();
      int input;
      try {
        input = InputView.inputMenu();
      } catch (NumberFormatException e) {
        OutputView.printErrorMessage("잘못된 입력입니다.");
        continue;
      } catch (IllegalArgumentException e) {
        OutputView.printErrorMessage(e.getMessage());
        continue;
      }
      switch (input) {
        case 1:
          manager.addData();
          break;
        case 2:
          OutputView.printlnMessage("데이터 수정");
          break;
        case 3:
          OutputView.printlnMessage("데이터 삭제");
          break;
        case 4:
          manager.searchData();
          break;
        case 5:
          OutputView.printlnMessage("프로그램 종료");
          break label;
      }

      }
  }
}
