package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador465")
public class Somador465 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
