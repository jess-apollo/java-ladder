package nextstep.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    @DisplayName("numberOfParticipants 에 따른 Line에 생성된 Point 개수 확인")
    void points() {
        Line line1 = new Line(10);
        Line line2 = new Line(20);

        assertThat(line1.points().size()).isEqualTo(9);
        assertThat(line2.points().size()).isEqualTo(19);
    }

}