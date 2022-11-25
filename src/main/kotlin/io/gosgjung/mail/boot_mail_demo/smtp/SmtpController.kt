package io.gosgjung.mail.boot_mail_demo.smtp

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class SmtpController (
    val simpleMailService: SimpleSmtpMailService
){

    @GetMapping("/mail")
    fun getMailPage(): String{
        return "mail"
    }

    @PostMapping("/mail")
    fun postMail(smtpMailDto: SmtpMailDto) {
        simpleMailService.sendPlainMail(smtpMailDto)
    }
}