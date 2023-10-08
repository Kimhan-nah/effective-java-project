package repository;

import model.Record;
import model.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

// TODO Transaction 확인 필요
public interface RecordRepository {
  Record save(Record record);
  Optional<Record> findById(Long id);
  List<Record> findAll();
  List<Record> findAllByDate(LocalDate date);
  List<Record> findAllByUser(User user);
  List<Record> findAllByType(Record.Type type);

  // TODO delete, update
}
