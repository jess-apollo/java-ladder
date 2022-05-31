package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public String[] inputParticipants() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        scanner.nextLine();
        String input = scanner.nextLine();
        return split(input);
    }

    public int inputLadderHeight() {
        System.out.println("최대 사다리 높이는 얼마인가요?");
        return scanner.nextInt();
    }

    private String[] split(String input) {
        return input.split("[,]");
    }


}
