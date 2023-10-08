import controller.Controller;
import model.Manager;
import repository.MemoryRecordRepository;
import repository.MemoryUserRepository;
import repository.RecordRepository;
import repository.UserRepository;


public class Application {
  public static void main(String[] args) {
    RecordRepository recordRepository = MemoryRecordRepository.getInstance();
    UserRepository userRepository = MemoryUserRepository.getInstance();
    Manager manager = Manager.of(recordRepository, userRepository);
    Controller controller = Controller.of(manager);
    controller.run();
  }
}
