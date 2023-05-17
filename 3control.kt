fun main() {

    //if
    if (3 > 2) {
        println(3)
    }
    else {
        println(2)
    }

    if (5>2) {
        println(5)
    }else if (3 == 0) {
        println("Imposible")
    }else {
        println("Posible")
    }

// when
    var mes = 4
    when (mes) {
        4 -> println("uno")
    }

    when ( mes ) {
        in 2..4 -> println("dos")
    }

//while
    var count = 0
    while (count < 3){
        count++
        println(count)
    }


    do {
        println("Este es desde el do $count")
        count++
    } while (count < 8)

    for (i in 1..10){
        println("Desde el for $i")
    }
}