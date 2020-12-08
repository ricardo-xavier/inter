package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador222")
public class Somador222 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
