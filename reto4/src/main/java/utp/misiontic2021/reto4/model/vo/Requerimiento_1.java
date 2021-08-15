package utp.misiontic2021.reto4.model.vo;
// vo (values objets) CLASE DONDE SE DECLARA EL TIPO DE OBJETO CON EL QUE SE VA A TRABAJAR
public class Requerimiento_1 {
    // ATRIBUTOS
    private String fechaCompra;
    private String nombreProvedor;
    private String pagado;
    private Integer codigoCompra;

    // CONSTRUCTORES
    public Requerimiento_1(){};
    
    public Requerimiento_1(String fechaCompra, String nombreProvedor,Integer codigoCompra, String pagado){
        this.setFechaCompra(fechaCompra);
        this.setNombreProvedor(nombreProvedor);
        this.setPagado(pagado);
        this.setCodigoCompra(codigoCompra);
    }

    //GETTERS AND SETTERS
    public String getFechaCompra() {
        return fechaCompra;
    }
    public Integer getCodigoCompra() {
        return codigoCompra;
    }
    public void setCodigoCompra(Integer codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    public String getPagado() {
        return pagado;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
    public String getNombreProvedor() {
        return nombreProvedor;
    }
    public void setNombreProvedor(String nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
