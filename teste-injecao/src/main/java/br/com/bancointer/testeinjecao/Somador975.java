package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador975")
public class Somador975 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
