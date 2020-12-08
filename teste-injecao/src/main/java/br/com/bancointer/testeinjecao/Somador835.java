package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador835")
public class Somador835 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
