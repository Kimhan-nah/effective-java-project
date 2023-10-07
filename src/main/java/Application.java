import controller.Controller;
import model.Manager;
import repository.MemoryRecordRepository;
import repository.MemoryUserRepository;
import repository.RecordRepository;
import repository.UserRepository;


public class Application {
  public static void main(String[] args) {
    RecordRepository recordRepository = new MemoryRecordRepository();
    UserRepository userRepository = new MemoryUserRepository();
    Manager manager = new Manager(recordRepository, userRepository);
    Controller controller = new Controller(manager);
    controller.run();
  }
}
