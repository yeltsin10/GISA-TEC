package com.gisa.framework.utils;

import com.jopen.base.Despachador;

/** 
 *Clase que contiene valores contantes en todo el sistema.
 *<br><b>WEBROOT</b>  Contiene el valor del contexto del sistema ejemplo: "/tienda/"
 *<br><b>SERVERURL</b>  Contiene la ruta donde esta localizado el broker de progress
 *ejemplo: http://www.prologisa.com/aia/Aia1?AppService=0271pl3 
 */
public class Constantes extends Despachador {
    /**
     * *<br><b>WEBROOT</b>  Contiene el valor del contexto del sistema ejemplo: "/tienda/"
     **/
    public static String WEBROOT = "/VinculacionGISA/";
    /**
     * *<br><b>ENMTTO</b>  Contiene el valor de true o false, indica si el sistema se encuentra en mantenimiento"
     **/
    public static Boolean ENMTTO    = false;
    
    public static String SERVERURL  = "http://192.168.74.200:8080/aia/Aia1?AppService=0219erp";
}
