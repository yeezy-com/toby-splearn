package tobyspring.splearn.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EmailTest {

    @Test
    void equality() {
        var email1 = new Email("toby@splearn.app");
        var email2 = new Email("toby@splearn.app");

        assertThat(email1).isEqualTo(email2);
    }

}
