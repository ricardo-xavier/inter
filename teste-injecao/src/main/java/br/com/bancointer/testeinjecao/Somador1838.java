package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1838")
public class Somador1838 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
