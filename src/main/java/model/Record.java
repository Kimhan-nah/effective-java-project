package model;

import java.time.LocalDate;

/**
 * 이 클래스는 static factory method를 통해 객체를 생성한다.
 * Record.of(LocalDate date, User user, Type type);
 */
public class Record {
  // static factory method를 통해 객체 생성하므로 private 생성자 -> 상속 허용 X
  private Record() {}

  // TODO Enum 정의 -> abstract class 분리..hmm..
  public enum Type {    // 일단 임시로 public enum으로 정의
    EXERCISE, WAKEUP
  }
  private Long id;    // primary key
  private LocalDate date;
  private User user;
  private Type type;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  /**
   * static factory method
   * 매개변수를 받아서 정적 객체 반환
   */
  public static Record of(LocalDate date, User user, Type type) {
    Record record = new Record();
    record.date = date;
    record.user = user;
    record.type = type;
    return record;
  }

  // TODO toString(),equals override...?
}
