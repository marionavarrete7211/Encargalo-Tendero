package mx.com.encargalo.tendero.Entidad;

public class mio_mdlOrdenesOrden {

    private int idOrden;
    private String odFechaPedido;
    private String perNombreCompleto;
    private String odEstado;
    private int idRepartidor;
    private String odHoraPedido;

    public String getRepNombres() {
        return repNombres;
    }

    public void setRepNombres(String repNombres) {
        this.repNombres = repNombres;
    }

    public String repNombres;

    public mio_mdlOrdenesOrden () {};
    public mio_mdlOrdenesOrden(int idOrden, String odFechaPedido, String perNombreCompleto, String odEstado, int idRepartidor, String repNombres, String odHoraPedido) {
        this.idOrden = idOrden;
        this.odFechaPedido = odFechaPedido;
        this.perNombreCompleto = perNombreCompleto;
        this.odEstado = odEstado;
        this.idRepartidor = idRepartidor;
        this.repNombres = repNombres;
        this.odHoraPedido = odHoraPedido;
    }

    public String getOdHoraPedido() {
        return odHoraPedido;
    }

    public void setOdHoraPedido(String odHoraPedido) {
        this.odHoraPedido = odHoraPedido;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public String getOdFechaPedido() {

        return odFechaPedido;
    }

    public void setOdFechaPedido(String odFechaPedido) {
        this.odFechaPedido = odFechaPedido;
    }

    public String getPerNombreCompleto() {
        return perNombreCompleto;
    }

    public void setPerNombreCompleto(String perNombreCompleto) {
        this.perNombreCompleto = perNombreCompleto;
    }

    public String getOdEstado() {
        return odEstado;
    }

    public void setOdEstado(String odEstado) {
        this.odEstado = odEstado;
    }
}