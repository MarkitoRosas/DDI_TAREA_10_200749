package mx.edu.utxj.ti.idgs.dwi.practica8_ddi_200931.presentation

data class WeatherResponse(
    val main: Main
)

data class Main(
    val temp: Float
)