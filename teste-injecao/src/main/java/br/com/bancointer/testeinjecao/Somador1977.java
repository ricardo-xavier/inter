package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1977")
public class Somador1977 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
