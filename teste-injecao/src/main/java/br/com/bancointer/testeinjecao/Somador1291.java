package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1291")
public class Somador1291 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
