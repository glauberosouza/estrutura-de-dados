package isStack;

import java.util.Objects;

public class Veiculo {

    String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getVeiculo() {
        return marca;
    }

    public void setVeiculo(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Veiculo carro = (Veiculo) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + "]";
    }

}
