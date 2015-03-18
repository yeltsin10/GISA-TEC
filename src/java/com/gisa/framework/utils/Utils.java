package com.gisa.framework.utils;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import java.util.ResourceBundle;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.naming.NamingException;

import javax.servlet.http.HttpServletRequest;


public class Utils {

    /**
     * Esta funci@oacute;n obtiene una conexi@oacute;n del pool configurado
     * inicialmente en context.xml
     *
     * @return Connection ,con la conexi@oacute;n activa a la base de datos
     * configurada.
     * <b>Ejemplo :</b><pre>Utils.getConexion()</pre>
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getConexion() {
        Connection Salida = null;
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/datos");
            Salida = ds.getConnection();
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return Salida;
    }

    /**
     * Esta funci@oacute;n cierra una conexi@oacute;n abierta a alguna base de
     * datos.
     * @param conn que es una conexi@oacute;n de tipo Connection
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                if (!conn.isClosed()) {
                    conn.close();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static String utf8_decode(String entrada) throws UnsupportedEncodingException {
        if (entrada == null) {
            entrada = "";
        }
        byte[] arrByte;
        
        arrByte = entrada.getBytes("ISO-8859-1");
        String result = new String(arrByte, "UTF-8");
        return result;
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static String utf8_encode(String entrada) {
        if (entrada == null) {
            entrada = "";
        }
        byte[] arrByte;

        try {
            arrByte = entrada.getBytes("UTF-8");
            String result = new String(arrByte, "ISO-8859-1");
            return result;
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return entrada;
        }
    }

    /**
     * Obtiene de una variable de tipo Object una variable
     * tipo String , en caso de tener un valor null devuelve el par&aacute;metro
     * sDefault.
     *
     * @param oObjeto variable que se convertira a String
     * @param sDefault cadena que es devuelta en caso de que oObjeto sea null
     *
     * @return void.
     *
     * <b>Ejemplo
     * :</b><pre>String sCadena = Utils.obtenerString(oObject,"0");</pre>
     * <br><br>.
     *
     */
    public static String obtenerString(Object oObjeto, String sDefault) {
        if (oObjeto == null) {
            return sDefault;
        } else if (oObjeto.equals("")) {
            return sDefault;
        } else {
            return oObjeto.toString();
        }
    }

    /**
     * Esta funci&oacute;n obtiene de una variable de tipo Object una variable
     * tipo int, en caso de tener un valor null devuelve el par&aacute;metro
     * iDefault.
     *
     * @param oObjeto variable que se convertira a int
     * @param iDefault cadena que es devuelta en caso de que oObjeto sea null
     *
     * @return int.
     *
     * <b>Ejemplo :</b><pre>int iEntero = Utils.obtenerInt(oObject,0);</pre>
     * <br><br>.
     *
     */
    public static int obtenerInt(Object oObjeto, int iDefault) {
        if (oObjeto == null) {
            return iDefault;
        } else if (oObjeto.equals("")) {
            return iDefault;
        } else {
            return Integer.parseInt(oObjeto.toString());
        }
    }

    /**
     * Esta funci&oacute;n obtiene de una variable de tipo Object una variable
     * tipo double, en caso de tener un valor null devuelve el par&aacute;metro
     * dDefault.
     *
     * @param oObjeto variable que se convertira a double
     * @param dDefault cadena que es devuelta en caso de que oObjeto sea null
     * @return double.
     *
     * <b>Ejemplo
     * :</b><pre>double dDouble = Utils.obtenerDouble(oObject,0.0);</pre>
     * <br><br>
     */
    public static double obtenerDouble(Object oObjeto, double dDefault) {
        if (oObjeto == null) {
            return dDefault;
        } else if (oObjeto.equals("")) {
            return dDefault;
        } else {
            return Double.parseDouble(oObjeto.toString());
        }
    }

    /**
     * Convierte una lista en un string separadas por el separador que se
     * indique
     *
     * @param lLista
     * @param sSeparador
     * @return La variable string con todos los datos de la lista
     */
    public static String convierteListaACadena(List<Integer> lLista, String sSeparador) {
        String sRespuesta = "";
        for (Integer iVal : lLista) {
            if (sRespuesta.equals("")) {
                sRespuesta += iVal.toString();
            } else {
                sRespuesta += " " + sSeparador + iVal.toString();
            }
        }
        return sRespuesta;
    }

    /**
     * Esta funci&oacute;n obtiene una cadena que es el valor de la etiqueta en
     * el archivo Etiquetas.properties.
     *
     * @param sEtiqueta nombre de la etiqueta que se quiere consultar en el
     * archivo.
     * @return String con el valor de la etiqueta pasada como par&aacute;metro
     * <b>Ejemplo
     * :</b><pre>String sValor = Utils.getEtiqueta("boton_nombre");</pre>
     * <br><br>.
     *
     */
    public static String getEtiqueta(String sEtiqueta) {
        try {
            ResourceBundle rs = ResourceBundle.getBundle("com.gisa.framework.etiquetas.Etiquetas");
            return rs.getString(sEtiqueta);
        } catch (Exception e) {
            return "No existe la etiqueta.";
        }
    }

    /**
     * Obtiene el valor de una etiqueta a de un recurso.
     *
     * @param sResource Direcci@oacute;n completa del recurso ejemplo:
     * com.gisa.ecommerce.Etiquetas.Etiquetas.
     * @param sEtiqueta Nombre de la etiqueta especifica.
     * @return sValor Valor del recurso.
     */
    public static String getEtiqueta(String sResource, String sEtiqueta) {
        try {
            ResourceBundle rs = ResourceBundle.getBundle(sResource);
            return rs.getString(sEtiqueta);
        } catch (Exception e) {
            return "No existe la etiqueta.";
        }
    }

    /**
     * Obtiene el valor de un par@aacute;metro en session
     *
     * @param sParametro
     * @param req
     * @return String con el valor del par@aacute;metrio requerido
     * <b>Ejemplo
     * :</b><pre>String sUsuario = Utils.getSessionParametro("Usuario",request);</pre>
     * <br><br>.
     */
    public static String getSessionParametro(String sParametro, HttpServletRequest req) {
        Object oParametro = req.getSession().getAttribute(sParametro);
        if (oParametro == null) {
            return "";
        } else {
            return oParametro.toString();
        }
    }

    /**
     * Esta funci@oacute;n guarda el valor de un parametro en session esta
     * funci@oacute;n es usada cuando no se tiene acceso directo al objeto
     * session (Servlets).
     *
     * @param sParametro nombre del parametro que se desea obtener.
     * @param oValor valor que le ser@iacute;a asigando al parametro de session.
     * @param req objeto request del Servlet.
     *
     */
    public static void setSessionParametro(String sParametro, Object oValor, HttpServletRequest req) {
        req.getSession().setAttribute(sParametro, oValor);
    }

    /**
     * @Eacute;sta funci@oacute;n cambia la primera letra de una cadena a may@uacute;scula
     *
     * @param cadena
     * @return String
     */
    public static String cambiar1aLetraMayuscula(String cadena) {
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1, cadena.length());
    }

    /**
     * Retorna el string de un n@uacute;mero double.
     *
     * @param num
     * @return String del n@uacute;mero con una mascara ###.#####
     */
    public static String convertSCItoDouble(double num) {
        NumberFormat formatter = new DecimalFormat("###.#####");
        String sSalida = formatter.format(num);

        return sSalida;
    }

    /**
     * Obteniene una cadena "Si" o "No" a partir de un valor. Si el valor es null
     * retorna "No"
     * @param iValor Integer valor 0 o 1
     * @return Valor "Si" o "No"
     */
    public static String getSiNo(Integer iValor) {
        if (iValor == null) {
            return "No";
        }
        if (iValor.equals(0)) {
            return "No";
        } else {
            return "Si";
        }
    }

    /**
     * Obtener una cadena "Si" o "No" a partir de un valor N@uacute;merico 0 o 1     
     * @param iValor Integer valor 0 o 1
     * @param sDefault Cadena que ser@iacute;a puesta si el objeto es null
     * @return El valor Si o No
     */
    public static String getSiNo(Integer iValor, String sDefault) {
        if (iValor == null) {
            return sDefault;
        }
        if (iValor.equals(0)) {
            return "No";
        } else {
            return "Si";
        }
    }

    /**
     * Esta funci@oacute;n cambia el texto que es usado en los grids.
     *
     * @param Origen:Texto Original
     * @return xml con texto corregido.
     *
     * <b>Ejemplo :</b><pre>Utils.fReemplaza(Origen);</pre>
     * <br><br>.
     */
    public static String fReemplaza(String Origen) {
        String regresa = "";
        if (Origen.length() > 0) {
            regresa = Origen.replaceAll("&", "&amp;");
            regresa = regresa.replaceAll("/", "&#47;");
            regresa = regresa.replaceAll("\"", "'");
            regresa = regresa.replaceAll(">", "&gt;");
            regresa = regresa.replaceAll("<", "&lt;");
            regresa = regresa.replaceAll("'", "");
            regresa = regresa.replaceAll("`", "");
            regresa = regresa.replaceAll("-", "&#8722;");
            regresa = regresa.replaceAll(",", "&#8218;");
        }
        return regresa;
    }

    /**
     * Esta funci@oacute;n deserealiza valores enviados de progress
     *
     * @param cadena es la variable serealizada, variable es el valor que se
     * desea obtener
     * @param variable
     * @return String con valor de la variable de progress.
     *
     * <b>Ejemplo :</b><pre>String valor = Utils.Deserealiza("Password=173,  Nombre=Jessica","Nombre");
     * Es resultado de esto es: Jessica</pre>
     * <br><br>
     */
    public static String deserealiza(String cadena, String variable) {
        try {
            String Valores[] = cadena.split("\t");
            String Val[];
            String valor = "";
            for (String Valor : Valores) {
                Val = Valor.split("=");
                if (Val[0].equals(variable)) {
                    valor = Val[1];
                }
            }
            return valor;
        } catch (Exception e) {
            return "";
        }
    }
}
