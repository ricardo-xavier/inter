package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador94")
public class Somador94 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
