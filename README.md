# ⚓ Gestión de Puerto Deportivo (Marina)

![Java](https://img.shields.io/badge/Language-Java-orange) ![IDE](https://img.shields.io/badge/IDE-Eclipse-blue) ![Status](https://img.shields.io/badge/Status-Completed-success) ![Reto](https://img.shields.io/badge/Reto-Barcos3-lightgrey)

## 📖 Descripción del Proyecto

[cite_start]Este proyecto consiste en una aplicación Java para la gestión de un **Puerto Deportivo** con una capacidad estricta de **6 barcos máximo**[cite: 3, 12]. [cite_start]El sistema permite administrar la entrada y salida de diferentes tipos de embarcaciones, calcular su autonomía basada en motores y simular costes de viajes según el precio del combustible[cite: 4, 16].

[cite_start]El proyecto implementa conceptos de **Herencia**, **Polimorfismo** y **Encapsulamiento** (Getters/Setters)[cite: 2].

---

## 🏗️ Arquitectura de Clases

El sistema se basa en la siguiente jerarquía:

### 1. Clase Motor ⚙️
Define la propulsión de los barcos.
* [cite_start]**Atributos:** `modelo` (String), `potencia` (int), `consumo` (double)[cite: 5].

### 2. Clase Barco (Padre) 🛥️
Clase base que contiene los atributos comunes y la lógica general.
* [cite_start]**Método Principal:** `calcularAutonomia()`[cite: 7].
    > **Fórmula:** `Capacidad Combustible / Consumo del Motor` = Horas de autonomía.

### 3. Tipos de Embarcaciones (Hijas)
Cada tipo de barco extiende la clase base y añade características únicas:

| Tipo | Atributos Específicos | Lógica de Autonomía |
| :--- | :--- | :--- |
| **🚤 Lancha** | [cite_start]`cubierta` (boolean) [cite: 8] | Cálculo Normal |
| **🛳️ Yate** | [cite_start]`camarotes` (int) [cite: 9] | Cálculo Normal |
| **⛵ Catamarán** | [cite_start]`motorSecundario` (Motor) [cite: 10] | **Sobrescrito** (Media de 2 motores) |

---

## 🧮 Lógica de Negocio Destacada

### Cálculo de Autonomía del Catamarán
El Catamarán es un caso especial ya que cuenta con dos motores. Su autonomía se calcula como la media de ambos:

```java
// Sobrescritura en clase Catamaran [cite: 11]
autonomia = ( (capacidad/consumo1) + (capacidad/consumo2) ) / 2;
