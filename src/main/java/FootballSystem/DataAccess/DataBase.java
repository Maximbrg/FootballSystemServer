package FootballSystem.DataAccess;

import java.sql.SQLException;
import java.util.*;
public interface DataBase <T> {
//טטטc
        Object get(long id);

        List<T> getAll();

        void save(T t) throws SQLException;

        void update(T t, String[] params);

        void delete(T t);
    }

