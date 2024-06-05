package jp.ac.it_college.std.s23024.demo

import org.springframework.stereotype.Component

@Component("JapaneseMessageService")
class JapaneseMessageService : MessageService {
    override fun welcom() = "ようこそ"
}