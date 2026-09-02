# 🔄 Taller de Ciclos en Java

Este repositorio contiene la solución al taller práctico sobre *Ciclos (Loops) en Java*. El objetivo principal es afianzar el uso de estructuras de control repetitivas (for, while, do-while), validación de datos, manejo de excepciones y diseño de menús interactivos con ASCII Art.

---

## 👥 Integrantes del Equipo

- Jeronimo Arcila Ceballos
- Jose Alejandro Estrada
- Edwin Murillo

---

## 📋 Descripción del Proyecto

El programa principal se ejecuta mediante un *menú interactivo infinito* construido con ciclos y validación robusta de entradas para evitar cierres inesperados por errores del usuario. 

### Opciones del Menú:
1. *Suma de la Serie de Fibonacci:* Calcula el término o la suma de la serie.
2. *Número Primo:* Calcula el n-ésimo número primo.
3. *Ecuación Cuadrática:* Resuelve ecuaciones de segundo grado ($ax^2 + bx + c = 0$), contemplando raíces reales y complejas.
4. *Promedio de $n$ Números:* Permite el ingreso de números decimales para calcular su promedio.
5. *Juego de Adivinanza:* Adivina un número aleatorio entre un rango $n$ y $m$.
6. *Tabla de Multiplicar:* Genera la tabla de multiplicar de cualquier número ingresado.
7. *Salir:* Finaliza la ejecución del programa de forma segura.

## Teoría 1/3

1. ¿Cuál es la diferencia entre un ciclo for, un ciclo while y un do-while?
El for se usa cuando se conoce el número de iteraciones, ya que en una sola línea incluye inicialización, condición e incremento. El while evalúa la condición antes de ejecutar el bloque, por lo que es útil cuando no se sabe cuántas veces se repetirá. El do-while ejecuta el bloque al menos una vez y evalúa la condición al final.

2. ¿Qué es un ciclo infinito y cómo se puede evitar?
Es un ciclo cuya condición nunca se vuelve falsa, por lo que nunca termina. Se evita asegurando que la variable de control cambie dentro del ciclo hasta cumplir la condición de salida.

3. ¿Cómo se pueden anidar ciclos en Java?
Colocando un ciclo dentro de otro; el ciclo interno se ejecuta completo en cada iteración del externo. Se usa, por ejemplo, para recorrer tablas o matrices.

4. ¿Qué es el alcance de una variable dentro de un ciclo?
Si una variable se declara dentro del ciclo (por ejemplo, int i en el for), solo existe dentro de ese bloque; fuera de él no es accesible.

## Teoría 2/3

1. Explique 3 palabras reservadas que se pueden usar en un ciclo
for, while y do (también break y continue para controlar su flujo).

2. ¿Cómo se pueden usar los ciclos para procesar datos de entrada del usuario?
Usando Scanner dentro de un ciclo para leer valores repetidamente, por ejemplo un do-while que pide intentos hasta acertar, o un for que pide n números para sumarlos o promediarlos.

3. ¿Qué es un contador? ¿Qué tipos de variables de control conoce?
Un contador es una variable que incrementa o decrementa para llevar la cuenta de repeticiones (por ejemplo, un contador de números primos). Tipos de variables de control: contadores (suman de 1 en 1), acumuladores (suman valores) y banderas/flags (booleanas que indican un estado, como primo).

4. ¿Qué es una secuencia de escape, cómo se usa para resolver este taller?
Es una combinación de caracteres que representa un carácter especial dentro de un String, como \n (salto de línea) o \t (tabulación). En el taller se usó \n para separar visualmente el menú y los resultados en consola.

## Teoría 3/3

1. Explique tres atajos de teclado útiles para programar en VSC
Ctrl + S (guardar), Ctrl + / (comentar línea) y Ctrl + Espacio (autocompletar). También Ctrl + ` abre la terminal integrada.

2. ¿Qué es overflow, en qué parte del taller se puede presentar?
Ocurre cuando un valor supera el rango máximo que puede almacenar su tipo de dato (por ejemplo, int). Puede presentarse en la suma de Fibonacci o en el promedio si se ingresan números muy grandes.

3. ¿Cómo se puede personalizar los colores de la consola en Java?
Con códigos de escape ANSI, por ejemplo: System.out.println("\u001B[31m" + "texto en rojo" + "\u001B[0m");

4. Escriba 5 formas diferentes de definir ciclos infinitos en Java

	•	for(;;) { }
	•	while(true) { }
	•	do { } while(true);
	•	for(int i=0; i>=0; i++) { }
	•	while(1==1) { }


---

## 🛠️ Requisitos e Instrucciones de Ejecución

1. Tener instalado *Java JDK* (versión 8 o superior).
2. Clonar el repositorio o abrir la carpeta en tu entorno de desarrollo (Visual Studio Code con Extension Pack for Java, IntelliJ IDEA, etc.).
3. Compilar y ejecutar el archivo principal del proyecto.