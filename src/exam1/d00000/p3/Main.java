package exam1.d00000.p3;

public class Main {
    public static void main(String[] args) {
        // 選挙1
        BallotBox ballotBox1 = new BallotBox();
        ballotBox1.vote(1);
        ballotBox1.vote(2);
        ballotBox1.vote(1);
        ballotBox1.vote(3);
        ballotBox1.vote(0);
        ballotBox1.vote(2);
        ballotBox1.vote(1);
        ballotBox1.vote(2);
        ballotBox1.vote(3);
        ballotBox1.vote(2);
        ballotBox1.vote(4);
        System.out.println("選挙1");
        System.out.println("無効投票率: " + ballotBox1.getInvalidVoteRate());
        System.out.println("選挙結果: " + ballotBox1.getResult());
        // 選挙2
        BallotBox ballotBox2 = new BallotBox();
        ballotBox2.vote(1);
        ballotBox2.vote(1);
        ballotBox2.vote(2);
        ballotBox2.vote(2);
        ballotBox2.vote(3);
        ballotBox2.vote(4);
        System.out.println("選挙2");
        System.out.println("無効投票率: " + ballotBox2.getInvalidVoteRate());
        System.out.println("選挙結果: " + ballotBox2.getResult());
    }
}