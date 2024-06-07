public class Materiais {
    private String material;
    private String tamanho;
    private String espessura;
    private float preco;
    
    public Materiais(){}

    public Materiais(String material, String tamanho, String espessura, float preco) {
        this.material = material;
        this.tamanho = tamanho;
        this.espessura = espessura;
        this.preco = preco;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEspessura() {
        return espessura;
    }

    public void setEspessura(String espessura) {
        this.espessura = espessura;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Materiais [material=" + material + ", tamanho=" + tamanho + ", espessura=" + espessura + ", preco="
                + preco + "]";
    }

    public String exibirDaddos() {
        return "\nMaterial: " + material + "\nTamanho: " + tamanho + "\nEspessura: " + espessura + "\nPreço: " + preco;
    }
    
}
