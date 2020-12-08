package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1675")
public class Somador1675 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
