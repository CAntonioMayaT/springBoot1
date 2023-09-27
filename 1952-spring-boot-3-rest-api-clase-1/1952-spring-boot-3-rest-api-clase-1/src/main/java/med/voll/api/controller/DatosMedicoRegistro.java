package med.voll.api.controller;

import med.voll.api.dirección.DatosDireccion;
import med.voll.api.medico.Especialidad;

public record DatosMedicoRegistro(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion) {
}
