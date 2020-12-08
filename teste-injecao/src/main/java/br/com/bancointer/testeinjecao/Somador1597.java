package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1597")
public class Somador1597 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
