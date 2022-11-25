package io.gosgjung.mail.boot_mail_demo.smtp.tdd

import io.gosgjung.mail.boot_mail_demo.smtp.SimpleSmtpMailService
import io.gosgjung.mail.boot_mail_demo.smtp.SmtpMailDto
import io.gosgjung.mail.boot_mail_demo.smtp.SmtpMailService
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.mail.javamail.JavaMailSender

@SpringBootTest
class UnitSmtpMailSendTest {

    @Autowired
    lateinit var sender: JavaMailSender

    @Test
    @Tag("Unit Test")
    fun 단위기능_테스트__SMTP_기반으로_메일을_보내는_기능(){
        val smtpMailService: SmtpMailService = SimpleSmtpMailService(sender)

        val smtpMailDto : SmtpMailDto = SmtpMailDto(
            "gosgjung@proton.me",
            "[SMTP 테스트] 안녕하세요.",
            "테스트 시작!!!"
        )

        smtpMailService.sendPlainMail(smtpMailDto)
    }
}