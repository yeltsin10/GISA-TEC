package com.gisa.framework.helper;

import java.util.ArrayList;

/**
 * Esta clase contiene todos los componentes que se usan en el tablero de control.
 * La versi&oacute;n del tablero de control es la del dashboard sb-admin-v2.
 * Si se actualiza una nueva versi&oacute;n es necesario volver a probar los componentes,
 * para ver si son compatibles con las hojas de estilo nuevas y los javascript. 
 * 
 */
public class TableroControl {
    
    /**
     * Recuadro en rojo claro para mostrar mensajes. <br>
     * Este tipo de recuadro NO desaparece, solo se quita al cambiar de pantalla o limpiando el
     * div a travez de un evento. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertDanger(String sMensaje){
        String sAlertDanger;
        
        sAlertDanger =  "<div class='alert alert-danger'>\n" +
                            sMensaje +"\n" +
                        "</div>\n";
        
        return sAlertDanger;
    }//fAlertDanger
    
    /**
     * Recuadro en rojo claro para mostrar mensajes. <br>
     * Este tipo de recuadro es temporal, el usuario lo puede quitar al leer el mensaje. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertDangerDescartable(String sMensaje){
        String sAlertDanger;
        
        sAlertDanger =  "<div class='alert alert-danger alert-dismissable'>\n" +
                        "   <button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>\n" +
                            sMensaje +"\n" +
                        "</div>\n";
        
        return sAlertDanger;
    }//fAlertDangerDescartable
    
    /**
     * Recuadro en azul claro para mostrar mensajes. <br>
     * Este tipo de recuadro NO desaparece, solo se quita al cambiar de pantalla o limpiando el
     * div a travez de un evento. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertInfo(String sMensaje){
        String sAlertInfo;
        
        sAlertInfo = "<div class='alert alert-info'>\n" +
                        sMensaje +"\n" +
                     "</div>\n";
        
        return sAlertInfo;
    }//fAlertInfo
    
    /**
     * Recuadro en azul claro para mostrar mensajes. <br>
     * Este tipo de recuadro es temporal, el usuario lo puede quitar al leer el mensaje. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertInfoDescartable(String sMensaje){
        String sAlertInfo;
        
        sAlertInfo =    "<div class='alert alert-info alert-dismissable'>\n" +
                        "   <button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>\n" +
                            sMensaje +"\n" +
                        "</div>\n";
        
        return sAlertInfo;
    }//fAlertInfoDescartable
    
    /**
     * Recuadro en verde claro para mostrar mensajes. <br>
     * Este tipo de recuadro NO desaparece, solo se quita al cambiar de pantalla o limpiando el
     * div a travez de un evento. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertSuccess(String sMensaje){
        String sAlertSuccess;
        
        sAlertSuccess =  "<div class='alert alert-success'>\n" +
                            sMensaje +"\n" +
                        "</div>\n";
        
        return sAlertSuccess;
    }//fAlertSuccess
    
    /**
     * Recuadro en verde claro para mostrar mensajes. <br>
     * Este tipo de recuadro es temporal, el usuario lo puede quitar al leer el mensaje. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertSuccessDescartable(String sMensaje){
        String AlertSuccess;
        
        AlertSuccess =  "<div class='alert alert-success alert-dismissable'>\n" +
                        "   <button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>\n" +
                            sMensaje +"\n" +
                        "</div>\n";
        
        return AlertSuccess;
    }//fAlertSuccessDescartable
    
    /**
     * Recuadro en amarillo claro para mostrar mensajes. <br>
     * Este tipo de recuadro NO desaparece, solo se quita al cambiar de pantalla o limpiando el
     * div a travez de un evento. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertWarning(String sMensaje){
        String sAlertWarning;
        
        sAlertWarning = "<div class='alert alert-warning'>\n" +
                            sMensaje +"\n" +
                        "</div>\n";
        
        return sAlertWarning;
    }//fAlertWarning
    
    /**
     * Recuadro en amarillo claro para mostrar mensajes. <br> 
     * Este tipo de recuadro es temporal, el usuario lo puede quitar al leer el mensaje. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sMensaje (<b>*</b>) Mensaje que mostrar&aacute;
     * @return El alert con el mensaje
     */
    public static String fAlertWarningDescartable(String sMensaje){
        String sAlertWarning;
        
        sAlertWarning =  "<div class='alert alert-warning alert-dismissable'>\n" +
                        "   <button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>\n" +
                            sMensaje +"\n" +
                        "</div>\n";
        
        return sAlertWarning;
    }//fAlertWarningDescartable
    
     /**
     * Barra de busqueda. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sFuncion <b>*</b> Funci&oacute;n javascript que se ejecuta al dar click en el icono de busqueda; 
     *          solo el nombre de la funci&oacute; y par&aacute;metros. <br> 
     *          Ejemplo: fGuardar("Usuario","A=fGuardarInformacion") <br>
     * @return La barra de busqueda. <br>
     * <b>Nota: </b> Esta barra se debe llamar antes del llenado del men&uacute;
     */
    public static String fBusquedaBarra(String sFuncion){
        String sBusquedaBarra;
        
        sBusquedaBarra ="<li class='sidebar-search'>\n" +
                        "	<div class='input-group custom-search-form'>\n" +
                        "		<input type='text' class='form-control' placeholder='Busqueda...'>\n" +
                        "		<span class='input-group-btn'>\n" +
                        "                   <button class='btn btn-default' type='button' onClick='"+ sFuncion +"'>\n" +
                        "			<i class='fa fa-search'></i>\n" +
                        "                   </button>\n" +
                        "               </span>\n" +
                        "	</div>\n" +
                        "	<!-- /input-group -->\n" +
                        "</li>";
        
        return sBusquedaBarra;
    }//fBusquedaBarra
    
    /**
     * Boton con diseno normal; background azul con letra blanca. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sTitulo (<b>*</b>)T&iacute;tulo del boton
     * @param sId (<b>*</b>)Identificador del boton(Sin espacios)
     * @param bDisabled Indica si el boton aparecer&aacute; deshabilitado
     * @param sStyleExtra Atributos extra para el estilo. <br> &#09; Ejemplo:  margin-left: 5px;
     * @param sEventosJS Eventos javascript. <br> &#09; Ejemplo: OnClick='fValidaInformacion()'
     * @return El boton <br><br>
     * <b>Ejemplo: </b> <br>
     *  fButtonNormal("Boton 1", "boton1", true,"","onClick='fValidaInformacion()'")
     * <br>
     * <b>Nota: </b> En la funci&oacute;n se le concatena a sId las letras btn_. <br> 
     * <b>Ejemplo:</b> btn_boton1
     */
    public static String fButtonNormal(String sTitulo,String sId, boolean bDisabled, String sStyleExtra, String sEventosJS){
        String sButton;
        
        if(bDisabled){
            sStyleExtra += " background-color:silver; color:#428bca; ";
            sEventosJS = "";
        }
        sButton =   "<button id='btn_"+ sId +"' name='btn_" + sId + "' type='button' class='btn btn-primary' style='margin:10px; "+ sStyleExtra +"' " + (bDisabled?"disabled":"") + " " + sEventosJS + ">"+ 
                        sTitulo +
                    "</button>";
        
        return sButton;
    }//fButtonNormal
    
    /**
     * Boton de color blanco y letra azul que cambia a color azul y letra blanca al posicionarse sobre el. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sTitulo (<b>*</b>)T&iacute;tulo del boton
     * @param sId (<b>*</b>)Identificador del boton(Sin espacios)
     * @param bDisabled Indica si el boton aparecer&aacute; deshabilitado
     * @param sStyleExtra Atributos extra para el estilo. <br> &#09; Ejemplo:  margin-left: 5px;
     * @param sEventosJS Eventos javascript. <br> &#09; Ejemplo: OnClick='fValidaInformacion()'
     * @return El boton <br><br>
     * <b>Nota:</b> En la funci&oacute;n se le concatena a sId las letras btn_. <br> <b>Ejemplo:</b>Ejemplo: btn_guardar
     */
    public static String fButtonOutline(String sTitulo,String sId, boolean bDisabled, String sStyleExtra, String sEventosJS){
        String sButton;
        
        if(bDisabled){
            sStyleExtra += " background-color:silver; color:#428bca; ";
            sEventosJS = "";
        }
        sButton =   "<button id='btn_"+ sId +"' name='btn_" + sId + "' type='button' class='btn btn-outline btn-primary' style='margin:10px; "+ sStyleExtra +"' " + (bDisabled?"disabled":"") + " " + sEventosJS + ">"+ 
                        sTitulo +
                    "</button>";
        
        return sButton;
    }//fButtonOutline
    
    /**
     * Carga los datos en la DataTable
     * @param numDT n&uacute;mero de DataTable <br>
     * <b>La primera columna esta reservada para los numeros de control</b>
     * @return Los datos del DataTable
    */
    public static String fDataTableDatos(int numDT) {
        
        String sDataTableCarga;
        
        //sSalida = "{\"data\":[[\"1\",\"2\",\"3\",\"4\",\"5\"],[\"6\",\"7\",\"8\",\"9\",\"10\"]]}";
        sDataTableCarga = "{\"data\":[";
        //if (numDT != 6) {
            for (int i = 0; i < 500; i++) {
                //Ajax con arreglos
                sDataTableCarga += "[\"" + i +"\",\"<a href='http://www.google.com' target='_new'>Usuario" + numDT + "- " + i + " </a>\",\"Empresa" + numDT + "- " + i + "\",\"Telefono" + numDT + "- " + i + "\",\"Direccion" + numDT + "- " + i + "\",\"Ciudad" + numDT + "- " + i + "\"]";
                //Ajax con Objetos
                //sDataTableCarga += "{\"DT_RowId\":\"row_"+ i +"\",\"usuario\" : \"<a href='http://www.google.com' target='_new'>Usuario " + i + " </a>\",\"empresa\": \"Empresa " + i + "\",\"telefono\": \"Telefono " + i + "\",\"direccion\": \"Direccion " + i + "\",\"ciudad\" : \"" + i + "\"}";
                if(i<499)
                    sDataTableCarga += ",";
            }
        //}
        sDataTableCarga += "]}";
        return sDataTableCarga;
    }//fDataTableDatos
    
    /**
     * Forma la estructura de la tabla que se cargar de inicio 
     * @param sTablaEncabezado Encabezado que aparecera en la parte superior de la tabla
     * @param sTablaColumnas columnas de la tabla
     * @param sTablaId identificador de la tabla(Sin espacios)
     * @param bConFooter indica si se mostrar&aacute; el footer en la datatable
     * @return Una DataTable <br>
     * <b>Nota: </b> <br>
     * En la funci&oacute;n se le concatena a sTablaId las letras dt_.  <br> <b>Ejemplo: </b>Ejemplo: dt_usuario <br>
     * El footer solo aplica para mostrar el total de una columna, cuyos datos sean enteros o decimales.
     * 
    */
    public static String fDataTableEsqueleto(String sTablaEncabezado, String sTablaColumnas[], String sTablaId, boolean bConFooter){
        String sDataTableEsqueleto;
        String sColumnas  = "";
        
        for (String columna : sTablaColumnas) {
            sColumnas += "<th>" + columna + "</th> ";
        }
        
        sDataTableEsqueleto  =  "<div class='row'>\n" +
                                        "<div class='col-lg-12'>\n" +
                                            "<div class='panel panel-default'>\n" +
                                                "<div class='panel-heading'>\n" +
                                                    sTablaEncabezado +
                                                "</div>\n" +
                                                "<!-- /.panel-heading -->\n" +
                                                "<div class='panel-body'>\n" +
                                                    "<div class='table-responsive'>\n" +
                                                        "<table class='table table-striped table-bordered table-hover' id='dt_"+ sTablaId +"' name='dt_" + sTablaId + "'>\n" +
                                                            "<thead>\n"  +
                                                                "<tr>\n" +
                                                                    sColumnas +
                                                                "</tr>\n" +
                                                            "</thead>\n";
        if(bConFooter)
            sDataTableEsqueleto  +=                        "<tfoot>\n" +
                                                            "	<tr>\n" +
                                                            "       <th colspan='"+ (sTablaColumnas.length - 1) +"' style='text-align:right'>Total:</th>\n" +
                                                            "       <th></th>\n" +
                                                            "	</tr>\n" +
                                                            "</tfoot>\n";
                
        sDataTableEsqueleto  +=                             "<tbody>\n"  +
                                                            "</tbody>\n " +
                                                        "</table>\n " +
                                                    "</div>\n" +
                                                    "<!-- /.table-responsive -->\n" +
                                                "</div>\n" +
                                                "<!-- /.panel-body -->\n" +
                                            "</div>\n" +
                                        "<!-- /.panel -->\n" +
                                        "</div>\n" +
                                    "<!-- /.col-lg-12 -->\n" +
                                "</div>\n";
        return sDataTableEsqueleto;
    }//fDataTableEsqueleto
    
    /**
     * Genera una forma de dos columnas con los componentes que se le env&iacute;en como par&aacute;metro. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param alComponentesCol1 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 1(input text, radio button, checkbox...)
     * @param alComponentesCol2 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 2(input text, radio button, checkbox...)
     * @return La forma con sus componentes
     * <br><br>
     * <b>Ejemplo: </b><br>
     * ArrayList&lt;String&gt; alComponentesCol1 = new ArrayList&lt;&gt;(); <br>
     * alComponentesCol1.add(TableroControl.fInputText("Campo 1", "campo1", "" ,"Datos Campo 1","Tooltip Campo 1",false,""));
     * <br><br>
     * fFormLlenado2Columnas(alComponentesCol1, alComponentesCol2);
     */
    public static String fFormLlenado2Columnas(ArrayList<String> alComponentesCol1, ArrayList<String> alComponentesCol2){
        String sFormComponentes;
        String sComponentesCol1 = "";
        String sComponentesCol2 = "";
        
        for(String componente : alComponentesCol1){
            sComponentesCol1 += componente;
        }
        
        for(String componente : alComponentesCol2){
            sComponentesCol2 += componente;
        }
        
        sFormComponentes =  "<form id='frmDatos'>\n" +
                                "<div class='row'>\n" +
                                    "<div class='col-lg-6'>\n" +
                                        sComponentesCol1 +
                                    "</div>\n" +
                                    "<div class='col-lg-6'>\n" +
                                        sComponentesCol2 +
                                    "</div>\n" +                
                                "</div>\n" +
                            "</form>\n";
        return sFormComponentes;
        
    }//fFormLlenado2Columnas
    
    /**
     * Genera una forma de tres columnas con los componentes que se le env&iacute;en como par&aacute;metro. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param alComponentesCol1 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 1(input text, radio button, checkbox...)
     * @param alComponentesCol2 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 2(input text, radio button, checkbox...)
     * @param alComponentesCol3 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 3(input text, radio button, checkbox...)
     * @return La forma con sus componentes <br><br>
     * <b>Ejemplo: </b><br>
     * ArrayList&lt;String&gt; alComponentesCol1 = new ArrayList&lt;&gt;(); <br>
     * alComponentesCol1.add(TableroControl.fInputText("Campo 1", "campo1", "" ,"Datos Campo 1","Tooltip Campo 1",false,""));
     * <br><br>
     * fFormLlenado3Columnas(alComponentesCol1, alComponentesCol2,alComponentesCol3);
     */
    public static String fFormLlenado3Columnas(ArrayList<String> alComponentesCol1, ArrayList<String> alComponentesCol2,ArrayList<String> alComponentesCol3){
        String sFormComponentes;
        String sComponentesCol1 = "";
        String sComponentesCol2 = "";
        String sComponentesCol3 = "";
        
        for(String componente : alComponentesCol1){
            sComponentesCol1 += componente;
        }
        
        for(String componente : alComponentesCol2){
            sComponentesCol2 += componente;
        }
        
        for(String componente : alComponentesCol3){
            sComponentesCol3 += componente;
        }
        
        sFormComponentes =  "<form id='frmDatos'>\n" +
                                "<div class='row'>\n" +
                                    "<div class='col-lg-4'>\n" +
                                        sComponentesCol1 +
                                    "</div>\n" +
                                    "<div class='col-lg-4'>\n" +
                                        sComponentesCol2 +
                                    "</div>\n" +
                                    "<div class='col-lg-4'>\n" +
                                        sComponentesCol3 +
                                    "</div>\n" +
                                "</div>\n" +
                            "</form>\n";
        return sFormComponentes;
        
    }//fFormLlenado3Columnas
    
    /**
     * Genera una forma de cuatro columnas con los componentes que se le env&iacute;en como par&aacute;metro. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param alComponentesCol1 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 1(input text, radio button, checkbox...)
     * @param alComponentesCol2 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 2(input text, radio button, checkbox...)
     * @param alComponentesCol3 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 3(input text, radio button, checkbox...)
     * @param alComponentesCol4 (<b>*</b>) Componentes que ir&aacute;n dentro de la forma en la columna 4(input text, radio button, checkbox...)
     * @return La forma con sus componentes <br><br>
     * <b>Ejemplo: </b><br>
     * ArrayList&lt;String&gt; alComponentesCol1 = new ArrayList&lt;&gt;(); <br>
     * alComponentesCol1.add(TableroControl.fInputText("Campo 1", "campo1", "" ,"Datos Campo 1","Tooltip Campo 1",false,""));
     * <br><br>
     * fFormLlenado4Columnas(alComponentesCol1, alComponentesCol2,alComponentesCol3,alComponentesCol4);
     */
    public static String fFormLlenado4Columnas(ArrayList<String> alComponentesCol1, ArrayList<String> alComponentesCol2,ArrayList<String> alComponentesCol3,ArrayList<String> alComponentesCol4){
        String sFormComponentes;
        String sComponentesCol1 = "";
        String sComponentesCol2 = "";
        String sComponentesCol3 = "";
        String sComponentesCol4 = "";
        
        for(String componente : alComponentesCol1){
            sComponentesCol1 += componente;
        }
        
        for(String componente : alComponentesCol2){
            sComponentesCol2 += componente;
        }
        
        for(String componente : alComponentesCol3){
            sComponentesCol3 += componente;
        }
        
        for(String componente : alComponentesCol4){
            sComponentesCol4 += componente;
        }
        
        sFormComponentes =  "<form id='frmDatos'>\n" +
                                "<div class='row'>\n" +
                                    "<div class='col-lg-3'>\n" +
                                        sComponentesCol1 +
                                    "</div>\n" +
                                    "<div class='col-lg-3'>\n" +
                                        sComponentesCol2 +
                                    "</div>\n" +
                                    "<div class='col-lg-3'>\n" +
                                        sComponentesCol3 +
                                    "</div>\n" +
                                    "<div class='col-lg-3'>\n" +
                                        sComponentesCol4 +
                                    "</div>\n" +
                                "</div>\n" +
                            "</form>\n";
        return sFormComponentes;
        
    }//fFormLlenado4Columnas
    
    /**
     * Genera una etiqueta y un input calendario con un texto de ayuda dentro del mismo. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sEtiqueta Etiqueta que aparecer&aacute; arriba del input
     * @param sId   (<b>*</b>) Identificador del input(Sin espacios)
     * @param sTipoVal (<b>*</b>) Tipo de validaci&oacute;n del dato del input <br>
     *              &#09;<b>Tipos de validaci&oacute;n:</b><br>
     *              &#09; oblCal = Obligatorio <br> 
     *              &#09; fecha = valida fecha dd/mm/aaaa <br> 
     *              &#09; Si es mas de un tipo de validaci&oacute;n, deben ir separadas por <b>comas</b>. <br>
     *              &#09;<b>Si</b> el tipo de dato es <b>obligatorio(obl)</b>, debe ir primero. <br>
     *              &#09;<b>Ejemplo: </b> obligatorio y fecha = <b>obl,fecha</b><br>
     *              
     * @param sValor Value del input
     * @param sDescripcion Texto que aparecer&aacute; dentro del input
     * @param bDisabled Indica si el input se mostrar&aacute; deshabilitado(true = deshabilitado)
     * @param sEventosJS Eventos javascript. <br> &#09; Ejemplo: onKeyPress='fValidaTecla()'. <br> 
     *                   &#09; Los eventos <b>onMouseOver y onClick</b> ya se encuentran en uso. <br>
     *                   &#09; Los eventos que se agreguen <b>aplicar&aacute;n sobre el input</b>
     * @return input calendario
     * <br><br>
     * <b>Ejemplo: </b><br> fInputText("Fecha de Nacimiento ", "fechaNac","obl,fecha", "","dd/MM/yyyy","Ejemplo: 01/Julio/2014",false,"onKeyPress='fValidaTecla()'")
     * <br>
     * <b>Nota </b><br>
     * Para acceder al valor del input text concatenar itxt_ + sId <br>
     * Ejemplo: document.getElementById("itxt_fechaNac").value
     */
    public static String fInputCalendario(String sEtiqueta,String sId,String sTipoVal ,String sValor,String sDescripcion, boolean bDisabled, String sEventosJS){
        String sInputText;
        String sObligatorio = "";
        String sIdContenedor;
        String sParametroFuncionJS;
        String sFuncionJS;
        
        if(sTipoVal.trim().contains("obl"))
            sObligatorio = " * ";
        
        sIdContenedor = "sandbox-" + sId;
        sParametroFuncionJS = "(\"" + sIdContenedor + "\")"; 
        sFuncionJS =  "fDatePickerMuestra" + sParametroFuncionJS;
        
        sInputText =    "<div id='"+ sIdContenedor +"'>" +
                            "<div class='form-group input-group date'>\n" +
                            "   <label style='color:white;'>"+ sEtiqueta + sObligatorio +"</label>\n" +
                            "   <input type='text' id='itxt_"+ sId +"' name='itxt_"+ sId +"' value='"+ sValor +"' class='form-control' placeholder='"+ sDescripcion +"' "+ (bDisabled ? "disabled" : "") + " onClick='" + sFuncionJS + "' onMouseOver='" + sFuncionJS + "' >\n";
        if(!bDisabled)
            sInputText+=    "   <span class='input-group-btn' style='vertical-align: bottom'>\n" +
                            "       <button id='btn_"+ sId +"' name='btn_"+ sId +"' class='btn btn-default' type='button' onClick='" + sFuncionJS + "' onMouseOver='"+ sFuncionJS +"' "+ sEventosJS +" >\n" +
                            "       <i class='fa fa-calendar'></i>\n" +
                            "   </span>\n" +
                            "</div>\n";
        sInputText +=   "   <input type='hidden' id='itxt_"+ sId +"_vld' name='itxt_"+ sId +"_vld' value='"+ sTipoVal +"'>\n" +
                        "   <label style='color:white;' id='lbl_itxt_"+ sId +"_msg'></label>\n" +
                        "</div>";
                        
        return sInputText;
        
    }//fInputCalendario
    
    /**
     * Genera uno o un grupo de input checkbox y los muestra de manera normal o en l&iacute;nea. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sTitulo T&iacute;tulo que aparecer&aacute; en el encabezado del o de los checkbox. <br>
     * Dejar vac&iacute;o si no se requiere un t&iacute;tulo
     * @param bEnLinea (<b>*</b>) Indica si el o los checkbox van acomodados en l&iacute;nea(true) o normal(false)
     * @param alCheckBox (<b>*</b>) Datos del o de los checkbox.<br>
     * &#09; A continuaci&oacute;n se muestra la manera de llenar el arreglo del arraylist
     * <br>
     * &#09;<b>String[0] Etiqueta que aparece al lado del checkbox</b><br>
     * &#09;<b>String[1] Id del checkbox, sin espacios</b><br>
     * &#09;<b>String[2] Value del checkbox. Es el valor que guardar&aacute; en caso de ser seleccionado</b><br>
     * &#09;<b>String[3] Indica si el checkbox aparecer&aacute; seleccionado. Asignar el valor: checked o dejar vac&iacute;o </b><br>
     * @param sEventosJS Eventos javascript. <br> &#09; Ejemplo: onChange='fValidaPermisos()' 
     * @param bDisabled (<b>*</b>) Indica si aparecer&aacute; deshabilitado el checkbox(true = deshabilitado).
     * 
     * @return El o los Input Checkbox
     * <br><br>
     * <b>Ejemplo: </b> <br>
     *  ArrayList&lt;String[]&gt; alCheckBox = new ArrayList&lt;&gt;(); <br>
     *  alCheckBox.add(new String[]{"Ch1","idch1","123","checked"}); <br>
     *  fInputCheckBox("Grupo CheckBox",true ,alCheckBox,"onChange='fValidaPermisos()'") 
     * <br>
     * <b>Nota: </b><br>
     * Para acceder al valor del checkbox concatenar ich_ + Id  <br>
     * Ejemplo: document.getElementById("ich_idch1").value
     */
    public static String fInputCheckBox(String sTitulo,boolean bEnLinea ,ArrayList<String[]> alCheckBox, String sEventosJS, boolean bDisabled){
        String sInputCheckBox;
        String sEtiqueta, sId, sValue, sChecked;
        String sCssCheckBox;
        String sLabelIdVld = ""; //Id de la etiqueta de mensaje de validacion
       
        sCssCheckBox = bEnLinea?"class='checkbox-inline' style='vertical-align:top'":"class='checkbox'";
        
        sInputCheckBox = "<div class='form-group'>\n";
        if(!sTitulo.trim().equals(""))
            sInputCheckBox +="   <label style='color:white;'>"+ sTitulo +"</label>\n";
        
        for (String[] sCheckBox : alCheckBox) {
            sEtiqueta = sCheckBox[0].trim();
            sId = sCheckBox[1].trim();
            sValue = sCheckBox[2].trim();
            sChecked = sCheckBox[3].trim().equals("")?"":"checked='checked'";
            
            sInputCheckBox +="  <div "+ sCssCheckBox +">\n" +
                                    "<label style='color:white;'>\n" +
                                        "<input type='checkbox' id='ich_"+ sId +"' name='ich_"+ sId +"' value='"+ sValue +"' " + sChecked + " " + sEventosJS + " " + (bDisabled?"disabled":"") + " >"+ sEtiqueta +"\n" +
                                    "</label>\n" +
                                "</div>\n";
            sLabelIdVld += sId;
        }
        
        sInputCheckBox +=   "<label style='color:white;' id='lbl_"+ sLabelIdVld +"_msg'></label>\n";
        sInputCheckBox +="</div>\n";
        return sInputCheckBox;
    }//fInputCheckBox
    
    /**
     * Genera un input tipo hidden cuyo value es el nombre de una funci&oacute;n 
     * que ser&aacute; llamada desde otra funci&oacute;n
     * @param sFnClbk Nombre de la funci&oacute;n callback
     * @return Input tipo hidden
     */
    public static String fInputFnCallback(String sFnClbk)
    {
        return "<input id='sFnClbk'  type='hidden' value='" + sFnClbk + "'>\n";
    }
    
    /**
     * Genera uno o un grupo de input radio y los muestra de manera normal o en l&iacute;nea. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sTitulo T&iacute;tulo que aparecer&aacute; en el encabezado del o de los radio. <br>
     * Dejar vac&iacute;o si no se requiere un t&iacute;tulo
     * @param bEnLinea (<b>*</b>)Indica si el o los radio van acomodados en l&iacute;nea(true) o normal(false)
     * @param alRadio (<b>*</b>) Datos del o de los radio.<br>
     * &#09; A continuaci&oacute;n se muestra la manera de llenar el arreglo del arraylist
     * <br>
     * &#09; <b>String[0] es la Etiqueta que aparece al lado del radio</b><br>
     * &#09; <b>String[1] es Id del radio</b>.El id debe ser el mismo para un grupo de radios.<br>
     * &#09; <b>String[2] es el Value del radio. Es el valor que guardar&aacute; en caso de ser seleccionado</b><br>
     * &#09; <b>String[3] Indica si el radio aparecer&aacute; seleccionado. Asignar el valor: checked o dejar vac&iacute;o </b><br>
     * @param sEventosJS Eventos javascript. <br> &#09; Ejemplo: onChange='fValidaPermisos()' 
     * @return El o los Input Radio
     * <br><br>
     * <b>Ejemplo: </b><br>
     *  alRadio.add(new String[]{"rd1","idrd","111","checked"}); <br>
     *  alRadio.add(new String[]{"rd2","idrd","222",""}); <br>
     *  fInputRadio("Grupo Radio",false ,alRadio,"onChange='fValidaPermisos()'") <br>
     * <b>Nota</b><br>
     * Para acceder al valor del radio concatenar ird_ + sId <br>
     * Ejemplo: document.getElementById("ird_sexo").value
     */
    public static String fInputRadio(String sTitulo,boolean bEnLinea ,ArrayList<String[]> alRadio, String sEventosJS ){
        String sInputRadio;
        String sEtiqueta, sId, sValue, sChecked;
        String sCssRadio;
        
        sCssRadio = bEnLinea?"class='radio-inline' style='vertical-align:top'":"class='radio'";
        
        sInputRadio = "<div class='form-group'>\n";
        if(!sTitulo.trim().equals(""))
            sInputRadio +="   <label style='color:white;'>"+ sTitulo +"</label>\n";
        
        for (String[] sRadio : alRadio) {
            sEtiqueta = sRadio[0].trim();
            sId = sRadio[1].trim();
            sValue = sRadio[2].trim();
            sChecked = sRadio[3].trim().equals("")?"":"checked";
            
            sInputRadio +="  <div "+ sCssRadio +">\n" +
                                    "<label style='color:white;'>\n" +
                                        "<input type='radio' id='ird_"+ sId +"' name='ird_"+ sId +"' value='"+ sValue +"' " + sChecked + " " +  sEventosJS +  ">"+ sEtiqueta +"\n" +
                                    "</label>\n" +
                                "</div>\n";
        }
        sInputRadio +="</div>\n";
        return sInputRadio;
    }//fInputRadio
    
    /**
     * Genera una etiqueta y un input text con un texto de ayuda dentro del mismo. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sEtiqueta Etiqueta que aparecer&aacute; arriba del input
     * @param sId   (<b>*</b>) Identificador del input(Sin espacios)
     * @param sTipoVal (<b>*</b>) Tipo de validaci&oacute;n del dato del input <br>
     *              &#09;<b>Tipos de validaci&oacute;n:</b><br>
     *              &#09; obl = Obligatorio <br> &#09; num = Solo numeros <br> &#09; dec = N&uacute;mero con dos decimales <br> &#09; decpos = N&uacute;mero positivo con dos decimales <br> 
     *              &#09; ent = N&uacute;meros enteros <br> &#09; entpos = N&uacute;meros enteros positivos <br>
     *              &#09; mail = correo <br> &#09; char = solo caracteres sin n&uacute;meros <br> &#09; charNum = solo letras a-z, n&uacute;meros y espacio <br> 
     *              &#09; nocero = Mayor a cero <br> &#09; hora = valida hora HH:MM:SS <br> 
     *              &#09; fecha = valida fecha dd/mm/aaaa o dd-mm-aaaa <br> 
     *              &#09; Si es mas de un tipo de validaci&oacute;n, deben ir separadas por <b>comas</b>. <br>
     *              &#09;<b>Si</b> el tipo de dato es <b>obligatorio(obl)</b>, debe ir primero. <br>
     *              &#09;<b>Ejemplo: </b> obligatorio y numerico = <b>obl,num</b><br>
     *              
     * @param sValor Value del input
     * @param iMaxlength M&aacute;xima longitud de caracteres permitidos para capturar
     * @param sDescripcion Texto de aparecer&aacute; dentro del input
     * @param sTooltip Tooltip de ayuda para el usuario
     * @param bDisabled Indica si el input se mostrar&aacute; deshabilitado(true = deshabilitado)
     * @param sEventosJS Eventos javascript. <br> &#09; Ejemplo: onKeyPress='fValidaTecla()'. <br> 
     *                   &#09; El evento <b>onmouseover</b> ya se encuentra en uso para el tooltip.Si se desea usar dicho evento
     *                   habr&aacute; que dejar vacio el par&aacute;metro correspondiente al tooltip.
     * @return input text
     * <br><br>
     * <b>Ejemplo: </b><br> fInputText("Edad ", "edad","obl,num", "","Edad Actual","Ejemplo: 34",false)
     * <br>
     * <b>Nota </b><br>
     * Para acceder al valor del input text concatenar itxt_ + sId <br>
     * Ejemplo: document.getElementById("itxt_edad").value
     */
    public static String fInputText(String sEtiqueta,String sId,String sTipoVal ,String sValor ,int iMaxlength ,String sDescripcion,String sTooltip ,boolean bDisabled, String sEventosJS){
        String sInputText;
        String sMaxlength = "";
        String sObligatorio = "";
        
        if(sTipoVal.trim().contains("obl"))
            sObligatorio = " * ";
        
        if(iMaxlength > 0)
            sMaxlength = " maxlength = '" + iMaxlength + "' ";
        
        if(!sTooltip.trim().equals(""))
            sTooltip = " data-toggle=\"tooltip\" data-placement=\"bottom\" title=\""+ sTooltip +"\" onmouseover='fTooltipDespliega()' ";
        
        sInputText =    "<div class='form-group'>\n" +
                        "   <label style='color:white;'>"+ sEtiqueta + sObligatorio +"</label>\n" +
                        (!sTooltip.trim().equals("")?"<div class=\"tooltip-framework\">\n":"") +
                        "       <input type='text' id='itxt_"+ sId +"' name='itxt_"+ sId +"' value='"+ sValor +"' " + sMaxlength + " class='form-control' placeholder='"+ sDescripcion +"' "+ (bDisabled ? "disabled" : "") + " " + sEventosJS + " " + sTooltip + " >\n" +
                        (!sTooltip.trim().equals("")?"</div>\n":"") +
                        "   <input type='hidden' id='itxt_"+ sId +"_vld' name='itxt_"+ sId +"_vld' value='"+ sTipoVal +"'>\n" +
                        "   <label style='color:white;' id='lbl_itxt_"+ sId +"_msg'></label>\n" +
                        "</div>\n";
        return sInputText;
    }//fInputText
    
    
    /**
     * Genera un input tipo hidden con el valor 0 o 1, que indica si no hubo errores
     * durante la validaci&oacute;n de datos.
     * @param iProcesoVrf 0 = No, 1 = Si
     * @return Input tipo hidden
     */
    public static String fInputVerifica(int iProcesoVrf)
    {
        return "<input id='iProcesoVrf'  type='hidden' value='" + iProcesoVrf + "'>\n";
    }
    
    /**
     * Carga una leyenda con el texto que se especifique. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sLeyenda (<b>*</b>) Texto que se desea mostrar
     * @param sColor Color del texto de la leyenda. Si se deja vaciacute;o, muestra en color blanco.
     * @return La leyenda <br><br>
     * <b>Ejemplo: </b><br>
     *      fLeyenda("Los campos con asterisco * son obligatorios","orange");
     */
    public static String fLeyenda(String sLeyenda, String sColor){
        if(sColor.trim().equals(""))
            sColor = "white";
            
        return "<div class='row'> " +
                    "<div class='col-lg-12'>\n" +
                        " <h4 style='color:"+ sColor +";'>"+ sLeyenda +"</h4>\n" +
                    "</div>\n" +
                    "<!-- /.col-lg-12 -->\n " +
                "</div>\n";
    }//fLeyenda
    
    /**
     * Componente Panel. Es un recuadro con t&iacute;tulo en la parte superior, en el cual
     * se pueden insertar otros componentes dentro de el. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sTitulo T&iacute;tulo que se muestra en la parte superior del panel
     * @param alComponentes <b>*</b> Componentes que se insertar&aacute;n dentro del panel
     * @return El panel con sus componentes
     */
    public static String fPanel(String sTitulo, ArrayList<String> alComponentes){
        String sPanel;
        String sComponentes = "";
        
        for(String sComponente : alComponentes){
            sComponentes += sComponente;
        }
        
        sPanel ="<div class='panel panel-default'>\n" +
                "   <div class='panel-heading'>\n" +
                        sTitulo + "\n" +
                "   </div>\n" +
                "   <!-- /.panel-heading -->\n" +
                "   <div class='panel-body'>\n" +
                        sComponentes + "\n" +
                "   </div>\n" +
                "</div>\n";
        
        return sPanel;
    }//fPanel
    
    /**
     * Este panel es exclusivo y se muestra solo cuando la sesi&oacute;n del usuario ha caducado. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @return Panel con el mensaje de reinicio de sesi&oacute;n y un boton que redirecciona 
     * a la pantalla de iniciar sesi&oacute;n
     */
    public static String fPanelReiniciarSesion(){
        String sPanelReiniciarSesion;
        ArrayList<String> alComponentes = new ArrayList<>();
        
        alComponentes.add(fAlertInfo("Si desea continuar vuelva a iniciar sesi&oacute;n por favor..."));
        alComponentes.add(fButtonNormal("Iniciar Sesi&oacute;n", "iniciarSesion", false, "", "onClick='fReIniciarSesion()'"));
        sPanelReiniciarSesion = "<div class='row'>\n" +
                                    "<div class='col-lg-4'>\n" +
                                        "<form role='form'>\n" +
                                        "</form>\n" +
                                    "</div>\n" +
                                    "<div class='col-lg-4'>\n" +
                                        "<form role='form' style='margin-top:10px'>\n" +
                                            fPanel("La sesi&oacute;n ha finalizado...",alComponentes) +
                                        "</form>\n" +
                                    "</div>\n" +
                                    "<div class='col-lg-4'>\n" +
                                        "<form role='form'>\n" +
                                        "</form>\n" +
                                    "</div>\n" +
                                "</div>\n";
        
        return sPanelReiniciarSesion;
    }//fPanelReiniciarSesion
    
    /**
     * Genera un select(combo). <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sTitulo T&iacute;tulo del select
     * @param sId (<b>*</b>) Identificador del select
     * @param sOpciones (<b>*</b>) Opciones del combo(Son las que ser&aacute;n mostradas)
     * @param sValores (<b>*</b>) Value de cada una las opciones
     * @param sSeleccion Registro que ser&aacute; seleccionado de inicio(Dejar vac&iacute;o en caso que no se requiera alguno seleccionado)
     * @param sEventosJS Eventos javascript. <br> &#09; Ejemplo: onChange='fValidaPermisos()'
     * @return El Select(Combo)
     * <br><br>
     * <b>Ejemplo: </b> <br>
     * //Llenamos el combo <br>
     * String[] sComboOpciones = {"Opcion 1","Opcion 2"}; <br>
     * String[] sComboValores = {"66","99"}; <br>
     * 
     * fSelect("Select","usuario",sComboOpciones, sComboValores, "","onChange='fValidaPermisos()'") <br>
     * 
     * <b>Nota: </b> <br>
     * Para acceder al valor del select concatenar combo_ + sId <br>
     * Ejemplo: <br> document.getElementById(combo_procedimientos).value
     */
    public static String fSelect(String sTitulo, String sId ,String[] sOpciones, String[] sValores, String sSeleccion, String sEventosJS){
        String sSelect;
        
        sSelect =" <div class='form-group'>\n" +
                "	<label style='color:white;'>"+ sTitulo +"</label>\n" +
                "	<select class='form-control' id='combo_"+ sId +"' name='combo_"+ sId +"' "+  sEventosJS +  ">\n";
        for (int i = 0; i < sOpciones.length; i++) {
            sSelect +="     <option "+ (sValores[i].equals(sSeleccion) ? "selected" : "") +" value='"+ sValores[i] +"'>"+ sOpciones[i] +"</option>\n";
        }
        sSelect +="     </select>\n" +
                "  </div>\n";
        
        return sSelect;
    }//fSelect
    
    /**
     * Carga el encabezado de la vista. <br>
     * Los par&aacute;metros con asterisco <b>*</b> son obligatorios.
     * @param sTitulo (<b>*</b>) t&iacute;tulo de la vista
     * @return El t&iacute;tulo de la vista <br<br>
     * <b>Ejemplo: </b><br>
     *      fTituloVista("Usuarios");
     */
    public static String fTituloVista(String sTitulo){
        return "<div class='row'> " +
                    "<div class='col-lg-12'>\n" +
                        " <h1 class='page-header' style='color:white;'>"+ sTitulo +"</h1>\n" +
                    "</div>\n" +
                    "<div class='col-lg-12' id='divMensaje'></div>\n" +
                    "<!-- /.col-lg-12 -->\n " +
                "</div>\n";
    }//fTituloVista
    
    
//************************************************************************************************************************************
//************************************************************************************************************************************
//************************************************************************************************************************************
//************************************************************************************************************************************
//******************************************* EN PROCESO *****************************************************************************
//************************************************************************************************************************************
//************************************************************************************************************************************
//************************************************************************************************************************************
//************************************************************************************************************************************
    
    public static String fZZButtonOutlineConIcono(String sTitulo,String sId, boolean bDisabled, String sStyleExtra, String sEventosJS, String sIcono){
        String sButton;
        String sFontAwesomeIcono = "";
        sIcono = "fa-bitbucket"; //Ejemplo de la clase del plugin font-awesome que contiene el icono
        
        if(bDisabled)
            sStyleExtra += " background-color:silver; color:#428bca; ";
        
        if(!sIcono.trim().equals(""))
            sFontAwesomeIcono += "<i class='fa " + sIcono + "'></i>&nbsp;";
        
        sButton = "<button type='button' class='btn btn-outline btn-primary' style='margin:10px; "+ sStyleExtra +"' " + (bDisabled?"disabled":"") + ">"+ sFontAwesomeIcono +"&nbsp;Disabled Button</button>";
        
        return sButton;
    }//fZZButtonOutlineConIcono
    
    /**
     * Carga los datos en la DataTable de la modal
     * @return Los datos del DataTable que llena la modal
    */
    public static String fZZDataTableDatosModal(){
        String sDataTableDatosModal;
        
        //sSalida = "{\"data\":[[\"1\",\"2\",\"3\",\"4\",\"5\"],[\"6\",\"7\",\"8\",\"9\",\"10\"]]}";
        sDataTableDatosModal = "{\"data\":[";
        for (int i = 0; i < 100; i++) {
            sDataTableDatosModal += "[0, \"Usuario " + i + "\",\"Empresa " + i + "\",\"Telefono " + i + "\",\"Direccion " + i + "\",\"Ciudad " + i + "\"]";
            if(i<99)
                sDataTableDatosModal += ",";
        }
        sDataTableDatosModal += "]}";
        return sDataTableDatosModal;
    }//fZZDataTableDatosModal
    
    /**
     * Genera una etiqueta y un input text con un texto de ayuda dentro del mismo
     * @param sEtiqueta Etiqueta que aparecer&aacute; arriba del input
     * @param sIdInput Identificador del input(Sin espacios)
     * @param sTipoVal (*) Tipo de validaci&oacute;n del dato del input <br>
     *              &#09;<b>Tipos de validaci&oacute;n:</b><br>
     *              &#09; obl = Obligatorio <br> &#09; num = Solo numeros <br> &#09; dec = N&uacute;mero con dos decimales <br>  
     *              &#09; mail = correo <br> &#09; char = solo caracteres sin n&uacute;meros <br> &#09; charNum = solo letras a-z, n&uacute;meros y espacio <br> 
     *              &#09; nocero = Mayor a cero <br> &#09; hora = valida hora HH:MM:SS <br> 
     *              &#09; fecha = valida fecha dd/mm/aaaa o dd-mm-aaaa <br> 
     *              &#09; Si es mas de un tipo de validaci&oacute;n, debe ir el simbolo ampersan <b>&</b> entre ellos. <br>
     *              &#09;<b>Si</b> el tipo de dato es <b>obligatorio(obl)</b>, debe ir primero. <br>
     *              &#09;<b>Ejemplo: </b> obligatorio y numerico = <b>obl&num</b><br>
     * 
     * @param sTextoInformativo Texto de ayuda que aparecer&aacute; dentro del input
     * @param sTituloModal T&iacute;tulo de la modal
     * @return input text con bot&oacute;n modal
     */
    public static String fZZInputTextModal(String sEtiqueta,String sIdInput,String sTipoVal ,String sTextoInformativo, String sTituloModal){
        String sInputTextModal;
        
        sInputTextModal =    
                        "<div class='form-group input-group'>\n" +
                        "   <label style='color:white;'>"+ sEtiqueta +"</label>\n" +
                        "   <input id='itxt_"+ sIdInput +"' name='itxt_"+ sIdInput +"' class='form-control' placeholder='"+ sTextoInformativo +"'>\n" +
                        "   <input type='hidden' id='itxt_"+ sIdInput +"_vld' name='itxt_"+ sIdInput +"_vld' value='"+ sTipoVal +"'>\n" +
                        "   <label style='color:white;' id='lbl_itxt_"+ sIdInput +"_msg'></label>\n" +
                        "   <span class='input-group-btn' style='vertical-align: bottom'>\n" +
                        "       <button id='btn_"+ sIdInput +"' name='btn_"+ sIdInput +"' class='btn btn-default' type='button' onClick='onClickModal_"+sIdInput+"();'><i class='fa fa-search'></i>\n" +
                        "       </button>\n" +
                        "   </span>\n" +
                        "</div>\n" +
                        fZZModal(sTituloModal, sIdInput);
        //System.out.println(sInputTextModal);
        return sInputTextModal;
    }//fZZInputTextModal
    
    private static String fZZModal(String sTitulo, String sIdInput){
        String sModal, sIdModal;
        
        sIdModal = sIdInput;
        
        sModal = 
                "\n<div id = 'divModal'>"  +
                    "<!-- Modal -->\n" +
                    "<div class=\"modal fade\" id=\"modal_"+ sIdModal +"\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"my"+ sIdModal +"Label\" aria-hidden=\"true\">\n" +
                    "	<div class=\"modal-dialog\">\n" +
                    "		<div class=\"modal-content\">\n" +
                    "			<div class=\"modal-header\">\n" +
                    "				<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n" +
                    "				<h4 class=\"modal-title\" id=\"my"+ sIdModal +"Label\">"+ sTitulo +"</h4>\n" +
                    "			</div>\n" +
                    "			<div class=\"modal-body\">\n" +
                    "				<div  id=\"divTabla"+ sIdModal +"\" class=\"table-responsive\">\n" +
                    "					<table class=\"table table-striped table-bordered table-hover\" id=\"dataTable_"+ sIdModal +"\">\n" +
                    "						<thead>\n" +
                    "							<tr>\n" +
                    "								<th></th>\n" +
                    "								<th>Rendering engine</th>\n" +
                    "								<th>Browser</th>\n" +
                    "								<th>Platform(s)</th>\n" +
                    "								<th>Engine version</th>\n" +
                    "								<th>CSS grade</th>\n" +
                    "							</tr>\n" +
                    "						</thead>\n" +
                    "						<tbody>\n" +
                    "							<tr class=\"odd gradeX\">\n" +
                    "								<td><input type='checkbox' name=\"row1\" id=\"row1\" value=\"rojo\"></td>\n" +
                    "								<td>Trident</td>\n" +
                    "								<td>Internet Explorer 4.0</td>\n" +
                    "								<td>Win 95+</td>\n" +
                    "								<td class=\"center\">4</td>\n" +
                    "								<td class=\"center\">X</td>\n" +
                    "							</tr>\n" +
                    "							<tr class=\"odd gradeX\">\n" +
                    "								<td><input type='checkbox' name=\"row2\" id=\"row2\" value=\"azul\"></td>\n" +
                    "								<td>Trident naranja</td>\n" +
                    "								<td>Internet Explorer 5.0</td>\n" +
                    "								<td>Win 96+</td>\n" +
                    "								<td class=\"center\">5</td>\n" +
                    "								<td class=\"center\">Y</td>\n" +
                    "							</tr>\n" +
                    "						</tbody>\n" +
                    "					</table>\n" +
                    "				</div>\n" +
                    "			</div>\n" +
                    "			<div class=\"modal-footer\">\n" +
                    "				<button name=\"btnAceptar\" id=\"btnAceptar\" type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\" onClick='onClickModal_UsuarioAceptar()'>Aceptar</button>\n" +
                    "			</div>\n" +
                    "		</div>\n" +
                    "		<!-- /.modal-content -->\n" +
                    "	</div>\n" +
                    "	<!-- /.modal-dialog -->\n" +
                    "</div>\n" +
                    "<!-- /.modal -->\n" +
                "</div>";
        return sModal;
    }//fZZModal
    
}
