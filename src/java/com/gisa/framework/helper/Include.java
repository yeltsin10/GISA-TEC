package com.gisa.framework.helper;

public class Include {
    
    /**
     * Genera los includes necesarios para utilizar la libreria
     * de javascript de validaciones
     *@param basePath Constantes.WEBROOT
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeValidaciones(Constantes.WEBROOT)</pre>
     * @return Importa el script Validaciones.js
     */
    public static String getIncludeValidaciones(String basePath) {
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/Validaciones.js\"></script>\n";
    }
    
    /**
     * Genera los includes necesarios para utilizar la libreria
     * de javascript de validaciones
     *@param basePath Constantes.WEBROOT
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeValidaciones(Constantes.WEBROOT)</pre>
     * @return Importa el script Validaciones.js
     */
    public static String getIncludeFuncionesComunes(String basePath) {
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/FuncionesComunes.js\"></script>\n";
    }
    
    /**
     * Genera el include de CSS de Bootstrap <br>
     * Este include debe ir posicionado en la parte superior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return bootstrap.min.css
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeBootstrapCSS(Constantes.WEBROOT)</pre>
     * NOTA: Es necesario agregar tambi&eacute;n: 
     * Include.getIncludeBootstrapJS(basePath) 
     */
    public static String getIncludeBootstrapCSS(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "plugins/bootstrap 3.3.2/css/bootstrap.min.css\">\n";
    }
    
    /**
     * Genera el include de CSS bootstrap-theme.css <br>
     * Este include debe ir posicionado en la parte superior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return bootstrap-theme.min.css
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeBootstrapThemeCSS(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeBootstrapThemeCSS(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "plugins/bootstrap 3.3.2/css/bootstrap-theme.min.css\">\n";
    }
    
    /**
     * Genera los include de javascript requeridos por Bootstrap <br>
     * Este include debe ir posicionado en la parte inferior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return bootstrap.min.js | jquery-1.11.1.min.js
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeBootstrapJS(Constantes.WEBROOT)</pre>
     * NOTA: Es necesario agregar tambi&eacute;n: 
     * Include.getIncludeBootstrapCSS(basePath) 
     */
    public static String getIncludeBootstrapJS(String basePath){
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "plugins/jQuery/jquery-1.11.1.min.js\"></script>\n"
             + "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "plugins/bootstrap 3.3.2/js/bootstrap.min.js\"></script>\n";  
    }
    
    /**
     * Genera el include font-awesome.min.css el cual es requerido por el template tableroControl.jsp <br>
     * Este include debe ir posicionado en la parte superior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return font-awesome.min.css
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeFontAwesomeCSS(Constantes.WEBROOT)</pre>
     */    
    public static String getIncludeFontAwesomeCSS(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "views/cssFramework_B3.1.1/pluginsBootstrap3.1.1/font-awesome/css/font-awesome.min.css\">\n";
    }
    
    /**
     * Genera el include datepicker3.css el cual es necesario para mostrar el datapicker(calendario) <br>
     * Este include debe ir posicionado en la parte superior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return datepicker3.css
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeDataPickerCSS(Constantes.WEBROOT)</pre>
     */    
    public static String getIncludeDatePickerCSS(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "views/cssFramework_B3.1.1/pluginsBootstrap3.1.1/calendario/datepicker3.css\">\n";
    }
    
    /**
     * Genera los include necesarios de JS para el uso del calendario  <br>
     * Este include debe ir posicionado en la parte inferior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return bootstrap-datepicker.js | bootstrap-datepicker.es.js
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeDatePickerJS(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeDatePickerJS(String basePath){
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/pluginsBootstrap3.1.1/calendario/bootstrap-datepicker.js\"></script>\n" +
               "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/pluginsBootstrap3.1.1/calendario/locales/bootstrap-datepicker.es.js\"></script>\n";
    }
    
    /**
     * Genera el include para el uso del plugin de Table Tools en la datatable <br>
     * Este include debe ir posicionado en la parte inferior de la JSP <br>
     * <b>Nota: </b> No funciona en los dispositivos moviles ya que usa flash
     * @param basePath Constantes.WEBROOT
     * @return dataTables.tableTools.css | dataTables.tableTools.js
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeDataTablesTableTools(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeDataTablesTableTools(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "views/cssFramework_B3.1.1/TableTools_2.2.2/css/dataTables.tableTools.css\">\n" +
                "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/cssFramework_B3.1.1/TableTools_2.2.2/js/dataTables.tableTools.js\"></script>\n";
    }
    
    /**
     * Genera el include dataTables.bootstrap.css el cual es necesario para el uso de DataTables <br>
     * Este include debe ir posicionado en la parte superior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return dataTables.bootstrap.css
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeDataTablesCSS(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeDataTablesCSS(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "plugins/dataTables/dataTables.bootstrap.css\">\n"
                + "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "plugins/dataTables/dataTables.responsive.css\">\n";
    }

    /**
     * Genera los include necesarios de JS para el uso de DataTables <br>
     * Este include debe ir posicionado en la parte inferior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return jquery.dataTables.js | dataTables.bootstrap.js
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeDataTablesJS(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeDataTablesJS(String basePath){
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "plugins/jQuery/jquery.dataTables.min.js\"></script>\n" 
             + "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "plugins/jQuery/dataTables.bootstrap.js\"></script>\n"
                + "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "plugins/jQuery/dataTables.responsive.min.js\"></script>\n";
    }
    
    /**
     * Genera el include sb-admin.css el cual es necesario para el template tableroControl.jsp <br>
     * Este include debe ir posicionado en la parte superior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return sb-admin.css
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeSbAdminCSS(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeSbAdminCSS(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "views/cssFramework_B3.1.1/tableroControl3.1.1/css/sb-admin.css\">\n";
    }
    
    /**
     * Genera el include sb-admin.css el cual es necesario para el template tableroControl.jsp <br>
     * Este include debe ir posicionado en la parte inferior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return sb-admin.js
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeSbAdminJS(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeSbAdminJS(String basePath){
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/tableroControl3.1.1/sb-admin.js\"></script>\n";
    }
    
    /**
     * Genera el include jquery.metisMenu.js el cual es necesario para el template tableroControl.jsp <br>
     * Este include debe ir posicionado en la parte inferior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return jquery.metisMenu.js
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeDataTablesJS(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeMetisMenuJS(String basePath){
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/pluginsBootstrap3.1.1/metisMenu/jquery.metisMenu.js\"></script>\n";
    }
    
    /**
     * Genera los includes necesarios para utilizar la libreria de Ajax dhtmlxcommon.js
     * @param basePath Constantes.WEBROOT
     * @return El script con la libreria de Ajax dhtmlxcommon.js
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeJSAjax(basePath)</pre>
     * <br>
     */
    public static String getIncludeAjax(String basePath) {
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/dhtmlx/dhtmlxcommon.js\"></script>\n";
    }

    /**
     * Genera los includes necesarios para utilizar la libreria 
     * de javascript EjecutaPeticion.js     
     * @param basePath Constantes.WEBROOT
     * @return importa el script
     * <br>
     * <b>Ejemplo :</b><pre>  Include.getIncludeEjecutaPeticion(Constantes.WEBROOT)</pre>
     */
    public static String getIncludeEjecutaPeticion(String basePath) {
        return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "views/jsFramework_B3.1.1/EjecutaPeticion.js\"></script>\n";
    }
    
    /**
     * Genera el include que se encarga de dar el dise&ntilde;o a los botones <br>
     * Este include debe ir en la parte superior de la JSP
     * @param basePath Constantes.WEBROOT
     * @return importa el script del dise&ntilde;o de los botones
     */
    public static String getIncludeSocialButtonsCSS(String basePath){
        return "\n\t\t<link rel=\"STYLESHEET\" href=\"" + basePath + "views/cssFramework_B3.1.1/pluginsBootstrap3.1.1/social-buttons/social-buttons.css\">\n";
    }
    /**
     * Prueba del metodo para el Css
     */
    public static String getLoginCSS(String basePath){
        return"\n\t\t<link rel=\"stylesheet\" href\""+basePath+"css/login.css\">\n";
    }
    /**
     * Genera el include para cargar el diseno del sidebar
     * Este include debe ir en la parte superior del JSP
     * @param basePath Constante.WEBROOT
     * @retunr importa el css que se utiliza para el diseno del sidebar.
     */
    public static String getSidebarCSS(String basePath){
        return "<link href=\""+basePath+"css/styles.css\" rel=\"stylesheet\">";
    }
    /**
     * Genera el include para cargar el JS que se utilizara para el sidebar
     * Este include debe de ir en la parte superior del JSP
     * @param basePath Constante.WEBROOT
     * @return importa el js que se utliza en el sidebar.
     */
    public static String getSidebarJS(String basePath){
            return "\n\t\t<script type=\"text/javascript\" src=\"" + basePath + "js/scripts.js\"></script>\n";
    }
}
