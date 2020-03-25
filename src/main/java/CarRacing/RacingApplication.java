package CarRacing;

import CarRacing.Utils.StringUtils;

import java.util.Scanner;

public class RacingApplication {
    static final private Scanner INPUT_SCANNER = new Scanner(System.in);
    static final private String FIRST_SENTENCE = "자동차 대수는 몇 대 인가요?";
    static final private String SECOND_SENTENCE = "시도할 회수는 몇 회 인가요?";
    static final private String RESULT_SENTENCE = "실행 결과";

    final private RacingGame racingGame;

    public RacingApplication() {
        this.racingGame = new RacingGame(StringUtils.splitStringToStringArr(getCarName()), getRacingTime());
        System.out.println(RESULT_SENTENCE);
        this.racingGame.raceStart();
    }

    private String getCarName() {
        System.out.println(FIRST_SENTENCE);
        return INPUT_SCANNER.next();
    }

    private int getRacingTime() {
        System.out.println(SECOND_SENTENCE);
        return INPUT_SCANNER.nextInt();
    }
}
