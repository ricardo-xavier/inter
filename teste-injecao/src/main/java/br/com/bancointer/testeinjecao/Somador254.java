package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador254")
public class Somador254 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
