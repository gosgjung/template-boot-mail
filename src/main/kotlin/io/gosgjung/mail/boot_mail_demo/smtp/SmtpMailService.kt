package io.gosgjung.mail.boot_mail_demo.smtp

interface SmtpMailService {
    fun sendPlainMail(smtpMailDto: SmtpMailDto)
    fun sendAuthNumberMail(smtpMailDto: SmtpMailDto)
}