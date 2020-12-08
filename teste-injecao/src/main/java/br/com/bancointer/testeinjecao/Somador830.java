package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador830")
public class Somador830 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
