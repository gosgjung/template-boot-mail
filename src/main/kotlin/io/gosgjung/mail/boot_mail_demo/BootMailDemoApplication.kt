package io.gosgjung.mail.boot_mail_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootMailDemoApplication

fun main(args: Array<String>) {
	runApplication<BootMailDemoApplication>(*args)
}
