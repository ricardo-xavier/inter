package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1113")
public class Somador1113 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
