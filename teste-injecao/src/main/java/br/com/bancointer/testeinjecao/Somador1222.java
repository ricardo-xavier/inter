package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1222")
public class Somador1222 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
