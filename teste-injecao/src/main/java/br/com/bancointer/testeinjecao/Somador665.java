package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador665")
public class Somador665 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
