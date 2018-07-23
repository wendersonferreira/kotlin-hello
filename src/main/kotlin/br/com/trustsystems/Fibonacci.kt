package br.com.trustsystems

fun main(args: Array<String>) {
    val fibonacciNumber = 300
    print(fib(fibonacciNumber))
}

fun fib(n: Int): Int {
    tailrec fun go(n: Int, a: Int, b: Int): Int {
        return when (n) {
            0 -> a
            else -> go(n - 1, b, (a + b) % 100000)
        }
    }
    return go(n % 1500000, 0, 1)
}