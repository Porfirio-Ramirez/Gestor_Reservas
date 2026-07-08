💈 Gestor de Reservas — Marta Peluquería

Aplicación de consola (CLI) en Java para gestionar las reservas del día en una peluquería.

¿Qué hace?

Permite a doña Marta gestionar sus citas desde la terminal:


Agendar una reserva (nombre, hora y servicio)
Listar todas las reservas del día
Cancelar una reserva por su número
Ver el reporte del día con total de citas y dinero facturado



Servicios disponibles

Código Servicio Precio 1 Corte de cabello $25.000 2 Tinte$ 60.000 3 Manicure $30.000


Reglas del negocio


Horario de atención: 8:00 a 17:00 (horas en punto)
No se pueden agendar dos clientes a la misma hora
El nombre del cliente no puede estar vacío
El servicio debe ser 1, 2 o 3
Máximo 10 reservas por día



Estructura del proyecto

GestorDeReservas/
└── src/
    ├── App.java          → Arranque y ciclo del menú
    ├── Menu.java         → Muestra opciones y lee la elección
    ├── Validador.java    → Valida hora, nombre y servicio
    └── Operaciones.java  → Arreglos paralelos y lógica del negocio


¿Cómo ejecutarlo?

Requisitos


Tener instalado Java JDK 11 o superior
Terminal (CMD, PowerShell, o la terminal de VS Code)


Pasos

1. Clona el repositorio:

bashgit clone https://github.com/tuusuario/GestorDeReservas.git
cd GestorDeReservas

2. Entra a la carpeta src:

bashcd src

3. Compila los archivos:

bashjavac *.java

4. Ejecuta el programa:

bashjava App


Ejemplo de uso

[1] Agendar cita
[2] Listado de reservas
[3] Cancelar reserva
[4] Ver reporte del dia
[5] Salir

Ingrese su nombre: Laura
Ingrese la hora (8-17): 10
Ingrese el servicio (1-Corte, 2-Tinte, 3-Manicure): 1
Reserva agendada correctamente.
