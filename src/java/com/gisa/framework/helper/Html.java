package com.gisa.framework.helper;

import com.gisa.framework.utils.Constantes;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gisa.framework.utils.Utils;
import com.gisa.framework.utils.Tipo;
import java.io.IOException;
import javax.servlet.ServletException;

public class Html {

    /**
     * Esta funci&oacute;n genera una lista de radios con el nombre del campos deseado.
     * 
     * @param sNombre Nombre del campo que sera tratado como radio.
     * @param sSeleccion Valor que estar@aacute; seleccionado.
     * @param sValores Valores de cada uno de los radio buttons.
     * @param sTextos Textos de cada uno de los radio buttons.
     * @param iAling  Determina si los radio buttons se posicionan vertical u horizontal.
     * @return String con la lista de radio buttons
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getCombo("menu",persona.getMen_num_ctrl(),"onchange='alert(this.value);'",request,response)</pre>
     * <br><br>.
     */
    public static String getRadio(String sNombre, String sSeleccion, String[] sValores, String[] sTextos, int iAling) {
        String sCadena = "";
        String sep = iAling == 0 ? "<br>" : "&nbsp;";

        if (sValores.length == sTextos.length) {
            for (int i = 0; i < sValores.length; i++) {
                sCadena += "<input type='radio' id='" + sNombre + "'  " + (sSeleccion.equals(sValores[i]) ? "checked=\"checked\"" : "") + " value='" + sValores[i] + "' name='" + sNombre + "' title=\"\" >" + sTextos[i] + sep;
            }
        }

        return sCadena;
    }

    public static String getRadio(String sNombre, String sSeleccion, String[] sValores, String[] sTextos, int iAling, String sOpciones, String[] sTabIndex) {
        String sSalida = "";
        String sep = iAling == 0 ? "<br>" : "&nbsp;";

        if (sValores.length == sTextos.length && sTabIndex.length == sTextos.length) {
            for (int i = 0; i < sValores.length; i++) {
                sSalida += "<input tabindex='" + sTabIndex[i] + "' " + sOpciones + " type='radio'  " + (sSeleccion.equals(sValores[i]) ? "checked=\"checked\"" : "") + " value='" + sValores[i] + "' name='" + sNombre + "' id='" + sNombre + "' title=\"\" >" + sTextos[i] + sep;
            }
        }

        return sSalida;
    }

    public static String getRadio(String sNombre, String sSeleccion, String[] sValores, String[] sTextos, int iAling, String sOpciones) {
        String sCadena = "";
        String sep = iAling == 0 ? "<br>" : "&nbsp;";

        if (sValores.length == sTextos.length) {
            for (int i = 0; i < sValores.length; i++) {
                sCadena += "<input " + sOpciones + " type='radio'  " + (sSeleccion.equals(sValores[i]) ? "checked=\"checked\"" : "") + " value='" + sValores[i] + "' name='" + sNombre + "' id='" + sNombre + "' title=\"\" >" + sTextos[i] + sep;
            }
        }

        return sCadena;
    }

    public static String getRadio(String sNombre, String sSeleccion, String[] sValores, String[] sTextos, int iAling, String sOpciones, int[] iTabIndex) {
        String sCadena = "";
        String sep = iAling == 0 ? "<br>" : "&nbsp;";

        if (sValores.length == sTextos.length && iTabIndex.length == sTextos.length) {
            for (int i = 0; i < sValores.length; i++) {
                sCadena += "<input tabindex='" + iTabIndex[i] + "' " + sOpciones + " type='radio'  " + (sSeleccion.equals(sValores[i]) ? "checked=\"checked\"" : "") + " value='" + sValores[i] + "' name='" + sNombre + "' id='" + sNombre + "' title=\"\" >" + sTextos[i] + sep;
            }
        }

        return sCadena;
    }

    public static String getRadio(String sNombre, String sSeleccion, String[] sValores, String[] sTextos, int iAling, String sOpciones, int[] iTabIndex, String sStyle) {
        String sCadena = "";
        sCadena += "\n<div class=\"" + sStyle + " alpha omega clearfix etiquetas\">";
        String sep = iAling == 0 ? "<br>" : "&nbsp;";

        if (sValores.length == sTextos.length && iTabIndex.length == sTextos.length) {
            for (int i = 0; i < sValores.length; i++) {
                sCadena += "<input tabindex='" + iTabIndex[i] + "' " + sOpciones + " type='radio'  " + (sSeleccion.equals(sValores[i]) ? "checked=\"checked\"" : "") + " value='" + sValores[i] + "' name='" + sNombre + "' id='" + sNombre + "' title=\"\" >" + sTextos[i] + sep;
            }
        }
        sCadena += "</div>";
        return sCadena;
    }

    /**
     * Esta funci@oacute;n genera el c@oacute;digo de un combo a partir de un cat@aacute;logo de la base de datos,<br>
     * y tiene configurable los eventos del combo.
     * 
     * @param sModelo Nombre del cat@aacute;logo del que se desea obtener el combo.
     * @param sSeleccion Valor que estar@aacute; seleccionado.
     * @param sOpciones  Programaci@oacute;n java script del combo
     * @param req  request  de la p@aacute;gina
     * @param res  response de la p@aacute;gina
     * @return String con el c@oacute;digo del combo.
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getCombo("menu",persona.getMen_num_ctrl(),"onchange='alert(this.value);'",request,response)</pre>
     * <br><br>.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static String getCombo(String sModelo, String sSeleccion, String sOpciones, HttpServletRequest req, HttpServletResponse res) {
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/" + sModelo + "?A=Combo&pSeleccion=" + sSeleccion + "&pOpciones=" + sOpciones);
            rd.include(req, res);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace();
        }

        return req.getAttribute("combo" + cambiarMayus1aLetra(sModelo)).toString();
    }
    

    /**
     * Esta funci@oacute;n genera el c@oacute;digo de un combo a partir de un cat@aacute;logo de la base de datos,<br>
     * y tiene configurable los eventos del combo.
     * 
     * @param sModelo Nombre del cat@aacute;logo del que se desea obtener el combo.
     * @param iSeleccion Valor que estar@aacute; seleccionado.
     * @param sOpciones  Programacion java script del combo
     * @param req  request  de la p@aacute;gina
     * @param res  response de la p@aacute;gina
     * @return String con el c@oacute;digo del combo.
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getCombo("menu",persona.getMen_num_ctrl(),"onchange='alert(this.value);'",request,response)</pre>
     * <br><br>.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static String getCombo(String sModelo, int iSeleccion, String sOpciones, HttpServletRequest req, HttpServletResponse res) {
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/" + cambiarMayus1aLetra(sModelo) + "?A=Combo&pSeleccion=" + iSeleccion + "&pOpciones=" + sOpciones);
            rd.include(req, res);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace();
        }
        return req.getAttribute("combo" + cambiarMayus1aLetra(sModelo)).toString();
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static String getCombo(String sNombre, String[] sOpciones, String sSeleccion, String[] sValores, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        try {
            sCadena += "<Select name='" + sNombre + "' id='" + sNombre + "' tabindex='" + iTabIndex + "' title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\">";
            for (int i = 0; i < sOpciones.length; i++) {
                sCadena += "<option " + ((sValores[i].equals(sSeleccion)) ? "selected" : "") + " value='" + sValores[i] + "'>" + sOpciones[i] + "</option>";
            }
            sCadena += "</Select>";
            sCadena += "\n</span></div>";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sCadena;
    }

    /**
     * Esta funci@oacute;n genera el c@oacute;digo de un combo a partir de un cat@aacute;logo de la base de datos,<br>
     * el cual esta filtrado por un padre y tiene configurable los eventos del combo.
     * 
     * @param sModelo Nombre del cat@aacute;logo del que se desea obtener el combo.
     * @param sPadre  Id del padre del combo
     * @param iSeleccion Valor que estar@aacute; seleccionado.
     * @param sOpciones  Programaci@oacute;n java script del combo
     * @param sPrivilegio
     * @param req  request  de la p@aacute;gina
     * @param res  response de la p@aacute;gina
     * @return String con el c@oacute;digo del combo.
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getComboByPadre("menu","100",persona.getMen_num_ctrl(),"onchange='alert(this.value);'",request,response)</pre>
     * <br><br>.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static String getComboByPadre(String sModelo, String sPadre, int iSeleccion, String sOpciones, String sPrivilegio, HttpServletRequest req, HttpServletResponse res) {
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/" + cambiarMayus1aLetra(sModelo.toLowerCase()) + "?A=" + Tipo.COMBO + "&pSeleccion=" + iSeleccion + "&pOpciones=" + sOpciones + "&pPadre=" + sPadre);
            rd.include(req, res);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace();
        }
        return req.getAttribute("combo" + cambiarMayus1aLetra(sModelo)).toString();
    }

    /**
     * Esta funci@oacute;n genera el c@oacute;digo de un combo a partir de un cat@aacute;logo de la base de datos,<br>
     * el cual esta filtrado por un padre y tiene configurable los eventos del combo.
     * 
     * @param sModelo Nombre del cat@aacute;logo del que se desea obtener el combo.
     * @param sPadre  Id del padre del combo
     * @param sSeleccion Valor que estar@aacute; seleccionado.
     * @param sOpciones  Programacion java script del combo
     * @param req  request  de la p@aacute;gina
     * @param res  response de la p@aacute;gina
     * @return String con el c@oacute;digo del combo.
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getComboByPadre("menu","100",persona.getMen_num_ctrl(),"onchange='alert(this.value);'",request,response)</pre>
     * <br><br>.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static String getComboByPadre(String sModelo, String sPadre, String sSeleccion, String sOpciones, HttpServletRequest req, HttpServletResponse res) {
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/" + cambiarMayus1aLetra(sModelo.toLowerCase()) + "c?Tipo=" + Tipo.COMBO + "&pSeleccion=" + sSeleccion + "&pOpciones=" + sOpciones + "&pPadre=" + sPadre);
            rd.include(req, res);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace();
        }

        return req.getAttribute("combo" + cambiarMayus1aLetra(sModelo)).toString();
    }

    /**
     * Esta funci@oacute;n genera el c@oacute;digo de un campo hidden con el id y el name del la variable sNombre<br>
     * y teniendo como valor el parametro sValor.
     * 
     * @param sNombre Nombre y id del campo oculto.
     * @param sValor  Valor que tendra el campo oculto.
     * @return String con el c@oacute;digo del campo hidden.
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getHidden("per_num_ctrl","100",request,response)</pre>
     * <br><br>.
     */
    public static String getHidden(String sNombre, int sValor) {
        String sCadena = "";
        sCadena += "<input type='hidden' value='" + sValor + "' name='" + sNombre + "' id='" + sNombre + "' />\n";
        return sCadena;
    }

    /**
     * Esta funci@oacute;n genera el c@oacute;digo de un campo hidden con el id y el name del la variable sNombre<br>
     * y teniendo como valor el parametro sValor.
     * 
     * @param sNombre Nombre y id del campo oculto.
     * @param sValor  Valor que tendra el campo oculto.
     * @return String con el c@oacute;digo del campo hidden.
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getHidden("per_num_ctrl","100",request,response)</pre>
     * <br><br>.
     */
    public static String getHidden(String sNombre, String sValor) {
        String sCadena = "";
        sCadena += "<input type='hidden' value='" + sValor + "' name='" + sNombre + "' id='" + sNombre + "' />\n";
        return sCadena;
    }

    /**
     * Esta funci@oacute;n retorna el valor de un campo de la tabla pasada como modelo y los filtros aplicados.
     * 
     * @param sModelo Nombre del modelo.
     * @param sNombreCampo  nombre del campo que quieres consultar.
     * @param sValor  Valor que pasa como condici@oacute;n para el filtrado.
     * @param sCampoComparar  Nombre del campo por el que se filtrara.
     * @param req  request  de la p@aacute;gina
     * @param res  response de la p@aacute;gina
     * @return String con el valor del campo.
     * <br>
     * <b>Ejemplo :</b><pre>  Html.getCampoModelo("persona","per_nombre","1","per_num_ctrl",request,response)</pre>
     * <br><br>.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static String getCampoModelo(String sModelo, String sNombreCampo, String sValor, String sCampoComparar, HttpServletRequest req, HttpServletResponse res) {
        String sQuery = "select " + sNombreCampo + " from " + sModelo + " where " + sCampoComparar + " = " + sValor + ";";
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/QueryController?&pQuery=" + sQuery);
            rd.include(req, res);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace();
        }

        return String.valueOf(req.getAttribute("sResultado"));
    }

    /**
     *
     * @param sContenido Controlador
     * @param sCampo Nombre del campo de texto
     * @param oValor valores preestablecidos de la modal
     * @param sNombrefuncion Funci@oacute;n que ser@aacute; ejecutada al final de la selecci@oacute;n de la modal
     * @param sLabel Titulo que ser@aacute; mostrado en la pantalla leido del Etiquetas.properties
     * @param sPrivilegio privilegio que ser@aacute; ejecutado en el Controlador
     * @param sTamanos Tamanos de los campos de texto
     * @param sParametros
     * @return C@oacute;digo html que dibuja el modal.
     */
    public static String getModal(String sContenido, String sCampo, Object[] oValor, String sNombrefuncion, String sLabel, String sPrivilegio, String[] sTamanos, String sParametros) {
        String sCadena = "";
        sCadena += "\n     <div class=\"grid_16 alpha omega clearfix\" style='height:30px;vertical-align:bottom;'>";
        if (!sLabel.equals("")) {
            sCadena += "\n\t   <div  class=\"grid_2 alpha omega clearfix \">" + Utils.getEtiqueta(sLabel) + "</div>";
        }
        sCadena += "\n\t\t <div class=\"grid_4 alpha omega clearfix\">";
        sCadena += "\n\t\t <input style='vertical-align: top;padding: 0 0 0 0;' type=\"text\"  size=\"" + sTamanos[0] + "\" id=\"" + sCampo + "_clave\" name=\"" + sCampo + "_clave\" value=\"" + ((oValor[1].equals(0)) ? "" : oValor[0]) + "\" readonly=\"readonly\" />";
        sCadena += "\n\t\t <img style='vertical-align: top;padding: 0 0 0 0;' class=\"modalLupa\" src=\"" + Constantes.WEBROOT + "/images/boton_ayuda.png\" onclick=\"showPopWin('" + Constantes.WEBROOT + "/views/modal/modal.jsp?sModelo=" + sContenido + "&sLabel=" + sLabel + "" + sParametros + "&sPrivilegio=" + sPrivilegio + "', 575, 375," + sNombrefuncion + ");\">";
        sCadena += "\n\t\t <input type=\"hidden\"  id=\"" + sCampo + "\" name=\"" + sCampo + "\" value=\"" + oValor[1] + "\" />";
        sCadena += "\n\t\t </div>";
        sCadena += "\n\t\t <div  class=\"grid_10 alpha omega clearfix\">";
        sCadena += "\n\t\t <input   class=\"cssEstiloFondoTD\" size=\"" + sTamanos[1] + "\" style=\"border: 0\" type=\"text\" id=\"" + sCampo + "_nombre\" name=\"" + sCampo + "_nombre\" value=\"" + ((oValor[1].equals(0)) ? "" : oValor[2]) + "\" readonly=\"readonly\" />";
        sCadena += "\n\t\t <em  id=\"" + sCampo + "_clave_e\"></em>";
        sCadena += "\n\t\t </div>";
        sCadena += "\n\t\t </div>";
        return sCadena;

    }

    /**
     * @param sModelo
     * @param sCampo Nombre del campo de texto
     * @param oValor valores prestablecidos de la modal
     * @param sNombrefuncion Funci@oacute;n que ser@aacute; ejecutada al final de la selecci@acute;n de la modal
     * @param sLabel Titulo que ser@aacute; mostrado en la pantalla le@iacute;do del Etiquetas.properties
     * @param sPrivilegio privilegio que ser@aacute; ejecutado en el Controlador
     * @param sTamanos Tamanos de los campos de texto
     * @param sParametros
     * @param sStyle
     * @param habilitado
     * @param iTabIndex
     * @return C@oacute;digo html que dibuja el modal.
     */
    public static String getModal(String sModelo, String sCampo, Object[] oValor, String sNombrefuncion, String sLabel, String sPrivilegio, String[] sTamanos, String sParametros, String sStyle, boolean habilitado, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class='campos'>";
        sCadena += "<input tabindex='" + iTabIndex + "' style='vertical-align: top;padding: 0 0 0 0;' type=\"text\"  size=\"" + sTamanos[0] + "\" id=\"" + sCampo + "_clave\" name=\"" + sCampo + "_clave\" value=\"" + ((oValor[1].equals(0)) ? "" : oValor[0]) + "\" " + ((habilitado) ? "" : "readonly=\"readonly\"") + " /></span>";
        sCadena += "&nbsp;<img style='vertical-align: top;padding: 0 0 0 0;' class=\"modalLupa\" src=\"" + Constantes.WEBROOT + "/images/boton_ayuda.png\" onclick=\"showPopWin('" + Constantes.WEBROOT + "/views/modal/modal.jsp?sModelo=" + sModelo + "&sLabel=" + sLabel + "" + sParametros + "&sPrivilegio=" + sPrivilegio + "', 575, 375," + sNombrefuncion + ");\">";
        sCadena += "\n</div>";
        return sCadena;

    }

    public static String getModal(String sContenido, String sCampo, Object[] oValor, String sNombrefuncion, String sLabel, String sPrivilegio, String[] sTamanos, String sParametros, String[] sStyle, boolean habilitado, int tabIndex) {
        String sCadena = "";
        if (!sLabel.equals("")) {
            sCadena += "\n\t<div  class=\"" + sStyle[1] + " alpha omega clearfix  etiquetas\">" + Utils.getEtiqueta(sLabel) + "</div>";
        }
        sCadena += "\n\t\t <div class=\"" + sStyle[2] + " alpha omega clearfix  campos\">";
        sCadena += "\n\t\t <input tabindex='" + tabIndex + "'  style='vertical-align: top;padding: 0 0 0 0;' type=\"text\"  size=\"" + sTamanos[0] + "\" id=\"" + sCampo + "_clave\" name=\"" + sCampo + "_clave\" value=\"" + ((oValor[1].equals(0)) ? "" : oValor[0]) + "\" " + ((habilitado) ? "" : "readonly=\"readonly\"") + " />";
        sCadena += "\n\t\t <img style='vertical-align: top;padding: 0 0 0 0;' class=\"modalLupa\" src=\"" + Constantes.WEBROOT + "/images/boton_ayuda.png\" onclick=\"showPopWin('" + Constantes.WEBROOT + "/views/modal/modal.jsp?sModelo=" + sContenido + "&sLabel=" + sLabel + "" + sParametros + "&sPrivilegio=" + sPrivilegio + "', 575, 375," + sNombrefuncion + ");\">";
        sCadena += "\n\t\t <input type=\"hidden\"  id=\"" + sCampo + "\" name=\"" + sCampo + "\" value=\"" + oValor[1] + "\" />";
        sCadena += "\n\t\t </div>";
        sCadena += "\n\t\t <div class=\"" + sStyle[3] + "  alpha omega clearfix\">";
        sCadena += "\n\t\t <input   class=\"cssEstiloFondoTD campos \" size=\"" + sTamanos[1] + "\" style=\"border: 0\" type=\"text\" id=\"" + sCampo + "_nombre\" name=\"" + sCampo + "_nombre\" value=\"" + ((oValor[1].equals(0)) ? "" : oValor[2]) + "\" readonly=\"readonly\" />";
        sCadena += "\n\t\t <em  id=\"" + sCampo + "_clave_e\"></em>";
        sCadena += "\n\t\t </div>";
        return sCadena;

    }

    /**
     * Esta funci@oacute;n genera el c@oacute;digo de una ventana modal que va a cargar un grid
     * con un cat@aacute;logo de la base de datos o con el resultado de un query enviado.
     * <br>
     * @param sContenido Nombre del cat@aacute;logo a cargar o el query a ejecutar.
     * @param sCampo Nombre del campo donde se que va recibir el valor de retorno de la modal.
     * @param sCampoPadre
     * @param sValorPadre
     * @param oValor Valor del campo, que sirve para mantener el contenido del campo.
     * @param sNombrefuncion Especifica la funci@oacute;n javascript que sera ejecutada despues de cerrar la modal.
     * @param sLabel Etiqueta del campo.
     * @param sPrivilegio Determina si la modal va a contener un cat@aacute;logo o va a ejecutar un query.
     * @return String con el c@oacute;digo de la ventana modal.
     * <br>
     * @example
     * <b>Ejemplo :</b> &nbsp;{@code Html.getModal("estado","est_num_ctrl",request.getAttribute("est_num_ctrl"),"cambiaGrid","Estado :",Types.MODAL_CATALOGO,basePath)}
     * <br><br>.
     * */
    public static String getModalByPadre(String sContenido, String sCampo, String sCampoPadre, String sValorPadre, Object[] oValor, String sNombrefuncion, String sLabel, String sPrivilegio) {
        String sCadena = "\n";

        sCadena += "\t<table width ='100%' class=\"cssEstiloFondoTD\" border='0' heigth='10px' >\n"
                + "\t\t<tr>\n";
        if (sLabel.equals("")) {
        } else {
            sCadena += "\t\t\t\t<td class=\"cssEstiloFondoTD\" width='15%'>" + sLabel + " </td>\n";
        }
        sCadena += "\t\t\t<td width ='10%' class=\"cssEstiloFondoTD\">\n"
                + "\t\t\t\t\t<span  class=\"campos\" ><input type=\"text\" id=\"" + sCampo + "_clave\" name=\"" + sCampo + "_clave\" value=\"" + ((oValor[1].equals("0")) ? "" : oValor[0]) + "\" readonly=\"readonly\" />\n"
                + "\t\t\t\t<input type=\"hidden\" id=\"" + sCampo + "\" name=\"" + sCampo + "\" value=\"" + (oValor[1].equals("0") ? "" : oValor[1]) + "\" />\n"
                + "\t\t\t</td>\n"
                + "\t\t\t\t<td width ='10%' class=\"cssEstiloFondoTD\">\n"
                + "\t\t\t\t<input type=\"button\" class=\"button_ayuda\"  value=\" \" onclick=\"showModal" + sCampo + "();\" >\n"
                + "\t\t\t\t</td>\n"
                + "\t\t\t<td width ='70%' class=\"cssEstiloFondoTD\">\n"
                + "\t\t\t\t<input  size=\"50\" style=\"border: 0\" type=\"text\" id=\"" + sCampo + "_nombre\" name=\"" + sCampo + "_nombre\" value=\"" + (oValor[1].equals("0") ? "" : oValor[2]) + "\" readonly=\"readonly\" class=\"cssEstiloFondoTD\" />\n"
                + "\t\t\t\t<em  id=\"" + sCampo + "_clave_e\"></em>"
                + "\t\t</tr>\n"
                + "\t</table>\n"
                + "\t<script type=\"text/javascript\"> \n"
                + "\t  function showModal" + sCampo + "(){ \n"
                + "\t      if(elemento(\"" + sCampoPadre + "\").value==''||elemento(\"" + sCampoPadre + "\").value=='0'){\n"
                + "\t          alert(\"Es necesario aplicar el filtro anterior.\");\n"
                + "\t          return ;\n"
                + "\t      }\n"
                + "\t    showPopWin('" + Constantes.WEBROOT + "views/generales/modal_padre.jsp?Modelo=" + sContenido + "&A=" + sPrivilegio + "&Titulo=" + sLabel + "&pPadre=" + sCampoPadre + "&pPadreVal='+document.getElementById('" + sCampoPadre + "').value, 575, 375," + sNombrefuncion + "); \n"
                + "\t  }\n"
                + "\t</script> \n";


        return sCadena;
    }

    /**
     * Modal by padre
     * @param sContenido
     * @param sCampo
     * @param sCampoPadre
     * @param sValorPadre
     * @param oValor
     * @param sNombrefuncion
     * @param sLabel
     * @param sPrivilegio
     * @param sTamanos
     * @return
     */
    public static String getModalByPadre(String sContenido, String sCampo, String sCampoPadre, String sValorPadre, Object[] oValor, String sNombrefuncion, String sLabel, String sPrivilegio, String[] sTamanos) {
        String sCadena = "\n";

        sCadena += "\t<table width ='100%' class=\"cssEstiloFondoTD\" border='0' heigth='10px' >\n"
                + "\t\t<tr>\n";
        if (sLabel.equals("")) {
        } else {
            sCadena += "\t\t\t\t<td class=\"cssEstiloFondoTD\" width='" + sTamanos[0] + "'><p>" + sLabel + "</p> </td>\n";
        }
        sCadena += "\t\t\t<td width ='" + sTamanos[1] + "' class=\"cssEstiloFondoTD\">\n"
                + "\t\t\t\t\t<span  class=\"campos\" ><input size=\"" + sTamanos[1] + "\"  type=\"text\" id=\"" + sCampo + "_clave\" name=\"" + sCampo + "_clave\" value=\"" + ((oValor[0].equals("0")) ? "" : oValor[0]) + "\" readonly=\"readonly\" />\n"
                + "\t\t\t\t<input type=\"hidden\" id=\"" + sCampo + "\" name=\"" + sCampo + "\" value=\"" + oValor[1] + "\" />\n"
                + "\t\t\t</td>\n"
                + "\t\t\t\t<td width ='' class=\"cssEstiloFondoTD\">\n"
                + "\t\t\t\t<input type=\"button\" class=\"button_ayuda\"  value=\" \" onclick=\"showModal" + sCampo + "();\" >\n"
                + "\t\t\t\t</td>\n"
                + "\t\t\t<td width ='" + sTamanos[2] + "' class=\"cssEstiloFondoTD\">\n"
                + "\t\t\t\t<input  size=\"" + sTamanos[2] + "\" style=\"border: 0\" type=\"text\" id=\"" + sCampo + "_nombre\" name=\"" + sCampo + "_nombre\" value=\"" + oValor[2] + "\" readonly=\"readonly\" class=\"cssEstiloFondoTD\" />\n"
                + "\t\t\t\t<em  id=\"" + sCampo + "_clave_e\"></em>"
                + "\t\t</tr>\n"
                + "\t</table>\n"
                + "\t<script type=\"text/javascript\"> \n"
                + "\t  function showModal" + sCampo + "(){ \n"
                + "\t      if(elemento(\"" + sCampoPadre + "\").value==''||elemento(\"" + sCampoPadre + "\").value=='0'){\n"
                + "\t          alert(\"Es necesario aplicar el filtro anterior.\");\n"
                + "\t          return ;\n"
                + "\t      }\n"
                + "\t    showPopWin('" + Constantes.WEBROOT + "views/generales/modal_padre.jsp?Modelo=" + sContenido + "&A=" + sPrivilegio + "&Titulo=" + sLabel + "&pPadre=" + sCampoPadre + "&pPadreVal='+document.getElementById('" + sCampoPadre + "').value, 575, 375," + sNombrefuncion + "); \n"
                + "\t  }\n"
                + "\t</script> \n";

        return sCadena;
    }

    /**
     * Modal by Padre Grid 16
     * @param sContenido
     * @param sCampo
     * @param sCampoPadre
     * @param sValorPadre
     * @param oValor
     * @param sNombrefuncion
     * @param sLabel
     * @param sPrivilegio
     * @param sTamanos
     * @return
     */
    public static String getModalByPadreG(String sContenido, String sCampo, String sCampoPadre, String sValorPadre, Object[] oValor, String sNombrefuncion, String sLabel, String sPrivilegio, String[] sTamanos) {
        String sCadena = "\n";
        sCadena += "\n     <div  class=\"grid_8 alpha omega clearfix cssEstiloFondoTD\" >";
        sCadena += "\n\t\t <div class=\"grid_2 alpha omega clearfix \">" + sLabel + "</div>";
        sCadena += "\n\t\t <div  class=\"grid_2 alpha omega clearfix \">";
        sCadena += "\n\t\t <input type=\"text\"  size=\"" + sTamanos[0] + "\" id=\"" + sCampo + "_clave\" name=\"" + sCampo + "_clave\" value=\"" + ((oValor[1].equals(0)) ? "" : oValor[0]) + "\" readonly=\"readonly\" />";
        sCadena += "\n\t\t <input type=\"hidden\" id=\"" + sCampo + "\" name=\"" + sCampo + "\" value=\"" + oValor[1] + "\" />";
        sCadena += "\n\t   </div>";
        sCadena += "\n\t   <div  class=\"grid_1 alpha omega clearfix \">";
        sCadena += "\n\t\t <img  class=\"modalLupa\"  src=\"" + Constantes.WEBROOT + "/images/boton_ayuda.png\" value=\"" + oValor[1] + "\" onclick=\"showPopWin('" + Constantes.WEBROOT + "views/generales/modal_padre.jsp?Modelo=" + sContenido + "&A=" + sPrivilegio + "&pPadre=" + sCampoPadre + "&pPadreVal='+document.getElementById('" + sCampoPadre + "').value, 575, 375," + sNombrefuncion + ");\" >";
        sCadena += "\n\t\t </div>";
        sCadena += "\n\t\t <div class=\"grid_3 alpha omega clearfix \">";
        sCadena += "\n\t\t <input  size=\"" + sTamanos[1] + "\" style=\"border: 0\" type=\"text\" id=\"" + sCampo + "_nombre\" name=\"" + sCampo + "_nombre\" value=\"" + ((oValor[1].equals(0)) ? "" : oValor[2]) + "\" readonly=\"readonly\" class=\"cssEstiloFondoTD\" />";
        sCadena += "\n\t\t <em  id=\"" + sCampo + "_e\"></em>";
        sCadena += "\n\t\t </div>";
        sCadena += "\n     </div>";

        return sCadena;
    }

    /**
     * Obtener un campo descriptivo  crea un campo num_ctrl y "muestra un nombre o descripci@oacute;n"
     * @param sNombre Nombre del campo
     * @param sValor Arreglo valor del num_ctrl y del nombre o descripci@oacute;n
     * @param sTitulo
     * @param sStyle
     * @param iTabIndex
     * @return Cadena
     */
    public static String getCampoDescriptivo(String sNombre, String[] sValor, String sTitulo, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\">";
        sCadena += "\n\t" + sTitulo + "<input name=\"" + sNombre + "_nombre\"  id=\"" + sNombre + "_nombre\" type=\"text\" value=\"" + sValor[1] + "\"  size=\"40\" tabindex=\"" + iTabIndex + "\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\"  style=\"border:0;background-color: transparent;\"/>"
                + "\n\t<input name=\"" + sNombre + "\"  id=\"" + sNombre + "\" type=\"hidden\" value=\"" + sValor[0] + "\" />"
                + "\n</div>";
        return sCadena;
    }

    @SuppressWarnings("UnusedAssignment")
    public static String getCalendar(String sNombre, String sFormatoFecha, String sValor, boolean bEnabled, String basePath, String sStyle, int iTabIndex) {
        //si el formato es una cadena vacia se usa por default el formato dd/mm/yyyy
        String formatojs = "99/99/9999"; //formato javascript
        if (sValor.equals("")) {
            switch (sFormatoFecha) {
                case "dd/mm/yy":
                    formatojs = "99/99/9999";
                    break;
                case "yy/mm/dd":
                    formatojs = "99/99/99";
                    break;
                case "dd-mm-yyyy":
                    formatojs = "99-99-99999";
                    break;
                default:
                    return "Formato de fecha incompatible";
            }
        }
        //si el formato es una cadena vacia se usa por default el formato dd/mm/yyyy
        if (sFormatoFecha.equals("")) {
            sFormatoFecha = "dd/mm/yyyy";
        }
        String sCadena = getCampoTexto(sNombre, sValor, 10, 10, "", sStyle, iTabIndex) + "&nbsp;&nbsp;";
        sCadena += "\n"
                + "\n<script type=\"text/javascript\">\n"
                + "\n\t$(function() {\n"
                + "\n\t\t$.datepicker.setDefaults($.extend({showMonthAfterYear: false }, $.datepicker.regional['es']));\n"
                + "\n\t\t$('#" + sNombre + "').datepicker({showOn: 'button', buttonImage: '" + basePath + "views/js/calendar/calendar.gif', buttonImageOnly: true});\n"
                + "\n\t\t$('#" + sNombre + "').datepicker('option', {dateFormat: '" + sFormatoFecha + "'});\n"
                + "\n\t\t$(\"#" + sNombre + "\").mask2(\"" + formatojs + "\");";
        if (!bEnabled) {
            sCadena += "\n\t$('#" + sNombre + "').datepicker('disable');\n";
        }
        sCadena += "});\n";


        sCadena += "</script>";
        sCadena += " \n";

        return sCadena;
    }

    /**
     * generar boton
     * @param sNombre Nombre etiqueta del titulo del boton
     * @param sAccion funci@oacute;n de javascript que ser@aacute; ejecutada.
     * @param sImagen
     * @param tabIndex
     * @return    cadena
     *
     */
    public static String getBoton(String sNombre, String sAccion, String sImagen, int tabIndex) {
        return "\n<button name='" + sNombre + "' id='" + sNombre + "' onclick=\"javascript:" + sAccion + "()\" tabindex='" + tabIndex + "' type=\"button\" class=\"boton\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\"><span class=\"" + sImagen + "\">" + Utils.getEtiqueta(sNombre) + "</span></button>";
    }

    public static String getBoton(String sNombre, String sAccion, String sImagen, String sStyle, int tabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\">";
        sCadena += "\n<button name='" + sNombre + "' id='" + sNombre + "' onclick=\"javascript:" + sAccion + "()\" tabindex='" + tabIndex + "' type=\"button\" class=\"boton\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\"><span class=\"" + sImagen + "\">" + Utils.getEtiqueta(sNombre) + "</span></button>";
        sCadena += "</div>";
        return sCadena;
    }

    public static String getBotonClass(String sNombre, String sAccion, String sImagen, String sClass, int tabIndex) {
        String sCadena = "\n<button name='" + sNombre + "' id='" + sNombre + "' onclick=\"javascript:" + sAccion + "()\" tabindex='" + tabIndex + "' type=\"button\" class=\""+sClass+"\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\"><span class=\"" + sImagen + "\">" + Utils.getEtiqueta(sNombre) + "</span></button>";
        return sCadena;
    }

    public static String getCampoHora(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int iTabIndex) {
        String sCadena = "";

        sCadena += getCampoTexto(sNombre, sValor, ancho, tamMax, sCadena, sStyle, iTabIndex);
        sCadena += "\n<script type=\"text/javascript\">";
        sCadena += "\njQuery(function($)";
        sCadena += "\n{";
        sCadena += "\n\t$(\"#" + sNombre + "\").mask2(\"Hh:Nn:Nn\");";
        sCadena += "\n});";
        sCadena += "\n</script>";
        return sCadena;
    }

    public static String getCampoTexto(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int tabindex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\">";
        sCadena += getCampoTexto(sNombre, sValor, ancho, tamMax, sFunciones, tabindex);
        sCadena += "\n</div>";
        return sCadena;
    }

    public static String getCampoTextoStyle(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int tabindex) {
        String sCadena = "<span class=\"campos\">";
        sCadena += "<input type=\"text\" tabindex='" + tabindex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" style=\"" + sStyle + "\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\"/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span>";
        return sCadena;
    }

    public static String getCampoTexto(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, int tabindex) {
        String sCadena = "<span class=\"campos\">";
        sCadena += "<input type=\"text\" tabindex='" + tabindex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" /> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span>";
        return sCadena;
    }

    /**
     * @param sNombre nombre de campo
     * @param sValor valor del campo
     * @param ancho longitud en caracteres del ancho del campo
     * @param tamMax longitud m@aacute;xima permitida en el campo
     * @param sFunciones funciones js
     * @param sMask Mascara que se aplicar@aacute; al campo
     * @param sStyle
     * @param iTabIndex
     * @return cadena formada con c@oacute;digo HTML y JS
     */
    public static String getCampoMask(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sMask, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "<input type=\"text\" tabindex='" + iTabIndex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" /> \n";
        sCadena += "<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n"
                + "\n</span>";
        sCadena += "\n<script type=\"text/javascript\">";
        sCadena += "\njQuery(function($)";
        sCadena += "\n{";
        sCadena += "\n\t$(\"#" + sNombre + "\").mask2(\"" + sMask + "\");";
        sCadena += "\n});";
        sCadena += "\n</script>";
        sCadena += "\n</div>";
        return sCadena;
    }

    /**
     * @param sNombre nombre de campo
     * @param sValor valor del campo
     * @param ancho longitud en caracteres del ancho del campo
     * @param tamMax longitud m@aacute;xima permitida en el campo
     * @param sFunciones funciones js
     * @param sStyle
     * @param iTabIndex
     * @return cadena formada con c@oacute;digo HTML y JS
     */
    public static String getCampoEntero(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "<input type=\"text\" tabindex='" + iTabIndex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" alt='integer'/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span></div>";
        return sCadena;
    }

    /**
     * @param sNombre nombre de campo
     * @param sValor valor del campo
     * @param ancho longitud en caracteres del ancho del campo
     * @param tamMax longitud m@aacute;xima permitida en el campo
     * @param sFunciones funciones js
     * @param sStyle
     * @param iTabIndex
     * @return cadena formada con c@oacute;digo HTML y JS
     */
    public static String getCampoEnteroSinFormato(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "<input type=\"text\" tabindex='" + iTabIndex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" alt='int'/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span></div>";
        return sCadena;
    }

    /**
     * @param sNombre nombre de campo
     * @param sValor valor del campo
     * @param ancho longitud en caracteres del ancho del campo
     * @param tamMax longitud m@aacute;xima permitida en el campo
     * @param sFunciones funciones js
     * @param sStyle
     * @param iTabIndex
     * @return cadena formada con c@oacute;digo HTML y JS
     */
    public static String getCampoDecimal(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "\n<input type=\"text\" tabindex='" + iTabIndex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" alt='decimal-mx'/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span></div>";
        return sCadena;
    }

    /**
     * @param sNombre nombre de campo
     * @param sValor valor del campo
     * @param ancho longitud en caracteres del ancho del campo
     * @param tamMax longitud m@aacute;xima permitida en el campo
     * @param sFunciones funciones js
     * @param sStyle
     * @param iTabIndex
     * @return cadena formada con c@oacute;digo HTML y JS
     */
    public static String getCampoTelefono(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "<input type=\"text\" tabindex='" + iTabIndex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" alt='phone-mx'/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span></div>";
        return sCadena;
    }

    /**
     * @param sNombre nombre de campo
     * @param sValor valor del campo
     * @param ancho longitud en caracteres del ancho del campo
     * @param tamMax longitud m@aacute;xima permitida en el campo
     * @param sFunciones funciones js
     * @param sStyle
     * @param iTabIndex
     * @return cadena formada con c@oacute;digo HTML y JS
     */
    public static String getCampoTarjeta(String sNombre, String sValor, int ancho, int tamMax, String sFunciones, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "<input type=\"text\" tabindex='" + iTabIndex + "' size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" " + sFunciones + " title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" alt='cc'/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span></div>";
        return sCadena;
    }

    /**
     *
     * @param sNombre
     * @param sValor
     * @param sStyle
     * @param iTabIndex
     * @return
     */
    public static String getCampoPass(String sNombre, String sValor, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "\n<input tabindex='" + iTabIndex + "' type=\"password\"  value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\"/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em>\n";
        sCadena += "\n</span></div>";
        return sCadena;
    }

    /**
     *
     * @param sNombre
     * @param sValor
     * @param ancho
     * @param tamMax
     * @param iTabIndex
     * @param sStyle
     * @return
     */
    public static String getCampoPass(String sNombre, String sValor, int ancho, int tamMax, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\">";
        sCadena += getCampoPass(sNombre, sValor, ancho, tamMax, iTabIndex);
        sCadena += "</div>";
        return sCadena;
    }

    public static String getCampoPass(String sNombre, String sValor, int ancho, int tamMax, int iTabIndex) {
        String sCadena = "<span class=\"campos\">";
        sCadena += "\n<input tabindex='" + iTabIndex + "' type=\"password\"  value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\"/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em></span>\n";
        sCadena += "\n</span>";
        return sCadena;
    }

    public static String getCampoPassStyle(String sNombre, String sValor, int ancho, int tamMax, String sEStilo, int iTabIndex) {
        String sCadena = "<span class=\"campos\">";
        sCadena += "\n<input tabindex='" + iTabIndex + "' type=\"password\"  value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" size=\"" + ancho + "\" style=\"" + sEStilo + "\"  maxlength=\"" + tamMax + "\"/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em></span>\n";
        sCadena += "\n</span>";
        return sCadena;
    }
    
    public static String getCampoPass(String sNombre, String sValor, int ancho, int tamMax, int iTabIndex,String sFunciones) {
        String sCadena = "<span class=\"campos\">";
        sCadena += "\n<input tabindex='" + iTabIndex + "' type=\"password\"  value=\"" + sValor + "\" name=\"" + sNombre + "\" id=\"" + sNombre + "\" title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" size=\"" + ancho + "\"  maxlength=\"" + tamMax + "\" " + sFunciones + "/> \n";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em></span>\n";
        sCadena += "\n</span>";
        return sCadena;
    }

    /**
     * Obtener un campo combo apartir arreglos de datos definidos en la vista
     * @param sNombre Nombre del select
     * @param sValores Arreglo de valores del select nombre de los items del control select
     * @param sIDValores Arreglo de los values de los valores del select
     * @param sFuncion funcion JS a ejecutar
     * @param bReplicaValue boolean para replicar el valor del value en el texto a mostrar en el item del select
     * @param sStyle
     * @param iTabIndex
     * @return Cadena
     */
    public static String getSelectComboPredefinido(String sNombre, String[] sValores, String[] sIDValores, String sFuncion, boolean bReplicaValue, String sStyle, int iTabIndex) {
        String sCadena = "\n<div class=\"" + sStyle + " alpha omega clearfix\"><span class=\"campos\">";
        sCadena += "\n<select name=" + sNombre + " id=" + sNombre + "  " + sFuncion + " tabindex='" + iTabIndex + "' title=\"" + Utils.getEtiqueta(sNombre + "_t") + "\" >";
        if (bReplicaValue) {
            for (String sValor : sValores) {
                sCadena += "\n\t<option value='" + sValor + "'>" + sValor + "</option>";
            }
        } else if (sValores.length == sIDValores.length) {
            for (int i = 0; i < sValores.length; i++) {
                sCadena += "\n\t<option value='" + sIDValores[i] + "'>" + sValores[i] + "</option>";
            }
        }
        sCadena += "\n</select>";
        sCadena += "\n<em class=\"validacion\" id=\"" + sNombre + "_e\"></em></span>";
        sCadena += "\n</span></div>";
        return sCadena;
    }

    public static String getEtiqueta(String sEtiqueta, String sStyle) {
        String sCadena = Utils.getEtiqueta(sEtiqueta);
        sCadena = "<div class=\"" + sStyle + " alpha omega clearfix etiquetas \">" + sCadena + "</div>";
        return sCadena;
    }

    public static String getEtiqueta(String sEtiqueta, String sStyle, String sStyleClass) {
        String sCadena = Utils.getEtiqueta(sEtiqueta);
        sCadena = "<div class=\"" + sStyle + " alpha omega clearfix etiquetas " + sStyleClass + "\">" + sCadena + "</div>";
        return sCadena;
    }

    public static String getLabel(String sValor, String sStyle) {
        return "<div class=\"" + sStyle + " alpha omega clearfix etiquetas \">" + sValor + "</div>";

    }
    
    /**
     * Esta funci@oacute;n le cambia la primera letra a la cadena a Mayuscula
     * @param cadena Cadena que va a ser convertida.
     * @return String convertida
     * <br>
     * <b>Ejemplo :</b> &nbsp;<pre>String cadena = cambiarMayus1aLetra("ejemplo");</pre>
     * <br><br>.
     */
    private static String cambiarMayus1aLetra(String cadena) {
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1, cadena.length());
    }
}
