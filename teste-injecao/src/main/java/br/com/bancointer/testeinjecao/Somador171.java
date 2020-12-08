package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador171")
public class Somador171 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
