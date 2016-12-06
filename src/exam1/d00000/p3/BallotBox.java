package exam1.d00000.p3;

public class BallotBox {
    public int candidate1;
    public int candidate2;
    public int candidate3;
    public int invalid;

    public BallotBox() {
        candidate1 = 0;
        candidate2 = 0;
        candidate3 = 0;
        invalid = 0;
    }

    public void vote(int v) {
        if (v == 1) {
            candidate1++;
        } else if (v == 2) {
            candidate2++;
        } else if (v == 3) {
            candidate3++;
        } else {
            invalid++;
        }
    }

    public double getInvalidVoteRate() {
        int total = candidate1 + candidate2 + candidate3 + invalid;
        double rate = invalid / (double)total;
        return rate;
    }

    public String getResult() {
        String result;
        if (candidate1 > candidate2 && candidate1 > candidate3) {
            result = "候補者1が当選";
        } else if (candidate2 > candidate1 & candidate2 > candidate3) {
            result = "候補者2が当選";
        } else if (candidate3 > candidate1 & candidate3 > candidate2) {
            result = "候補者3が当選";
        } else {
            result = "得票が同数のため未決定";
        }
        return result;
    }
}