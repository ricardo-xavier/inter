package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1856")
public class Somador1856 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
