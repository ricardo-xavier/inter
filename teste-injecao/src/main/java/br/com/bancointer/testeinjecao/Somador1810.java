package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1810")
public class Somador1810 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
