package tobyspring.splearn.adapter.integration;

import org.springframework.context.annotation.Fallback;
import org.springframework.stereotype.Component;
import tobyspring.splearn.application.member.required.EmailSender;
import tobyspring.splearn.domain.shared.Email;

@Component
@Fallback // 다른 빈을 다 찾다가 이 타입의 빈을 찾을 수 없다. 그러면 해당 빈을 사용해라. 라는 의미의 애노테이션
public class DummyEmailSender implements EmailSender {
    @Override
    public void send(Email email, String subject, String body) {
        System.out.println("DummyEmailSender send email: " + email);
    }
}
