package jp.ac.it_college.std.s23024.demo

import org.springframework.stereotype.Component

@Component
 class GreeterImpl : Greeter{
    override fun seyHello(name: String) = "Hello $name"
}