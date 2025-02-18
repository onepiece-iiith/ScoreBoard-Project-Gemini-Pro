package TableViewFiles;

import java.util.Objects;

public class TableBowler {

    private final String bowlerName;
    private final String bowlerOver;
    private final String maidenOver;
    private final String runGiven;
    private final String wicketTaken;
    private final String wideBall;
    private final String noBall;
    private final String economy;

    public TableBowler(String bowlerName, String bowlerOver, String maidenOver, String runGiven, String wicketTaken, String wideBall, String noBall, String economy) {
        this.bowlerName = bowlerName;
        this.bowlerOver = bowlerOver;
        this.maidenOver = maidenOver;
        this.runGiven = runGiven;
        this.wicketTaken = wicketTaken;
        this.wideBall = wideBall;
        this.noBall = noBall;
        this.economy = economy;
    }

    public String getBowlerName() {
        return bowlerName;
    }

    public String getBowlerOver() {
        return bowlerOver;
    }

    public String getMaidenOver() {
        return maidenOver;
    }

    public String getRunGiven() {
        return runGiven;
    }

    public String getWicketTaken() {
        return wicketTaken;
    }

    public String getWideBall() {
        return wideBall;
    }

    public String getNoBall() {
        return noBall;
    }

    public String getEconomy() {
        return economy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableBowler that = (TableBowler) o;
        return Objects.equals(bowlerName, that.bowlerName) && Objects.equals(bowlerOver, that.bowlerOver) && Objects.equals(maidenOver, that.maidenOver) && Objects.equals(runGiven, that.runGiven) && Objects.equals(wicketTaken, that.wicketTaken) && Objects.equals(wideBall, that.wideBall) && Objects.equals(noBall, that.noBall) && Objects.equals(economy, that.economy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bowlerName, bowlerOver, maidenOver, runGiven, wicketTaken, wideBall, noBall, economy);
    }
}
