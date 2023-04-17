fun main() {

    // Creating lists.- IMMUTABLE
    val classes = listOf<String>("ada", "anitab", "hopper")
    val num = listOf<Int>(1, 2, 4)
    val doubles = listOf<Double>(20.0, 23.4, 56.7, 78.0)
    val floats = listOf<Float>(20.0F, 23.5F, 45.6F, 56.0F)
    val booleans = listOf<Boolean>(true, false)

    // mutable.
    val vehicles = mutableListOf<String>("BMW", "TOYOTA")

    // Inbuilt functions
    var nums = listOf(31, 34, 4, 67, 213, 643, 28, 90, 55)
    println(nums)

    val len = nums.count()  // count the number of the elements / length of the list.
    println(len)

    val max = nums.max()    // maximum number in the list.
    println(max)

    val min = nums.min()    // minimum number in the list.
    println(min)

    val avg = nums.average() // average.
    println(avg)

    val firstItem = nums.first() // first item.
    println(firstItem)

    val lastItem = nums.last()  // last item.
    println(lastItem)

    // List indexing
    var colors = listOf("red", "green", "blue", "yellow")
    println(colors[3])
    println(colors.get(3))

    println(colors.indexOf("yellow"))
    println(colors.lastIndex)


    // List iteration
    var integers = listOf<Int>(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    // Using for-loop
    for (integer in integers){
        println(integer)
    }


    integers.forEach{ integer -> println(integer * 8)} // using for each

    // for loop
    var strings = mutableListOf<String>("My", "name", "is", "Flo", ".")
    var empty = ""
    for (string in strings){
        empty+=string
        println(empty)
    }


    // List sorting
    var nums1 = mutableListOf<Int>(11, 5, 3, 8, 1, 9, 6, 2)

    val sorted = nums1.sorted()
    println(sorted)

    val descending = nums1.sortedDescending()
    println(descending)

    val reversed = nums1.reversed()
    println(reversed)

    // list contains
    println(nums1.contains(2))
    println(nums1.contains(21))

    // ADDING AND REMOVING IN A LIST
    nums1.add(10)
    nums1.add(25)
    nums1.add(45)
    println(nums1)


    nums1.remove(11)
    nums1.remove(5)
    nums1.remove(3)
    println(nums1)

    // list filtering

    var names = listOf<String>("Flo", "Tipanoi", "Janet", "google", "miscrosoft")
    var shortNames = names.filter { name -> name.length < 5 }
    println(shortNames)

}

















