# Autobus

API para Sistema Web de una reservaciones de viajes de Autobus - Tecnologias Para Laintegracion De Soluciones 

## Para Comenzar

Para poder consumir este servicio se requiere de una conexion a internet


### API

Peticiones soportadas por la API v2.0


**Consultar Viajes**: Consultar los viajes que existen de un determinado origen a un determinado destino en una fecha en particular 

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `origen` | **String** Ciudad de origen|
| `destino` | **String** Ciudad de destino|
| `fecha` | **Date** Fecha del Viaje *DD-MM-YYYY* |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `idViaje` | **String** Identificardor unico del viaje|
| `origen` | **String** Ciudad de origen|
| `destino` | **String** Ciudad de destino|
| `fecha` | **String** Fecha del Viaje *YYYY-MM-DD* |
| `hora` | **String** Hora de salida|
| `precio` | **Int** Costo del viaje|

**Ejemplo de petición**

```
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <ConsultarViajeRequest xmlns="http://www.servicio.com/autobus">
            <origen>Veracruz</origen>
            <destino>Xalapa</destino>
            <fecha>01-02-2020</fecha>
        </ConsultarViajeRequest>
    </Body>
</Envelope>

```

**Seleccionar Viaje**: Elegir un viaje de los disponibles
Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idViaje` | **Int** Identificador unico del viaje |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `Asientos` | **Array** **int** Número de los asientos disponibles|

**Ejemplo de petición**

```
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <SeleccionarViajeRequest xmlns="http://www.servicio.com/autobus">
            <idViaje>VZXL0001</idViaje>
        </SeleccionarViajeRequest>
    </Body>
</Envelope>

```

**Seleccionar Asiento**: Elige un asiento de los disponibles y quien lo ocupara

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idViaje` | **String** Identificador unico del viaje |
| `asiento` | **Int** Número del asiento que se desea ocupar|
| `nomPasajero` | **String** Nombre del pasajero que va a comprar el boleto|
| `Cliente` | **String** Correo electronico del cliente que esta en sesion |


Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `idBoleto` | **String** Identificador unico del boleto|
| `origen` | **String** Ciudad de origen|
| `destino` | **String** Ciudad de destino|
| `fecha` | **Date** Fecha de salida *DD-MM-YYYY* |
| `hora` | **Time** Hora de salida *HH:MM* |
| `precio` | **Int** Precio del boleto del viaje |
| `nomPasajero` | **String** Nombre del pasajero que ocupara el asiento en el viaje |
| `asiento` |  **Int** Numero de asiento seleccionador que ocupara el pasajero |

**Ejemplo de petición**

```
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <SeleccionarAsientoRequest xmlns="http://www.servicio.com/autobus">
            <idViaje>XLMX001</idViaje>
            <asiento>1</asiento>
            <nomPasajero>Carlos Daniel Rodriguez</nomPasajero>
            <cliente>sorec_carlos@hotmail.com</Cliente>
        </SeleccionarAsientoRequest>
    </Body>
</Envelope>

```

**Ver Boleto**: Ver la informacion de un boleto

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `Cliente` | **String** Correo electronico del cliente que esta en sesion |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `idBoleto` | **String** Identificador unico del boleto|
| `origen` | **String** Ciudad de origen|
| `destino` | **String** Ciudad de destino|
| `fecha` | **Date** Fecha de salida *DD-MM-YYYY* |
| `hora` | **Time** Hora de salida *HH:MM* |
| `precio` | **Int** Precio del boleto de viaje |
| `nomPasajero` | **String** Nombre del pasajero que ocupara el asiento en el viaje |
| `asiento` |  **Int** Numero de asiento seleccionado que ocupara el pasajero |

**Ejemplo de petición**

```
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <VerBoletoRequest xmlns="http://www.servicio.com/autobus">
            <Cliente>sorec_carlos@hotmail.com</Cliente>
        </VerBoletoRequest>
    </Body>
</Envelope>
```

**Modificar Boleto**: Modifica el nombre del pasajero y/o el asiento de un boleto

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idBoleto` | **String** Identificador unico del boleto |
| `nomPasajero` | **Int** Nombre del pasajero al cual se cambiara |
| `asiento` | **Int** Numero de asiento correspondiente a el boleto |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `checkout` | **Boolean** Estado de la operacion


**Ejemplo de petición**

```
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <ModificarBoletoRequest xmlns="http://www.servicio.com/autobus">
            <idBoleto>1</idBoleto>
            <nomPasajero>Carlos Daniel Ramirez</nomPasajero>
            <asiento>10</asiento>
        </ModificarBoletoRequest>
    </Body>
</Envelope>
```

**Cancelar Boleto**: Cancela un boleto

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idBoleto` | **String** Identificador unico del boleto |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `checkout` | **Boolean** Estado de la operacion


**Ejemplo de petición**

```
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <CancelarBoletoRequest xmlns="http://www.servicio.com/autobus">
            <idBoleto>1</idBoleto>
        </CancelarBoletoRequest>
    </Body>
</Envelope>
```
