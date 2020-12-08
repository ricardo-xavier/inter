package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1403")
public class Somador1403 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
