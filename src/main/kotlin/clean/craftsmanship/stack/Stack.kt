package clean.craftsmanship.stack

class Stack {
    var size = 0
        private set

    private var elements: MutableList<Int> = mutableListOf()

    fun isEmpty() = size == 0

    fun push(element: Int) {
        elements.add(size++, element)
    }

    fun pop(): Int {
        if (size == 0) throw Underflow()
        return elements[--size]
    }
}

class Underflow : RuntimeException()
