package repository;

import model.Record;
import model.User;

import java.util.List;
import java.util.Optional;

// TODO Transaction 확인 필요
public interface RecordRepository {
  Record save(Record record);
  Optional<Record> findById(Long id);
  List<Record> findAll();
  List<Record> findAllById(Long id);
  List<Record> findAllByUser(User user);
  List<Record> findAllByType(String type);
  // TODO delete, update
}
