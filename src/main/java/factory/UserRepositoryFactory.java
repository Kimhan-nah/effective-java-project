package factory;

import repository.UserRepository;

public interface UserRepositoryFactory {
  UserRepository getUserRepository();
}
