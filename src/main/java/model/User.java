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
  private String email ;
  private Builder.Gender gender;

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

  // builder pattern
  public static class Builder {
    public enum Gender { MALE, FEMALE }
    // 필수 매개변수
    private Long id;
    private String nickname;
    // 선택 매개변수
    private String email = null;
    private Gender gender = null;

    public Builder(String nickname) {
      this.nickname = nickname;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder gender(Gender gender) {
      this.gender = gender;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
  private User(Builder builder) {
    this.nickname = builder.nickname;
    this.email = builder.email;
    this.gender = builder.gender;
  }
}
