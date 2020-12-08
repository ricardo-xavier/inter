package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1257")
public class Somador1257 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
