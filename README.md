# Conversor de Moneda - Challenge ONE - Java - Back end

## Indice
*[1](#Sobre el Desafío)
*[2](#Descripción proyecto)



# Sobre el Desafío

En este emocionante desafío de programación, te invitamos a construir 
tu propio Conversor de Monedas. Aprenderás a realizar solicitudes a 
una API de tasas de cambio, a manipular datos JSON y, 
finalmente, a filtrar y mostrar las monedas de interés. 
¡Prepárate para una experiencia práctica y emocionante en el desarrollo Java!

Los pasos para completar este desafío se detallarán a continuación y estarán 
disponibles en la sección adyacente:

Configuración del Ambiente Java;
Creación del Proyecto;
Consumo de la API;
Análisis de la Respuesta JSON;
Filtro de Monedas;
Exibición de Resultados a los usuarios;

# Descripción proyecto

Pequeña app desarrollada en JAVA para la presentacion de la solucion al challenge One,
app que realiza conversion de monedas, con Apis distintas.

# funcionalidades

Permite escoger la APi con la que desee realizar la conversion,
Permite Leer el historial de conversiones realizadas.

# Cómo pueden usarlo los usuarios

Clona el repositorio en tu carpeta de trabajo y ejecuta el codigo, la interfaz grafica es tipo consola.

****************************************************
    Challenge Conversor de Monedas, Alura Latam
      Por : Felipe Nieves => Grupo 7 Back End
****************************************************

Ingrese el numero de la opcion de preferencia :
c - Convertir moneda.
h - Ver historial de conversiones.
s - Salir.
-----------------------------------------------------

Historia de conversiones.

Wed Sep 18 14:13:47 COT 2024 => Api : exchageRate 1.0 COP EQUIVALE A : 0.004558 MXN
Wed Sep 18 14:22:46 COT 2024 => Api : exchageRate 12.0 USD EQUIVALE A : 50750.316 COP
Wed Sep 18 14:24:08 COT 2024 => Api : exchageRate 500000.0 COP EQUIVALE A : 118.225 USD
Wed Sep 18 14:35:41 COT 2024 => Api : exchageRate 100.0 COP EQUIVALE A : 100.0 COP
Wed Sep 18 14:55:11 COT 2024 => Api : exchageRate 100.0 USD EQUIVALE A : 422919.3 COP
Wed Sep 18 22:14:43 COT 2024 => Api : openExchangeRates 1.0 USD EQUIVALE A : 0.0 USD

-----------------------------------------------------
Ingrese el numero de la opcion de preferencia :
c - Convertir moneda.
h - Ver historial de conversiones.
s - Salir.
-----------------------------------------------------

c
Ingrese el numero del API de conversion de su gusto :
1 - Exchage Rate.
2 - Open Exchange Rates.
3 - CoinGecko.
4 - regresar.
-----------------------------------------------------
1
Ingrese abreviatura de la moneda de origen (De:)
-----------------------------------------------------

USD - Dólar Estadounidense
ARS - Peso Argentino
COP - Peso Colombiano
BOB - Boliviano
BRL - Real Brasileño
CLP - Peso Chileno
CNY - Yuan Chino
CAD - Dólar Canadiense
EUR - Euro
GBP - Libra Esterlina
INR - Rupia India
MXN - Peso Mexicano
-----------------------------------------------------
USD
Ingrese el valor a convertir :
-----------------------------------------------------

1000
Ingrese abreviatura de la moneda de destino (A:)
-----------------------------------------------------

USD - Dólar Estadounidense
ARS - Peso Argentino
COP - Peso Colombiano
BOB - Boliviano
BRL - Real Brasileño
CLP - Peso Chileno
CNY - Yuan Chino
CAD - Dólar Canadiense
EUR - Euro
GBP - Libra Esterlina
INR - Rupia India
MXN - Peso Mexicano
-----------------------------------------------------
COP
Estado : Conectando con la api.
Estado : Analizando resultados.
Estado : Guardando registro.
Estado : Mostrando resultado.

1000,00 USD EQUIVALE A : 4217085,10 COP
-----------------------------------------------------

# Autores del proyecto.

Luis Felipe Nieves Ch
Grupo 7 Back End => ORACLE NEXT, ALURA LATAM
