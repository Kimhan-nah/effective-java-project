package model;

import repository.RecordRepository;
import repository.UserRepository;
import view.InputView;
import view.OutputView;

import java.time.LocalDate;
import java.util.List;

public class Manager {
  private final RecordRepository recordRepository;
  private final UserRepository userRepository;

  // 싱글톤 패턴
  private Manager(RecordRepository recordRepository, UserRepository userRepository) {
    this.recordRepository = recordRepository;
    this.userRepository = userRepository;
  }

  // static factory method
  public static Manager of(RecordRepository recordRepository, UserRepository userRepository)
  { return new Manager(recordRepository, userRepository); }

  public void addData() {
    OutputView.printlnMessage("데이터 추가");
    LocalDate date;
    String nickname;
    Record.Type type;

    try {
      // 날짜 선택
      OutputView.printlnMessage("날짜를 입력해주세요.");
      date = InputView.inputDate();

      // 이름 입력
      OutputView.printlnMessage("닉네임을 입력해주세요.");
      nickname = InputView.inputNickname();
      // user 없으면 생성
      if (userRepository.findByNickname(nickname).isEmpty()) {
        userRepository.save(User.of(nickname));
      }

      // type 입력
      OutputView.printlnMessage("타입을 입력해주세요. 1. 운동 2. 기상");
      type = InputView.inputType();
    } catch (IllegalArgumentException e) {
      OutputView.printErrorMessage(e.getMessage());
      return;
    }

    // 데이터 추가
    // TODO Exception 처리 -> 일어나진 않겠지만..
    Record save = recordRepository.save(Record.of(date, userRepository.findByNickname(nickname).get(), type));
    OutputView.printlnMessage("데이터 추가 완료");
    OutputView.printlnMessage(save.getId() + " " + save.getDate() + " " + save.getUser().getNickname() + " " + save.getType());

  }

  public void searchData() {
    OutputView.printlnMessage("데이터 조회");

    // 이름 입력
    OutputView.printlnMessage("닉네임을 입력해주세요.");
    String nickname = InputView.inputNickname();

    // 데이터 조회
    User user = userRepository.findByNickname(nickname).isPresent() ? userRepository.findByNickname(nickname).get() : null;
    if (user == null) {
      OutputView.printlnMessage("해당 닉네임의 유저가 존재하지 않습니다.");
      return;
    }
    List<Record> records = recordRepository.findAllByUser(user);
    OutputView.printlnMessage("데이터 조회 완료");
    for (Record record : records) {
      OutputView.printlnMessage(record.getId() + " " + record.getDate() + " " + record.getUser().getNickname() + " " + record.getType());
    }
  }
}
