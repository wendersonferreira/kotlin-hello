package br.com.trustsystems

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("John Rambo", 30), Person("Chuck Norris", 31),
            Person("Jaspion"))

    val mostPowerful = persons.maxBy { it.age ?: 0 }

    print("The most powerful is ${mostPowerful?.name}")
}