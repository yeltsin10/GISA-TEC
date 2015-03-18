package com.gisa.framework.helper;

public class Menu {
    private int men_num_ctrl = 0;
    private String men_nombre = "";
    private int men_hijo = 0;
    private String men_funcion = "";
    private String men_icono = "";
    private String men_controlador = "";
    private String men_parametrosExtra = "";

    /**
     * N&uacute;mero de control del men&uacute;
     * @return the men_num_ctrl
     */
    public int getMen_num_ctrl() {
        return men_num_ctrl;
    }

    /**
     * N&uacute;mero de control del men&uacute;
     * @param men_num_ctrl the men_num_ctrl to set
     */
    public void setMen_num_ctrl(int men_num_ctrl) {
        this.men_num_ctrl = men_num_ctrl;
    }

    /**
     * Nombre del men&uacute;
     * @return the men_nombre
     */
    public String getMen_nombre() {
        return men_nombre;
    }

    /**
     * Nombre del men&uacute;
     * @param men_nombre the men_nombre to set
     */
    public void setMen_nombre(String men_nombre) {
        this.men_nombre = men_nombre;
    }

    /**
     * N&uacute;mero de control del hijo, solo es informativo para saber que tiene mas niveles
     * @return the men_hijo
     */
    public int getMen_hijo() {
        return men_hijo;
    }

    /**
     * N&uacute;mero de control del hijo, solo es informativo para saber que tiene mas niveles
     * @param men_hijo the men_hijo to set
     */
    public void setMen_hijo(int men_hijo) {
        this.men_hijo = men_hijo;
    }

    /**
     * Funci&oacute;n de javascript que llamar&aacute; al controlador <br>
     * <b>Nota: </b> Solo el nombre de la funci&oacute;n.  <br>
     * <b>Ejemplo: </b> fObtenerUsuarios 
     * @return the men_funcion
     */
    public String getMen_funcion() {
        return men_funcion;
    }

    /**
     * Funci&oacute;n de javascript que llamar&aacute; al controlador <br>
     * @param men_funcion the men_funcion to set <br>
     * <b>Nota: </b> Solo el nombre de la funci&oacute;n. <br>
     * <b>Ejemplo: </b> fObtenerUsuarios
     */
    public void setMen_funcion(String men_funcion) {
        this.men_funcion = men_funcion;
    }

    /**
     * Estilo CSS del &Iacute;cono que corresponde a la opci&oacute;n del men&uacute;
     * @return the men_icono
     */
    public String getMen_icono() {
        return men_icono;
    }

    /**
     * Estilo CSS del &Iacute;cono que corresponde a la opci&oacute;n del men&uacute;
     * @param men_icono the men_icono to set
     */
    public void setMen_icono(String men_icono) {
        this.men_icono = men_icono;
    }

    /**
     * Controlador que desplegara la informaci&oacute;n de la vista
     * @return the men_controlador
     */
    public String getMen_controlador() {
        return men_controlador;
    }

    /**
     * Controlador que desplegara la informaci&oacute;n de la vista
     * @param men_controlador the men_controlador to set
     */
    public void setMen_controlador(String men_controlador) {
        this.men_controlador = men_controlador;
    }

    /**
     * Par&aacute;metros de la funci&oacute;n de javascript separados por ampersan, necesarios para
     * el llamado a la vista
     * Estos par&ametros son los que se mandan de la JSP al Servlet, a travez de la funci&oacute;n de javascript
     * que se acciona, al dar click en la opci&oacute;n del men&uacute; <br>
     * @return the men_parametros <br>
     * <b>Ejemplo: </b> A=ejecuta&empleado=emp_num_ctrl <br>
     * Estos par&ametros son los que se mandan de la JSP al Servlet, a travez de la funci&oacute;n de javascript
     * que se acciona, al dar click en la opci&oacute;n del men&uacute; <br>
     */
    public String getMen_parametrosExtra() {
        return men_parametrosExtra;
    }

    /**
     * Par&aacute;metros de la funci&oacute;n de javascript separados por ampersan, necesarios para
     * el llamado a la vista.<br>
     * Estos par&ametros son los que se mandan de la JSP al Servlet, a travez de la funci&oacute;n de javascript
     * que se acciona, al dar click en la opci&oacute;n del men&uacute; <br>
     * @param men_parametrosExtra the men_parametros to set
     * <b>Ejemplo: </b> A=ejecuta&empleado=emp_num_ctrl <br>
     * Si es solo un par&aacute;metro extra no es necesario el ampersan &, de lo contrario
     * es necesario separar cada par&aacute;metro con un ampersan como se muestra en el ejemplo de arriba
     */
    public void setMen_parametrosExtra(String men_parametrosExtra) {
        this.men_parametrosExtra = men_parametrosExtra;
    }
    
}
