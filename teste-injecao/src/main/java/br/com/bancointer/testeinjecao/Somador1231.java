package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1231")
public class Somador1231 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
