package practice1.d00000.p2;

public class BlackjackHand {
    public int card1;
    public int card2;

    public BlackjackHand(int card1, int card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public int getScore() {
        int score;
        if (card1 == 1 && card2 == 1) {
            score = 1 + 11;
        } else {
            // カード1についてスコアを計算する。
            int score1;
            if (card1 > 10) {
                score1 = 10;
            } else if (card1 == 1){
                score1 = 11;
            } else {
                score1 = card1;
            }
            // カード2についてスコアを計算する。
            int score2;
            if (card2 > 10) {
                score2 = 10;
            } else if (card2 == 1){
                score2 = 11;
            } else {
                score2 = card2;
            }
            score = score1 + score2;
            // バーストをチェック（ただし、２枚の場合はバーストしないので、本来不要）
            if (score > 21) {
                score = -1;
            }
        }
        return score;
    }

}