package factory;

import repository.RecordRepository;

public interface RecordRepositoryFactory {
  RecordRepository getRecordRepository();
}
