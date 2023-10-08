import controller.Controller;
import factory.MemoryRecordRepositoryFactory;
import factory.MemoryUserRepositoryFactory;
import factory.RecordRepositoryFactory;
import factory.UserRepositoryFactory;
import model.Manager;
import repository.MemoryRecordRepository;
import repository.MemoryUserRepository;
import repository.RecordRepository;
import repository.UserRepository;


public class Application {
  public static void main(String[] args) {
    RecordRepositoryFactory recordRepositoryFactory = new MemoryRecordRepositoryFactory();
    UserRepositoryFactory userRepositoryFactory = new MemoryUserRepositoryFactory();

    Manager manager = Manager.of(recordRepositoryFactory, userRepositoryFactory);
    Controller controller = Controller.of(manager); // 의존 객체 주입하면 싱글톤과 다르다는 거...? 같은 싱글톤 아닌감
    controller.run();
  }
}
