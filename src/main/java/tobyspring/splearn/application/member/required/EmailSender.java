package tobyspring.splearn.application.member.required;

import tobyspring.splearn.domain.shared.Email;

/**
 * 이메일을 발송한다.
 */
public interface EmailSender {

    void send(Email email, String subject, String body);
}
