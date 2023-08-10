public class Veiculo{
  private String Marca;
  private String Cor;
  private String Placa;
  private int Ano;

  private Modelo modelo;

  // Getters
    public String getMarca() 
    {
      return Marca;
    }
    public String getCor() 
    {
      return Cor;
    }
    public String getPlaca() 
    {
      return Placa;
    }
    public int getAno() 
    {
      return Ano;
    }
      
    // Setters
    public void setMarca(String newMarca) 
    {
      this.Marca = newMarca;
    }
    public void setCor(String newCor) 
    {
      this.Cor = newCor;
    }
    public void setPlaca(String newPlaca) 
    {
      this.Placa = newPlaca;
    }
    public void setAno(int newAno) 
    {
      this.Ano = newAno;
    }
}
