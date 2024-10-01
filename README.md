# Práctica 1: Cerradura de Kleene y Cerradura Positiva

Este proyecto es una implementación básica de una API Rest utilizando **Spring Boot** para calcular la **Cerradura de Kleene** y la **Cerradura Positiva** de un conjunto de cadenas binarias.

## Descripción

La aplicación recibe un número entero como parámetro y calcula:

- **Cerradura de Kleene**: Todas las combinaciones posibles de cadenas binarias hasta la longitud especificada.
- **Cerradura Positiva**: Todas las combinaciones posibles de cadenas binarias sin incluir la cadena vacía.

## Características

- Implementación de un **API Rest**.
- Cálculo de **Cerradura de Kleene** y **Cerradura Positiva**.
- Endpoints para obtener los resultados en formato JSON.

## Requisitos

- **Java 11** o superior.
- **Maven** para la gestión de dependencias.
- **Spring Boot** para la configuración y gestión del servidor.

## Instalación y Ejecución
cd PracticaCerradura
mvn clean install
mvn spring-boot:run

### Clonar el repositorio

Puedes clonar este repositorio utilizando el siguiente comando:

```bash
git clone https://github.com/BzSaur/PracticaCerradura.git
