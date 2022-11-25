package io.gosgjung.mail.boot_mail_demo.smtp

import org.apache.commons.lang3.RandomStringUtils
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class SimpleSmtpMailService (
    val sender: JavaMailSender
): SmtpMailService{
    override fun sendPlainMail(smtpMailDto: SmtpMailDto) {
        val message : SimpleMailMessage = SimpleMailMessage()
        message.setTo(smtpMailDto.address)
        message.subject = smtpMailDto.title
        message.text = smtpMailDto.message
        sender.send(message)
    }

    override fun sendAuthNumberMail(smtpMailDto: SmtpMailDto) {
        val message: SimpleMailMessage = SimpleMailMessage()
        message.setTo(smtpMailDto.address)
        message.text = buildMailMessage(smtpMailDto)
        sender.send(message)
    }

    fun buildMailMessage(smtpMailDto: SmtpMailDto): String {
        return "${smtpMailDto.message} + \n 인증번호는 ${RandomStringUtils.randomAlphanumeric(6)}" +
                " 입니다"
    }
}