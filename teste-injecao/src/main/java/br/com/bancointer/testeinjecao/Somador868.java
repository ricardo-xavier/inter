package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador868")
public class Somador868 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
