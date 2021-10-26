package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	val runApplication = runApplication<DemoApplication>(*args)

		println("Hello Torsten,")
		println("I am so happy that you called me.")
		println("It took me a long time to get online and since than I'm getting more and more eager to know who will call.")
		val x = 5
		val y = 5f
		println("I found 2 variables laying around: x = $x and y = $y.")
		val erg = y * x
		println("Want me to multiply them? How about : x * y = $erg.")
		println("What do you say? Am I doing a good Job?")
		println("Have a nice Day.")

}
