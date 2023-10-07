package model;

public class User {
  private Long id;    // primary key
  private String nickname;  // unique

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

  // SECTION static factory method
  public static User of(String nickname) {
    User user = new User();
    user.nickname = nickname;
    return user;
  }
}
