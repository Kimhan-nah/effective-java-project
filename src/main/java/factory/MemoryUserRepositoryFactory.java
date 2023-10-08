package factory;

import repository.MemoryUserRepository;
import repository.UserRepository;

public class MemoryUserRepositoryFactory implements UserRepositoryFactory {
  @Override
  public UserRepository getUserRepository() {
    return MemoryUserRepository.getInstance();
  }
}
