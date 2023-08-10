public class Seguro {
    private Boolean Vigencia;
    private float Valor;

    private Veiculo veiculo;
    private Cliente proprietario;
    private Cliente[] Assegurados;

    
    // Getters

    public Boolean getVigencia() 
    {
        return Vigencia;
    }
    public float getValor() 
    {
        return Valor;
    }
     
    // Setters

    public void setVigencia(Boolean newVigencia) 
    {
        this.Vigencia = newVigencia;
    }
    public void setValor(float newValor) 
    {
        this.valor = newValor;
    }
}
