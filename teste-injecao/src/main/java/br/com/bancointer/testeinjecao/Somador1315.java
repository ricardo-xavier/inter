package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1315")
public class Somador1315 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
