package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1057")
public class Somador1057 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
