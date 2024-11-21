# EXAMEN ANDROID: Aplicación de Calculadora con Historial

Se te proporciona un proyecto Android que implementa una calculadora básica. La lógica de las operaciones está encapsulada en la clase `Calculator`, pero la aplicación no está terminada. Tu objetivo es completar la aplicación añadiendo funcionalidad a la `MainActivity` y a la `CalculatorHistoryActivity` (se explica en detalle más adelante). Debes utilizar la lógica proporcionada y gestionar el historial de operaciones.

A continuación, un ejemplo del resultado esperado:

<div style="display: flex; justify-content: center; gap: 10px;">
  <img src="https://github.com/martarodriguezm/EuneizAndroidExam2024-2025/blob/main/calculator1.png?raw=true" alt="Screenshot 1" width="300"/>
  <img src="https://github.com/martarodriguezm/EuneizAndroidExam2024-2025/blob/main/calculator2.png?raw=true" alt="Screenshot 2" width="300"/>
</div>

---

## Tiempo
Dedicaremos un máximo de 30 minutos a dudas y puesta en marcha del proyecto Android entregado. Pasado ese tiempo, el examen tendrá una duración de 3 horas.

## Herramientas Permitidas
- Uso del ordenador y conexión a Internet.
- Consultar ejercicios realizados en clase y buscar información en Internet.

## Herramientas NO Permitidas
- No está permitido usar herramientas de mensajería o similar para hablar con otras personas. Supondrá el suspenso inmediato.

---

## Objetivos

### MainActivity
- Implementar la interfaz gráfica de la calculadora, utilizando los elementos de UI necesarios.
- Implementar la lógica de interacción entre los botones de la UI de la calculadora y la clase `Calculator` para realizar las operaciones de suma, resta, multiplicación y división.
- Cada vez que el usuario realice una operación, deberá guardarse un registro de la misma en una lista temporal en memoria, utilizando la data class `OperationRecord` para almacenar los detalles de cada operación.
- Al pulsar el botón "History", la aplicación debe navegar a la actividad `CalculatorHistoryActivity`.

### CalculatorHistoryActivity
- Mostrar en un listado el historial de todas las operaciones realizadas por el usuario en una misma sesión.
- El historial deberá reflejar correctamente las operaciones realizadas en la `MainActivity` hasta el momento.
- El Toolbar debe tener un botón "Atrás" para que el usuario, al pulsarlo, vuelva a la `MainActivity`.

### Gestión de Historial
- El historial de operaciones se debe mantener durante la ejecución de la app. Sin embargo, cuando la aplicación se cierre, el historial se pierde y debe comenzar de nuevo en la siguiente ejecución.

---

## Detalles Técnicos

- **Vista de Calculadora**: Deberás diseñar la UI que contenga al menos los botones numéricos (0-9), los operadores básicos (+, -, *, ÷, =), un botón para borrar (AC), y un campo donde se muestren los resultados.
- **Listado en CalculatorHistoryActivity**: Configura un listado para mostrar el historial de operaciones. Cada fila del listado debe mostrar los operandos, el operador y el resultado de la operación.

---

## Entregables
- Un proyecto Android funcional que cumpla con los requisitos anteriores (archivo .zip).
- Explicación en el código sobre las decisiones tomadas (comentarios).

## Evaluación
- Antes de entregar el proyecto, deberás mostrar el resultado obtenido en ejecución en tu simulador. Tendrás 3 minutos para explicar tu proyecto.
- Se valorará el funcionamiento de la aplicación y el nivel de compleción de las funcionalidades.
- Se valorará la calidad del código, nombres de variables, funciones, clases, organización, etc.
- Se valorará el uso de los elementos vistos en clase.
- Se penalizará el uso de elementos innecesarios para la implementación solicitada.

---

## Disclaimer
Este examen no utiliza Jetpack Compose para el desarrollo de la interfaz de usuario.



---

# ANDROID EXAM: Calculator Application with History

You are provided with an Android project that implements a basic calculator. The logic for the operations is encapsulated in the `Calculator` class, but the application is not finished. Your goal is to complete the application by adding functionality to the `MainActivity` and the `CalculatorHistoryActivity` (detailed below). You must use the provided logic and manage the operations history.

Below is an example of the expected outcome:

<div style="display: flex; justify-content: center; gap: 10px;">
  <img src="https://github.com/martarodriguezm/EuneizAndroidExam2024-2025/blob/main/calculator1.png?raw=true" alt="Screenshot 1" width="300"/>
  <img src="https://github.com/martarodriguezm/EuneizAndroidExam2024-2025/blob/main/calculator2.png?raw=true" alt="Screenshot 2" width="300"/>
</div>

---

## Time
We will dedicate a maximum of 30 minutes to questions and setup of the provided Android project. After that time, the exam will last for 3 hours.

## Allowed Tools
- Use of the computer and Internet connection.
- Consult exercises done in class and search for information on the Internet.

## Not Allowed Tools
- Using messaging tools or similar to talk to other people is not allowed. This will result in immediate failure.

---

## Objectives

### MainActivity
- Implement the graphical interface of the calculator using the necessary UI elements.
- Implement the interaction logic between the UI buttons of the calculator and the `Calculator` class to perform addition, subtraction, multiplication, and division operations.
- Each time the user performs an operation, it should be saved in a temporary list in memory, using the data class `OperationRecord` to store the details of each operation.
- When the "History" button is pressed, the app should navigate to the `CalculatorHistoryActivity`.

### CalculatorHistoryActivity
- Display a list of all the operations performed by the user in the same session.
- The history should accurately reflect the operations performed in `MainActivity` so far.
- The Toolbar should have a "Back" button so that the user can return to `MainActivity` when pressed.

### History Management
- The operations history should be maintained during the app's execution. However, when the app is closed, the history should be lost and start again in the next execution.

---

## Technical Details

- **Calculator View**: You should design the UI that contains at least the numeric buttons (0-9), basic operators (+, -, *, ÷, =), a button to clear (AC), and a field to display the results.
- **List in CalculatorHistoryActivity**: Set up a list to display the operations history. Each row in the list should display the operands, the operator, and the result of the operation.

---

## Deliverables
- A functional Android project that meets the above requirements (zip file).
- Explanation in the code about the decisions made (comments).

## Evaluation
- Before submitting the project, you must show the result obtained running on your simulator. You will have 3 minutes to explain your project.
- The functionality of the application and the level of completion of the features will be evaluated.
- The quality of the code, variable names, functions, classes, organization, etc., will be evaluated.
- The use of elements seen in class will be evaluated.
- The use of unnecessary elements for the requested implementation will be penalized.

---

## Disclaimer
This exam does not use Jetpack Compose for user interface development.
