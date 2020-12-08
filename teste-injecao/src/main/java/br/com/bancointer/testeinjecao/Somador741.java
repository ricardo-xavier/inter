package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador741")
public class Somador741 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
