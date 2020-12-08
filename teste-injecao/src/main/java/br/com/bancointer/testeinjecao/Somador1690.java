package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1690")
public class Somador1690 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
