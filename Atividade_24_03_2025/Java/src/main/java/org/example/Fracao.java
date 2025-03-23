package org.example;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) throw new IllegalArgumentException("Denominador não pode ser zero");

        // Garantir que o denominador seja sempre positivo
        if (denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }

        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private void simplificar() {
        int gcd = calcularMDC(Math.abs(numerador), denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    private int calcularMDC(int a, int b) {
        return b == 0 ? a : calcularMDC(b, a % b);
    }

    // Operações
    public Fracao somar(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) + (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) - (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outra) {
        return new Fracao(
                this.numerador * outra.numerador,
                this.denominador * outra.denominador
        );
    }

    public Fracao dividir(Fracao outra) {
        return new Fracao(
                this.numerador * outra.denominador,
                this.denominador * outra.numerador
        );
    }

    @Override
    public String toString() {
        return denominador == 1 ?
                String.valueOf(numerador) :
                numerador + "/" + denominador;
    }
}
