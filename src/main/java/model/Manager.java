package model;

import repository.RecordRepository;
import repository.UserRepository;
import view.OutputView;

public class Manager {
  // TODO final? static? 생각해보기
  private final RecordRepository recordRepository;
  private final UserRepository userRepository;

  public Manager(RecordRepository recordRepository, UserRepository userRepository) {
    this.recordRepository = recordRepository;
    this.userRepository = userRepository;
  }

  public void addData() {
    OutputView.printMessage("데이터 추가");
    // Repository 테스트
    // TODO 로직 추가
    // 날짜 선택
    // 이름 입력
    // 데이터 추가
  }
}
