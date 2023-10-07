package model;

import java.time.LocalDate;

public class Record {

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
