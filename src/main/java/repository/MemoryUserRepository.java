package repository;

import model.User;

import java.util.*;

public class MemoryUserRepository implements UserRepository{
  private static Map<Long, User> store = new HashMap<>();
  private static long sequence = 0L;

  @Override
  public User save(User user) {
    user.setId(++sequence);
    store.put(user.getId(), user);
    return user;
  }

  @Override
  public Optional<User> findById(Long id) {
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public Optional<User> findByNickname(String nickname) {
    return store.values().stream()
        .filter(member -> member.getNickname().equals(nickname))
        .findAny();
  }

  @Override
  public List<User> findAll() {
    return new ArrayList<>(store.values());
  }
}
