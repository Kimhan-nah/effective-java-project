package repository;

import model.Record;
import model.User;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryRecordRepository implements RecordRepository {
  private static Map<Long, Record> store = new HashMap<>();
  private static long sequence = 0L;

  @Override
  public Record save(Record record) {
    record.setId(++sequence);
    store.put(record.getId(), record);
    return record;
  }

  @Override
  public Optional<Record> findById(Long id) {
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public List<Record> findAll() {
    return new ArrayList<>(store.values());
  }

  @Override
  public List<Record> findAllByDate(Date date) {
    return store.values().stream()
        .filter(record -> record.getDate().equals(date))
        .collect(Collectors.toList());
  }

  @Override
  public List<Record> findAllByUser(User user) {
    // TODO equals 확인 필요
    return store.values().stream()
        .filter(record -> record.getUser().equals(user))
        .collect(Collectors.toList());
  }

  @Override
  public List<Record> findAllByType(Record.Type type) {
    // TODO equals 확인 필요
    return store.values().stream()
        .filter(record -> record.getType().equals(type))
        .collect(Collectors.toList());
  }
}
