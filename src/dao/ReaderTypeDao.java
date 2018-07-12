package dao;

import domain.ReaderType;

import java.util.List;

public interface ReaderTypeDao {

    public List<ReaderType> getAllReaderType();

    public ReaderType getTypeById(ReaderType readerType);

    public ReaderType updateReaderType(ReaderType updateReaderType);

    public boolean addReaderType(ReaderType readerType);

    public ReaderType getTypeByName(ReaderType type);
}
