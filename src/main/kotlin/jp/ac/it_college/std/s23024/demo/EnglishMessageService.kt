package jp.ac.it_college.std.s23024.demo

import org.springframework.stereotype.Component

@Component("EnglishMessageService")
class EnglishMessageService : MessageService {
    override fun welcom() = "Welcome"
}