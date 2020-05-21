package FootballSystem.DataAccess;

import FootballSystem.System.FootballObjects.LeagueInformation;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class LeagueInformationSQL implements DataBase<LeagueInformation> {
    private static LeagueInformationSQL ourInstance = new LeagueInformationSQL();

    public static LeagueInformationSQL getInstance() {
        return ourInstance;
    }

    private LeagueInformationSQL() {
    }

    @Override
    public String get(long id) {
        return null;
    }


    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public void save(LeagueInformation leagueInformation) throws SQLException {

    }

    @Override
    public void update(LeagueInformation leagueInformation, String[] params) {

    }

    @Override
    public void delete(LeagueInformation leagueInformation) {

    }
}
