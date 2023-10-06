package model;

import java.util.Date;

public class Record {

  // TODO Enum 정의 -> abstract class 분리
  private enum Type {
    EXERCISE, WAKEUP
  }
  private Long id;
  private Date date;
  private User user;
  private Type type;

  public Record(Long id, Date date, User user, Type type) {
    this.id = id;
    this.date = date;
    this.user = user;
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public Date getDate() {
    return date;
  }

  public User getUser() {
    return user;
  }

  public Type getType() {
    return type;
  }
}
