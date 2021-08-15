package utp.misiontic2021.reto4.model.vo;

public class Requerimiento_2 {
    // ATRIBUTOS
    private String fechaInicio;
    private String ciudad;
    private String constructora;
    private String nombreLider;
    private Integer codigoTipo;
    private Integer estrato;
    
    // CONSTRUCTORES
    public Requerimiento_2(){};
    
    public Requerimiento_2(String fechaInicio, String ciudad, String constructora, String nombreLider,Integer codigoTipo,Integer estrato){
        this.setFechaInicio(fechaInicio);;
        this.setCiudad(ciudad);;
        this.setConstructora(constructora);
        this.setNombreLider(nombreLider);
        this.setCodigoTipo(codigoTipo);
        this.setEstrato(estrato);
    }

    //GETTERS AND SETTERS
    public String getFechaInicio() {
        return fechaInicio;
    }
    public Integer getEstrato() {
        return estrato;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    public Integer getCodigoTipo() {
        return codigoTipo;
    }
    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    public String getNombreLider() {
        return nombreLider;
    }
    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
}
