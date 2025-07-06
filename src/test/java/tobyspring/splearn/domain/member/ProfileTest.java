package tobyspring.splearn.domain.member;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class ProfileTest {
    @Test
    void profile() {
        new Profile("tobyilee");
        new Profile("toby100");
        new Profile("12345");
    }

    @Test
    void profileFail() {
        assertThatThrownBy(() -> new Profile("")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Profile("toolongtoolongtoolongtoolong")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Profile("A")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Profile("프로필")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void url() {
        var profile = new Profile("tobyilee");

        assertThat(profile.url()).isEqualTo("@tobyilee");
    }

}
