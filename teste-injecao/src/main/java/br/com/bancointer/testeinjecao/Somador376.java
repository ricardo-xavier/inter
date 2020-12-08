package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador376")
public class Somador376 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
