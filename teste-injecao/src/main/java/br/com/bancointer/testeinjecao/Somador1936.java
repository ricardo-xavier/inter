package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1936")
public class Somador1936 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
