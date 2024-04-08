fun main() {

    println("¿Escribe tú Edad?")
    val oldYear = readln() //Esta variable me almacena el valor, que el usuario envie atra vez de la consola

    val age = oldYear.toInt() // Me convierte el dato del usuario a Int, ya que esté, me lo pasa en String

    val isMonday = true
    val price = if (isMonday) "$25" else "$30" //Me valida si la variable isMonday es verdadera, para aplicar el precio de 25

    ticketPrice(age, price)
}
fun ticketPrice(age: Int, price: String) {

    if (age < 13) println("The movie ticket price for a child aged $age is $15")
    else if (age >= 14 && age <= 17) println("The movie ticket price for a young aged $age is $18")
    else if (age >= 18 && age <= 60) println("The movie ticket price for a adult aged $age is $price")
    else if (age >= 61 && age  <=100) println("The movie ticket price for a senior aged $age is $20")

}