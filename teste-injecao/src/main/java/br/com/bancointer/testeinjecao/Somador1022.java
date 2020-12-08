package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1022")
public class Somador1022 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
