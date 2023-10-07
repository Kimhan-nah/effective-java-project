package model;

import repository.RecordRepository;
import repository.UserRepository;
import view.InputView;
import view.OutputView;

import java.time.LocalDate;

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

    // 날짜 선택
    OutputView.printMessage("날짜를 입력해주세요.");
    LocalDate date = InputView.inputDate();

    // 이름 입력
    OutputView.printMessage("닉네임을 입력해주세요.");
    String nickname = InputView.inputNickname();
    // user 없으면 생성
    if (userRepository.findByNickname(nickname).isEmpty()) {
      userRepository.save(new User(nickname));
    }

    // type 입력
    OutputView.printMessage("타입을 입력해주세요. 1. 운동 2. 기상");
    Record.Type type = InputView.inputType();

    // 데이터 추가
    // TODO Exception 처리 -> 일어나진 않겠지만..
    Record save = recordRepository.save(new Record(date, userRepository.findByNickname(nickname).get(), type));
    OutputView.printMessage("데이터 추가 완료");
    OutputView.printMessage(save.getId() + " " + save.getDate() + " " + save.getUser().getNickname() + " " + save.getType());

  }
}
