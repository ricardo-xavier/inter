package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador781")
public class Somador781 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
