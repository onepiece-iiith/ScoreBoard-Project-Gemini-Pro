package TableViewFiles;

import java.util.Objects;

public class TableBatsman {

    private final String playerName;
    private final String outType;
    private final String batsmanRun;
    private final String ballPlayed;
    private final String fourRun;
    private final String sixRun;
    private final String strikeRate;

    public TableBatsman(String playerName, String outType, String batsmanRun, String ballPlayed, String fourRun, String sixRun, String strikeRate) {
        this.playerName = playerName;
        this.outType = outType;
        this.batsmanRun = batsmanRun;
        this.ballPlayed = ballPlayed;
        this.fourRun = fourRun;
        this.sixRun = sixRun;
        this.strikeRate = strikeRate;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getOutType() {
        return outType;
    }

    public String getBatsmanRun() {
        return batsmanRun;
    }

    public String getBallPlayed() {
        return ballPlayed;
    }

    public String getFourRun() {
        return fourRun;
    }

    public String getSixRun() {
        return sixRun;
    }

    public String getStrikeRate() {
        return strikeRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableBatsman that = (TableBatsman) o;
        return Objects.equals(playerName, that.playerName) && Objects.equals(outType, that.outType) && Objects.equals(batsmanRun, that.batsmanRun) && Objects.equals(ballPlayed, that.ballPlayed) && Objects.equals(fourRun, that.fourRun) && Objects.equals(sixRun, that.sixRun) && Objects.equals(strikeRate, that.strikeRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, outType, batsmanRun, ballPlayed, fourRun, sixRun, strikeRate);
    }
}
