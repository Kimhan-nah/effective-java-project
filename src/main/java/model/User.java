package model;

public class User {
  private Long id;
  private String name;
  private String nickname;

  public User(Long id, String name, String nickname) {
    this.id = id;
    this.name = name;
    this.nickname = nickname;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getNickname() {
    return nickname;
  }
}
