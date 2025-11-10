import kotlin.math.sqrt
fun main() {
    val t = Triangle()
    
    // Ввод точек
    println("Точка A (x y):")
    val inputA = readln().split(" ")
    t.A.x = inputA[0].toDouble()
    t.A.y = inputA[1].toDouble()
    
    println("Точка B (x y):")
    val inputB = readln().split(" ")
    t.B.x = inputB[0].toDouble()
    t.B.y = inputB[1].toDouble()
    
    println("Точка C (x y):")
    val inputC = readln().split(" ")
    t.C.x = inputC[0].toDouble()
    t.C.y = inputC[1].toDouble()
    
    // Длины сторон
    val a = sqrt((t.B.x - t.C.x).pow(2) + (t.B.y - t.C.y).pow(2))  // BC
    val b = sqrt((t.A.x - t.C.x).pow(2) + (t.A.y - t.C.y).pow(2))  // AC  
    val c = sqrt((t.A.x - t.B.x).pow(2) + (t.A.y - t.B.y).pow(2))  // AB
    
    // Периметр
    val P = a + b + c
    
    // Площадь (через координаты)
    val area = 0.5 * Math.abs(
        t.A.x * (t.B.y - t.C.y) + 
        t.B.x * (t.C.y - t.A.y) + 
        t.C.x * (t.A.y - t.B.y)
    )
    
    // Центр вписанной окружности
    val centerX = (a * t.A.x + b * t.B.x + c * t.C.x) / P
    val centerY = (a * t.A.y + b * t.B.y + c * t.C.y) / P
    
    // Радиус
    val radius = 2 * area / P
    
    println("Центр: (${centerX}, ${centerY})")
    println("Радиус: ${radius}")
}
