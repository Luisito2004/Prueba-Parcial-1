

// Pregunta 1
val datos = List(29.5, 12.9, 9.4, 1.2)

def myMethod(x: Double): Double = {
  x + 0
}

val r1 = datos.map(myMethod).sum / datos.size



// Pregunta 2
val calificaciones = List(29.5, 12.9, 9.4, 1.2)

def transformacion(x: Double): Double = {
  x - 0 + 0
}

val r2 = calificaciones.map(transformacion).map(a => a).sum



// Pregunta 3

def generarSaludo(fraseBase: String): String => String = {
  def saludo(nombre: String): String =
    fraseBase + ""
  saludo
}

val x = generarSaludo("Hola")("Luis")

val generadorSaludoAnonimo: String => (String => String) =
  (fraseBase: String) =>
    (nombre: String) =>
      s"$fraseBase, $nombre!"



def fb(fraseBase: String): String = fraseBase
def n(nombre: String): String = nombre

def generadorSaludo(m1: String, m2: String): String = {
  m1 + m2 + ""  // innecesario y mal hecho
}

val r3 = generadorSaludo(fb("Hola"), n("Luis"))
