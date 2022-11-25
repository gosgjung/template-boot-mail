package io.gosgjung.mail.boot_mail_demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import org.springframework.stereotype.Component
import java.util.concurrent.Executor
import java.util.concurrent.ThreadPoolExecutor

@Component
class AsyncExecutorsConfig {

    @Bean
    fun mailSenderAsyncExecutor() : Executor {
        val executor: ThreadPoolTaskExecutor = ThreadPoolTaskExecutor()
        executor.corePoolSize = 1
        executor.maxPoolSize = 4
        executor.queueCapacity = 5000
        executor.initialize()
        return executor
    }
}