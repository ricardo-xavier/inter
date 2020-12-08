package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1771")
public class Somador1771 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
