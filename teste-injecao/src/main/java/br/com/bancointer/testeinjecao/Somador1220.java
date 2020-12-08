package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1220")
public class Somador1220 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
