package clean.craftsmanship.stack

class Stack {
    private var size = 0
    private var elements: MutableList<Int> = mutableListOf()

    fun isEmpty() = size == 0

    fun push(element: Int) {
        elements.add(size++, element)
    }

    fun pop(): Int {
        if (size == 0) throw Underflow()
        return elements[--size]
    }

    fun getSize() = size
}

class Underflow : RuntimeException()
