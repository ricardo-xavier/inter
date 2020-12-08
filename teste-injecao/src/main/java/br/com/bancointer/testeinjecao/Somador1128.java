package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1128")
public class Somador1128 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
