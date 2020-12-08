package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1099")
public class Somador1099 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
