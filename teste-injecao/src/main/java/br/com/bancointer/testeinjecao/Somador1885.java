package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1885")
public class Somador1885 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
