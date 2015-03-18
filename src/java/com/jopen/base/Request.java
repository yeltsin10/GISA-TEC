package com.jopen.base;

import java.sql.Date;
import java.sql.Timestamp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

public class Request {

    private HttpServletRequest request = null;

    public Request(HttpServletRequest req) {
        request = req;
    }

    public String LeerString(String sNombre) {
        String oObjeto = request.getParameter(sNombre);
        if (oObjeto == null) {
            return "";
        } else if (oObjeto.equals("")) {
            return "";
        } else {
            return oObjeto;
        }
    }

    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch", "CallToPrintStackTrace"})
    public int LeerInt(String sNombre) {
        String oObjeto = request.getParameter(sNombre);
        if (oObjeto == null) {
            return 0;
        } else if (oObjeto.equals("")) {
            return 0;
        } else {
            try {
                return Integer.parseInt(oObjeto);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
    }

    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch", "CallToPrintStackTrace"})
    public double LeerDouble(String sNombre) {
        String oObjeto = request.getParameter(sNombre);
        if (oObjeto == null) {
            return 0;
        } else if (oObjeto.equals("")) {
            return 0;
        } else {
            try {
                return Double.parseDouble(oObjeto);
            } catch (Exception e) {
                e.printStackTrace();
                return 0.00;
            }
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public java.math.BigDecimal LeerBigDecimal(String sNombre) {
        String oObjeto = request.getParameter(sNombre);
        if (oObjeto == null) {
            return new BigDecimal(0);
        } else if (oObjeto.equals("")) {
            return new BigDecimal(0);
        } else {
            try {
                return new BigDecimal(oObjeto);
            } catch (Exception e) {
                e.printStackTrace();
                return new BigDecimal(0);
            }
        }
    }

    public HttpSession LeerSession() {
        HttpSession oObjeto = request.getSession();
        return oObjeto;
    }

    public Object LeerObjetoSession(String sNombre) {
        HttpSession hsSesion = request.getSession();
        Object oObjeto = null;
        if (this.ExisteEnSesion(sNombre)) {
            oObjeto = hsSesion.getAttribute(sNombre);
        }
        return oObjeto;
    }

    public boolean ExisteEnSesion(String sNombre) {
        HttpSession sSession = request.getSession();
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

    public Date LeerDate(String sNombre) throws Exception {
        String oObjeto = request.getParameter(sNombre);
        if (oObjeto == null) {
            throw new Exception("Error el parametro : " + sNombre + " No existe en Request. ");
        } else if (oObjeto.equals("")) {
            throw new Exception("Error el parametro : " + sNombre + " esta vacio. ");
        } else {
            return Date.valueOf(oObjeto);
        }

    }

    public Timestamp LeerTimestamp(String sNombre) throws Exception {
        String oObjeto = request.getParameter(sNombre);
        if (oObjeto == null) {
            throw new Exception("Error el parametro : " + sNombre + " No existe en Request. ");
        } else if (oObjeto.equals("")) {
            throw new Exception("Error el parametro : " + sNombre + " esta vacio. ");
        } else {
            return Timestamp.valueOf(oObjeto);
        }

    }
    
    public String LeerString(String sNombre, String sDefault) {
        String oObjeto = request.getParameter(sNombre);
        if (oObjeto == null) {
            return sDefault;
        } else if (oObjeto.equals("")) {
            return sDefault;
        } else {
            return oObjeto;
        }
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

}
