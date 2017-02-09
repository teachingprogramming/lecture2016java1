package exam2.d00000.p2;

public class JankenGame {
    public JankenPlayer player1;
    public JankenPlayer player2;

    public JankenGame(JankenPlayer player1, JankenPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String battle() {
        int win1 = 0;
        int win2 = 0;
        for (int i=0; i<3; i++) {
            int hand1 = player1.getHand(i);
            int hand2 = player2.getHand(i);
            if (hand1 == 0) {
                if (hand2 == 1) {
                    win1++;
                } if (hand2 == 2) {
                    win2++;
                }
            } else if (hand1 == 1) {
                if (hand2 == 0) {
                    win2++;
                } else if (hand2 == 2) {
                    win1++;
                }
            } else if (hand1 == 2) {
                if (hand2 == 0) {
                    win1++;
                } else if (hand2 == 1) {
                    win2++;
                }
            }
        }
        if (win1 > win2) {
            return player1.getName()+"の勝ち";
        } else if (win1 < win2) {
            return player2.getName()+"の勝ち";
        } else {
            return "引き分け";
        }
    }

}
