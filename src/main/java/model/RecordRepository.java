package model;

import java.util.List;
import java.util.Optional;

public interface RecordRepository {
  Record save(Record record);
  Optional<Record> findById(Long id);
  Optional<Record> findByName(String name);
  List<Record> findAll();
}
