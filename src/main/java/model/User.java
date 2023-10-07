package model;

public class User {
  private Long id;    // primary key
  private String nickname;  // unique

  // TODO 생성자... 생각해보기
  public User(String nickname) {
    this.nickname = nickname;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
}
