package com.jopen.base;

import com.gisa.framework.utils.Constantes;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;

/**
 * Clase despachador JOpen
 *
 */
public class Despachador extends HttpServlet {

    private HashMap hParametro = null;
    private HashMap hParametroPersistente = null;
    private HashMap hObjeto = null;
    private HashMap hObjetoPersistente = null;
    private RequestDispatcher rdRequesDispatcher = null;
    private String sBasePath = "";
    private String dirContenido = "";
    private String dirTemplate = "";

    /**
     *
     * @param sBasePath
     */
    public void setBasePath(String sBasePath) {
        this.sBasePath = sBasePath;
    }

    /**
     * Clase Despachador
     */
    public Despachador() {
        super();
        this.hObjeto = new HashMap();
        this.hObjetoPersistente = new HashMap();
        this.hParametro = new HashMap();
        this.hParametroPersistente = new HashMap();
    }

    public Despachador(Request rLector) {
        super();
        this.hObjeto = new HashMap();
        this.hObjetoPersistente = new HashMap();
        this.hParametro = new HashMap();
        this.hParametroPersistente = new HashMap();
    }

    /**
     * obtener base path de la aplicaci&oacute;n
     *
     * @param req
     * @param res
     * @return
     */
    public String getBasePath(HttpServletRequest req, HttpServletResponse res) {
        if (this.sBasePath.equals("")) {
            String path = req.getContextPath();
            String basePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + path + "/";
            sBasePath = basePath;
        }
        return sBasePath;
    }

    /**
     * Obtener Par&aacute;metro
     *
     * @param sParametro Nombre del par&aacute;metro solicitado.
     * @return Objeto parametro.
     * @throws Exception Parametro No existe
     */
    public Object fObtenParam(String sParametro) throws Exception {
        try {
            if (this.getParametro().isEmpty()) {
                throw new Exception("El parametro no existe en el Objeto despachador");
            } else {
                return this.getParametro().get(sParametro);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Obtener Objeto
     *
     * @param sNombre Nombre del objeto que ser&aacute; obtenido.
     * @return Objecto solicitado
     * @throws Exception Objeto no existente.
     */
    public Object fObtenObj(String sNombre) throws Exception {
        try {
            return this.hObjeto.get(sNombre);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Insertar Objeto
     *
     * @param objNombre Nombre del objeto
     * @param oObjeto Objeto a ser insertado
     * @throws Exception
     */
    public void fPonObjeto(String objNombre, Object oObjeto) throws Exception {
        try {
            getObjeto().put(objNombre, oObjeto);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Obtener Par@aacute;metro
     *
     * @param sNombre Nombre del par&aacute;metro
     * @param sValor Valor del par&aacute;metro
     * @throws Exception
     */
    public void fPonParametro(String sNombre, Object sValor) throws Exception {
        try {
            if (hParametro.containsKey(sNombre)) {
                hParametro.remove(sNombre);
            }
            hParametro.put(sNombre, sValor);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * inicializar el Objeto Parametro
     */
    public void fLimpiarParametro() {
        hParametro = null;
        hParametro = new HashMap();
    }

    /**
     * inicializar el Objeto Objeto
     */
    public void fLimpiarObjeto() {
        hObjeto = null;
        hObjeto = new HashMap();
    }

    /**
     * Despachar
     *
     * @param req Request
     * @param res Response
     * @throws Exception
     */
    public void _fDespachar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        try {
            
             if(Constantes.ENMTTO){
                res.sendRedirect(Constantes.WEBROOT + "templates/mtto.jsp");
             }
             
            if (getParametro().containsKey("Vista") && getParametro().containsKey("Template")) {
                dirTemplate = "/templates/" + (String) fObtenParam("Template");
                dirContenido = "/views/" + (String) fObtenParam("CarpetaJSP") + "/" + (String) fObtenParam("Vista");
                rdRequesDispatcher = req.getRequestDispatcher(dirTemplate);
                Despachador dDespachador = new Despachador();
                dDespachador.setObjeto(this.getObjeto());
                dDespachador.setObjetoPersistente(this.getObjetoPersistente());
                dDespachador.setParametro(this.getParametro());
                dDespachador.setParametroPersistente(this.getParametroPersistente());
                dDespachador.setBasePath(this.getBasePath(req, res));
                dDespachador.setDirContenido(this.dirContenido);
                dDespachador.setDirTemplate(this.dirTemplate);
                req.setAttribute("Despachador", dDespachador);
                if (this.existeJsp(req, dirTemplate)) {
                    if(fObtenParam("Vista").toString().trim().equals("")){
                        rdRequesDispatcher.forward(req, res);
                    }else{
                        if (this.existeJsp(req, dirContenido)) {
                            rdRequesDispatcher.forward(req, res);
                        } else {
                            throw new Exception("La vista (Contenido) " + dirContenido + "  que estas intentando utilizar no existe");
                        }
                    }
                } else {
                    throw new Exception("El " + dirTemplate + " template o layout que estas intentando utilizar no existe");
                }
            } else if (this.hParametro.containsKey("Controlador")) {
                if (this.hParametro.containsKey("Forward")) {
                    rdRequesDispatcher = req.getRequestDispatcher((String) fObtenParam("Controlador") + "?" + (String) fObtenParam("Parametros"));
                    Despachador dDespachador = new Despachador();
                    dDespachador.setObjeto(this.getObjeto());
                    dDespachador.setObjetoPersistente(this.getObjetoPersistente());
                    dDespachador.setParametro(this.getParametro());
                    dDespachador.setParametroPersistente(this.getParametroPersistente());
                    dDespachador.setBasePath(this.getBasePath(req, res));
                    req.setAttribute("Despachador", dDespachador);
                    rdRequesDispatcher.forward(req, res);
                } else {
                    Despachador dDespachador = new Despachador();
                    dDespachador.setObjeto(this.getObjeto());
                    dDespachador.setObjetoPersistente(this.getObjetoPersistente());
                    dDespachador.setParametro(this.getParametro());
                    dDespachador.setParametroPersistente(this.getParametroPersistente());
                    dDespachador.setBasePath(this.getBasePath(req, res));
                    req.setAttribute("Despachador", dDespachador);
                    if (fObtenParam("Parametros") != null) {
                        res.sendRedirect(Constantes.WEBROOT + "" + (String) fObtenParam("Controlador") + "?" + (String) fObtenParam("Parametros"));
                    } else {
                        res.sendRedirect(Constantes.WEBROOT + "" + (String) fObtenParam("Controlador"));
                    }
                }
            } else {
                throw new Exception("Error al intentar despachar la peticion. Favor de revisar el parametro vista y/o contenido ");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Obtener Par&aacute;metro Persistente
     *
     * @param sParametro Nombre del par&aacute;metro
     * @param req request
     * @return Valor del par&aacute;metro
     * @throws Exception
     */
    public Object fObtenParamPer(String sParametro, HttpServletRequest req) throws Exception {
        try {
            if (this.fExisteEnSesion(req, "hParametroPersistente")) {
                this.hParametroPersistente = (HashMap) this.fLeerSession(req, "hParametroPersistente");
                this.hObjeto.get(sParametro);
            }
            return this.hParametroPersistente.get(sParametro);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Obtener Objeto Persistente
     *
     * @param sNombre Nombre del objeto
     * @param req request
     * @return
     * @throws Exception
     */
    public Object _fObtenObjPer(String sNombre, HttpServletRequest req) throws Exception {
        try {
            if (this.fExisteEnSesion(req, "hObjetoPersistente")) {
                this.hObjetoPersistente = (HashMap) this.fLeerSession(req, "hObjetoPersistente");
            }
            return this.hObjetoPersistente.get(sNombre);
        } catch (Exception e) {

            throw e;
        }
    }

    /**
     * Guardar un Objeto persistente en session
     *
     * @param sNombre nombre del objeto que ser&aacute; guardado
     * @param oObjeto Objeto que ser&aacute; guardado
     * @param req instancia del HttpServletRequest
     * @throws Exception
     */
    public void fPonObjPer(String sNombre, Object oObjeto, HttpServletRequest req) throws Exception {
        try {
            this.hObjetoPersistente = new HashMap();
            if (this.fExisteEnSesion(req, "hObjetoPersistente")) {
                this.hObjetoPersistente = (HashMap) this.fLeerSession(req, "hObjetoPersistente");
                if (this.hObjetoPersistente.containsKey(sNombre)) {
                    this.hObjetoPersistente.remove(sNombre);
                }
                this.hObjetoPersistente.put(sNombre, oObjeto);
            } else {
                this.hObjetoPersistente.put(sNombre, oObjeto);
                this.fGuardarEnSession(req, "hObjetoPersistente", this.hObjetoPersistente);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Guardar un Par&aacute;metro persistente en session
     *
     * @param sNombre nombre del par&aacute;metro que ser&aacute; guardado
     * @param oValor Par&aacute;metro que ser&aacute; guardado
     * @param req instancia del HttpServletRequest
     * @throws Exception
     */
    public void fPonParamPer(String sNombre, Object oValor, HttpServletRequest req) throws Exception {
        try {
            if (this.fExisteEnSesion(req, "hParametroPersistente")) {
                this.hParametroPersistente = (HashMap) this.fLeerSession(req, "hParametroPersistente");
                if (this.hParametroPersistente.containsKey(sNombre)) {
                    this.hParametroPersistente.remove(sNombre);
                }
                this.hParametroPersistente.put(sNombre, oValor);
            } else {
                this.hParametroPersistente.put(sNombre, oValor);
                this.fGuardarEnSession(req, "hParametroPersistente", this.hParametroPersistente);
            }
        } catch (Exception e) {

            throw e;
        }
    }

    /**
     * Eliminar Atributo de session
     *
     * @param request instancia de HttpServletRequest
     * @param sNombre nombre del atributo que ser&aacute; eliminado.
     */
    public void fEliminarAtributoSesion(HttpServletRequest request, String sNombre) {
        HttpSession hsSesion = request.getSession(false);
        hsSesion.removeAttribute(sNombre);
    }

    /**
     * invalidar la session.
     *
     * @param req request
     */
    public void fTerminarSession(HttpServletRequest req) {
        req.getSession().invalidate();
    }

    /**
     * Buscar si existe en session un atributo
     *
     * @param req instancia de HttpServletRequest
     * @param sNombre Nombre del atributo
     * @return bolean bolean que indica si el atributo existe.
     */
    public boolean fExisteEnSesion(HttpServletRequest req, String sNombre) {
        HttpSession sSession = req.getSession(false);
        if (sSession == null) {
            return false;
        }
        if (!sSession.isNew()) {
            Object oObjeto = sSession.getAttribute(sNombre);
            if (oObjeto != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Creaci&oacute;n de session y guardar usuario que se loguea en session.
     *
     * @param req
     * @param mUsuario
     */
    public void fLoguearUsuario(HttpServletRequest req, Object mUsuario) {
        HttpSession sSesion = req.getSession(true);
        if (sSesion != null) {
            sSesion.invalidate();
        }
        sSesion = req.getSession(true);
        sSesion.setAttribute("Usuario", mUsuario);
    }

    /**
     * Guardar un objeto en session.
     *
     * @param req request
     * @param sNombre nombre del objeto
     * @param oObjeto objeto que ser&aacute; guardado.
     */
    public void fGuardarEnSession(HttpServletRequest req, String sNombre, Object oObjeto) {
        HttpSession sSesion = req.getSession(false);
        sSesion.setAttribute(sNombre, oObjeto);
    }

    /**
     * Verifica si se ha creado o existe el usuario en sesi&oacute;n
     *
     * @param req Objeto tipo HttpServletRequest
     * @return true si se encuentra en sesi&oacute;n
     */
    public boolean fVerificarLogeado(HttpServletRequest req) {
        if (this.fExisteEnSesion(req, "Usuario")) {
            return true;
        }
        return false;
    }

    /**
     * leer objeto de session
     *
     * @param req request
     * @param sNombre nombre del objeto
     * @return objeto guardado en session
     */
    public Object fLeerSession(HttpServletRequest req, String sNombre) {
        HttpSession hsSesion = req.getSession(false);
        Object oObjeto = null;
        if (this.fExisteEnSesion(req, sNombre)) {
            oObjeto = hsSesion.getAttribute(sNombre);
        }
        return oObjeto;
    }
    
    /**
     * Indica si existe un archivo .jsp
     *
     * @param req request
     * @param nombreJsp direcci&oacute;n y nombre de archivo jsp
     * @return boolean
     */
    public boolean existeJsp(HttpServletRequest req, String nombreJsp) {
        File file;
        file = new File(req.getSession().getServletContext().getRealPath(nombreJsp));
        return file.exists();
    }
    
    /**
     * @return the par&aacute;metro
     */
    private HashMap getParametro() {
        return hParametro;
    }

    /**
     * @param hParametro the par&aacute;metro to set
     */
    private void setParametro(HashMap hParametro) {
        this.hParametro = hParametro;
    }

    /**
     * @return the par&aacute;metro Persistente
     */
    private HashMap getParametroPersistente() {
        return hParametroPersistente;
    }

    /**
     * @param hParametroPer the par&aacute;metro Persistente to set
     */
    private void setParametroPersistente(HashMap hParametroPer) {
        this.hParametroPersistente = hParametroPer;
    }

    /**
     * @return the objeto
     */
    private HashMap getObjeto() {
        return hObjeto;
    }

    /**
     * @param hObjeto the objeto to set
     */
    private void setObjeto(HashMap hObjeto) {
        this.hObjeto = hObjeto;
    }

    /**
     * @return the objetoPersistente
     */
    private HashMap getObjetoPersistente() {
        return hObjetoPersistente;
    }

    /**
     * @param hObjetoPer the objetoPersistente to set
     */
    private void setObjetoPersistente(HashMap hObjetoPer) {
        this.hObjetoPersistente = hObjetoPer;
    }

    /**
     * Obtener WEBROOT
     *
     * @param req
     * @return
     */
    public static String getWebRoot(HttpServletRequest req) {
        return req.getContextPath() + "/";
    }

    public String getDirContenido() {
        return dirContenido;
    }

    public void setDirContenido(String dirContenido) {
        this.dirContenido = dirContenido;
    }

    public String getDirTemplate() {
        return dirTemplate;
    }

    public void setDirTemplate(String dirTemplate) {
        this.dirTemplate = dirTemplate;
    }
}
