package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1259")
public class Somador1259 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
