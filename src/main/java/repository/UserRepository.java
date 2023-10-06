package repository;

import model.User;

import java.util.List;
import java.util.Optional;

// TODO Transaction 확인 필요
public interface UserRepository {
  User save(User user);
  Optional<User> findById(Long id);
  Optional<User> findByNickname(String nickname);
  List<User> findAll();
  // TODO delete, update
}
