package factory;

import repository.MemoryRecordRepository;
import repository.RecordRepository;

public class MemoryRecordRepositoryFactory implements RecordRepositoryFactory {

  @Override
  public RecordRepository getRecordRepository() {
    return MemoryRecordRepository.getInstance();
  }
}
