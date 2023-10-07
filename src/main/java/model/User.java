package model;

/**
 * 이 클래스는 static factory method를 통해 객체를 생성한다.
 * User.of(String nickname);
 */
public class User {
  // static factory method를 통해 객체 생성하므로 private 생성자 -> 상속 허용 X
  private User() {}
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

  public static User of(String nickname) {
    User user = new User();
    user.nickname = nickname;
    return user;
  }
}
