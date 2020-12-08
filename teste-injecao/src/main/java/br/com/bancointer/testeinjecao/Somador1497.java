package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1497")
public class Somador1497 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
